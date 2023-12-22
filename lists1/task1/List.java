package ru.mirea.lists1.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class List {
    private final ArrayList<Node> nodeList;

    public List() {
        nodeList = new ArrayList<>();
    }

    public void addNode() {
        Node node = new Node();
        node.readAttributes();
        nodeList.add(node);
        System.out.println("Элемент добавлен в картотеку.");
    }

    public void removeNode(int index) {
        if (index >= 0 && index < nodeList.size()) {
            nodeList.remove(index);
            System.out.println("Элемент удален из картотеки.");
        } else {
            System.out.println("Неверный индекс элемента.");
        }
    }

    public void clearList() {
        nodeList.clear();
        System.out.println("Картотека очищена.");
    }

    public boolean isEmpty() {
        return nodeList.isEmpty();
    }

    public void displayNode(int index) {
        if (index >= 0 && index < nodeList.size()) {
            nodeList.get(index).displayAttributes();
        } else {
            System.out.println("Неверный индекс элемента.");
        }
    }

    public void writeToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (Node node : nodeList) {
            writer.write(node.toString());
            writer.write("\n");
        }
        writer.close();
        System.out.println("Картотека записана в файл " + fileName);
    }

    public void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String name = tokenizer.nextToken();
            int age = Integer.parseInt(tokenizer.nextToken());

            Node node = new Node();
            node.setName(name);
            node.setAge(age);

            nodeList.add(node);
        }

        reader.close();
        System.out.println("Картотека считана из файла " + fileName);
    }
}
