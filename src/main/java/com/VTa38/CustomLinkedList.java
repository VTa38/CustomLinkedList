package com.VTa38;

public class CustomLinkedList {

    private Node first;
    private Node last;
    private static int count=0;

    public CustomLinkedList() {
        first = new Node(null,null,null);
        last = new Node(null,null,null);

        first.next = last;
        last.prev = first;
    }


    public void add(String addChar){

        Node newNode;
        Node beforeThis = last.prev;

        newNode = new Node(beforeThis, addChar, last);

        beforeThis.next = newNode;
        last.prev = newNode;
        count++;
    }


    public void printAll(){
        if(first.next!=last){

            Node printElement = first.next;
            while ((printElement.element)!=null){
                System.out.println(printElement.element);
                printElement = printElement.next;
            }
        } else{
            System.out.println("In linked list no elements");
        }
    }


    public String get(int index){
        int i = 0;
        Node searchEl = first.next;
        while (i <= index){
            if(i == index-1){
                return searchEl.element;
            } else {
                searchEl = searchEl.next;
                i++;
            }
        }
        return "Have some problem";
    }

    public void add(String addElement, int index){
        if(index>count){
            add(addElement); // or   System.out.println("Index out of range");
            return;
        }
        int i = 0;
        Node searchEl = first;
        Node newNode;
        while (i<=index){

            if(i==index-1){

                newNode = new Node(searchEl,addElement,searchEl.next);
                searchEl.next.prev = newNode;
                searchEl.next = newNode;
                return;

            } else {

                searchEl = searchEl.next;
                i++;
            }
        }
        count++;
    }

    private static class Node {
        private Node prev;
        private String element;
        private Node next;

        Node(Node prev, String element, Node next){
            this.prev= prev;
            this.element = element;
            this.next = next;
        }
    }
}