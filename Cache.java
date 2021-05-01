package for_CTCI;
import java.util.HashMap;

public class Cache {
    HashMap<Integer, String> map;
    int maxSize;
    int currentSize;
    MyLinkedList list;

    public Cache() {
        map = new HashMap<>();
        maxSize = 0;
        currentSize = 0;
        list = null;
    }

    public Cache(int capacity) {
        map = new HashMap<>();
        maxSize = capacity;
        currentSize = 0;
        list = new MyLinkedList();
    }

    public void insert(int theKey, String theValue){
        if (!map.containsKey(theKey)){
            if (currentSize >= maxSize){
                // eject LRU -> remove last node in LL and remove from map
                int keyToRemove = list.removeFromEndLL();
                removeFromMap(keyToRemove);
            }
            map.put(theKey, theValue);
            list.insertAtHeadLL(theKey, theValue);
            this.currentSize++;
        } else {
            // move element to front of list
            list.moveToFront(theKey, theValue);
        }

    }

    public void printElements(){
        list.printLL();
    }

    private void removeFromMap(int theKey){
        if (map.containsKey(theKey))
            map.remove(theKey);
    }

    private class MyLinkedList {
        private Node head;
        private Node tail;

        private class Node{
            int key;
            String value;
            Node prev;
            Node next;

            private Node() {
                key = 0;
                value = "";
                prev = null;
                next = null;
            }

            private Node(int k, String v) {
                key = k;
                value = v;
                prev = null;
                next = null;
            }
        }
        private int removeFromEndLL(){
            if (tail != null){
                if (head == tail){
                    head = null;
                    tail = null;
                } else {
                    int getKey = tail.key;
                    tail.prev.next = null;
                    tail = tail.prev;
                    return getKey;
                }
            }
            return -1;
        }

        private void insertAtHeadLL(int theKey, String theValue){
            Node myNode = new Node(theKey, theValue);
            if (head == null){
                head = myNode;
                tail = myNode;
            } else {
                myNode.next = head;
                head.prev = myNode;
                head = myNode;
            }
        }

        private void moveToFront(int theKey, String theValue){
            Node marker = new Node();
            marker = head;
            if (marker.key != theKey && marker.value != theValue){
                while (marker.next != null){
                    marker = marker.next;
                    if (marker.key == theKey && marker.value == theValue){
                        marker.prev.next = marker.next;
                        marker.next.prev = marker.prev;
                    }
                }
                insertAtHeadLL(theKey, theValue);
            }
        }

        private void printLL(){
            Node marker = new Node();
            marker = head;
            System.out.println(marker.value);
            while (marker.next != null){
                marker = marker.next;
                System.out.println(marker.value);
            }
        }
    }
}

