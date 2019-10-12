/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author nafees
 */
class Node {

    public int data;
    public Node next;
}

public class QueueImpl {

    Node head = null;

    public void enque(int val) {
        Node temp = new Node();
        temp.data=val;
        temp.next=null;
        if (head == null) {
            head = temp;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }

    public int dequeue() {
        if (head == null) {
            return 0;
        }

        Node ptr = head;
        head = head.next;

        return ptr.data;

    }
    public void traverse(){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        QueueImpl queueImpl = new QueueImpl();
        for (int i = 0; i < 5; i++) {
            int val = sc.nextInt();

            queueImpl.enque(val);
        }
        System.out.println(queueImpl.dequeue());
        queueImpl.traverse();
    }

}
