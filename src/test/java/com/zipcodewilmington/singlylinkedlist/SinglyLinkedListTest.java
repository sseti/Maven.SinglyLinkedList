package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    Node head = null;

    public class Node{
        int element;
        Node nextElement;
        Node(int d){ element = d;}
    }

    public void add(int data) {
        Node current = head;
        if(current == null){
            head = new Node(data);
        }
        else {
            while(current.nextElement != null){
                current = current.nextElement;
            }
            current.nextElement = new Node(data);
        }
        public void remove(int data) {
            Node current = head;
            if (head.element == data) {
                head = head.nextElement;
            }
            while (current.nextElement != null) {
                if (current.nextElement.element == data) { current.nextElement = current.nextElement.nextElement; }
                current = current.nextElement;
            }
    }

