package ru.mirea.lists1.task1;

import java.util.Scanner;

public class Node {
    private String name;
    private int age;

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
}





