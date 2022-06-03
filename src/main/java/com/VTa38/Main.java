package com.VTa38;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList stringsLinkedList = new CustomLinkedList();

        // Проверка добавления в конец
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");

        // Проверка добавления в заданное место
        stringsLinkedList.add("Егор", 5);
        stringsLinkedList.add("Igor", 1);

        // Вывод на консоль
        stringsLinkedList.printAll();
        System.out.println("----------------------------------");
        stringsLinkedList.add("Igor", 21);
    }
}
