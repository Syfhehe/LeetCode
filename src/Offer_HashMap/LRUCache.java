package Offer_HashMap;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

  class ListNode {
    public int key;
    public int value;
    public ListNode prev;
    public ListNode next;
    public ListNode(int k, int v) {
      key = k;
      value = v;
    }
  }

  private ListNode head;
  private ListNode tail;
  Map<Integer, ListNode> map;
  int capacity;

  public LRUCache(int cap) {
    map = new HashMap<Integer, ListNode>();
    head = new ListNode(-1, -1);
    tail = new ListNode(-1, -1);
    capacity = cap;
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    ListNode node = map.get(key);
    if (node == null) {
      return -1;
    }
    moveToTail(node, node.value);
    return node.value;
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      moveToTail(map.get(key), value);
    } else {
      if (map.size() == capacity) {
        ListNode tobeDelete = head.next;
        deleteNode(tobeDelete);
        map.remove(tobeDelete.key);
      }
      ListNode newNode = new ListNode(key, value);
      insertToTail(newNode);
      map.put(key, newNode);
    }
  }

  private void moveToTail(ListNode node, int value) {
    deleteNode(node);
    node.value = value;
    insertToTail(node);
  }

  private void deleteNode(ListNode node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  private void insertToTail(ListNode node) {
    tail.prev.next = node;
    node.prev = tail.prev;
    node.next = tail;
    tail.prev = node;
  }

}
