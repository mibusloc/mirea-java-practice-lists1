package ru.mirea.lists1.task3;

class List {
    Node head;

    List() {
        head = null;
    }

    void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        newNode.next = head;
    }

    void deleteNode(String nameToDelete) {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        Node previous = null;

        while (!current.name.equals(nameToDelete)) {
            if (current.next == head) {
                System.out.println("Элемент с именем " + nameToDelete + " не найден.");
                return;
            }
            previous = current;
            current = current.next;
        }

        if (current == head && current.next == head) {
            head = null;
        } else if (current == head) {
            head = current.next;
        } else {
            previous.next = current.next;
        }

        System.out.println("Элемент с именем " + nameToDelete + " удален.");
    }

    void clearList() {
        head = null;
        System.out.println("Список очищен.");
    }

    boolean isEmpty() {
        return head == null;
    }

    void displayList() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node temp = head;
        do {
            temp.displayAttributes();
            temp = temp.next;
        } while (temp != head);
    }
}
