package aug0308;

public class Main {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(null, 10, null);
        Node<Integer> node2 = new Node<>(node1, 20, null);
        node1.next = node2;
        Node<Integer> node3 = new Node<>(node2, 30, null);
        node2.next = node3;

        Node<Integer> currentNode = node1;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public static class Node<T> {
        Node<T> prev;
        Node<T> next;
        T value;

        public Node(Node<T> prev, T value, Node<T> next) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}
