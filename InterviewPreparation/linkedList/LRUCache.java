package InterviewPreparation.linkedList;

import java.util.HashMap;
import java.util.Map;

/*
Doubly linked list, maintain most recently used element in front and least recently used element in back.
Refer(x) {
    look for x in HashTable.
    (a) If found(hit), find the reference of the node in DLL.
    (b) if not found(miss) :
        (i) insert a new node at the front of DLL.
        (ii) insert an entry into the HashTable.
}
Hit : O(1)
Miss : O(1)
 */
public class LRUCache {
    class Node {
        Node prev,next;
        int key,value;
        Node(int _key,int _value) {
            key = _key;
            value = _value;
        }
    }
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer,Node> map = new HashMap<>();
    int capacity;
    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else {
            return -1;
        }
    }
    public void put(int key,int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        //leetcode
        Node node = new Node(key,value);
        map.put(key,node);
        insert(node);

        if (map.size() > capacity) {
            Node nodeToDelete = head.next;
            remove(nodeToDelete);
            map.remove(nodeToDelete.key);
        }
    }
    public void insert(Node node) {
        Node previousEnd = tail.prev;
        previousEnd.next = node;
        node.prev = previousEnd;
        node.next = tail;
        tail.prev = node;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
