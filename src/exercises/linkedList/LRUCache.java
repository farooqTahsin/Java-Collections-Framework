package exercises.linkedList;

/*
    Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
    Implement the LRUCache class:
        - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
        - int get(int key) Return the value of the key if the key exists, otherwise return -1.
        - void put(int key, int value) Update the value of the key if the key exists. Otherwise,
          add the key-value pair to the cache. If the number of keys exceeds the capacity from
          this operation, evict the least recently used key.

    The functions get and put must each run in O(1) average time complexity.
*/

import java.util.*;
class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    private int capacity;
    private Map<Integer, Node> cache;
    private Node oldest;
    private Node latest;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.oldest = new Node(0, 0);
        this.latest = new Node(0, 0);
        this.oldest.next = this.latest;
        this.latest.prev = this.oldest;
    }
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insertToHead(node);
            return node.val;
        }
        return -1;
    }
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insertToHead(Node node) {
        Node prev = latest.prev;
        Node next = latest;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insertToHead(newNode);

        if (cache.size() > capacity) {
            Node lru = oldest.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */