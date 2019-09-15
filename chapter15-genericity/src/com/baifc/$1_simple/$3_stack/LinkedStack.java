package com.baifc.$1_simple.$3_stack;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$1_simple.$3_stack
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 这个例子使用了末端哨兵来判断LinkedStack是否为空
 */
public class LinkedStack<T> {

    private  class Node {
        T item;
        Node next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    // 末端哨兵
    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
