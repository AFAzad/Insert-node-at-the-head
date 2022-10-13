/*
Problem Statement
You are given a Singly linked list and an integer K. Your task is to insert the integer K at the head of the given linked list
*/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
//enter your code here
Node newNode = new Node(k);
    if(head == null)
    return newNode;

    else{
        newNode.next = head;
        head = newNode;
    }
    return head;


}