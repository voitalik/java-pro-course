public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public void add(String element) {
        if (head == null) {
            // Якщо колекція пуста на момент додавання елементу
            head = new Node(element);
            tail = head;
        } else {
            // Якщо у нас вже є елемент в колекції
            tail.next = new Node(element);
            tail = tail.next;
        }

        size++;
    }

    public String get(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException();

        if (i == size - 1) {
            // Якщо треба повернути останній елемент колекції, О(1)
            return tail.elem;
        }
        else {
            // Якщо треба повернути перший або будь-який інший елемент колекції, O(n)
            // Нульовий елемент повернеться одразу, O(1)
            Node n = head;
            for (int j = 0; j < i; j++) {
                n = n.next;
            }
            return n.elem;
        }
    }

    public static class Node {
        String elem;
        Node next;

        public Node(String elem) {
            this.elem = elem;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "elem='" + elem + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
