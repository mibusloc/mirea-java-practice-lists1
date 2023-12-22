package ru.mirea.lists1.task2;

import java.util.Scanner;

class Node {
    private String name;
    private int age;
    private Node next;
    private Node prev;

    public Node() {
        next = null;
        prev = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }
}



