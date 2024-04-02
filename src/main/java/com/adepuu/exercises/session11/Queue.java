//package com.adepuu.exercises.session11;
//
//public class Queue {
//    /**
//     * Write a Java queue program that can scale dynamically
//     * <p>
//     * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
//     * <p>
//     * Notes:
//     * The program doesn't require a menu system; focus should be on data structure implementation.
//     * <p>
//     * Acceptance Criteria:
//     * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
//     * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
//     * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
//     * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
//     * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
//     */
//        class Node {
//            int data;
//            Node next;
//
//            Node(int data) {
//                this.data = data;
//                this.next = null;
//            }
//        }
//        Node head;
//
//        public void addAtBeginning (int newData) {
//            Node newNode = new Node(newData);
//            newNode.next = head;
//            head = newNode;
//
//        }
//
//        public int pop() {
//            if (head == null) {
//                System.out.println("Linked list is empty");
//                return -1; // Return -1 untuk linked list kosong
//            }
//
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//
//            int removedElement = lastNode.data;
//            return removedElement;
//        }
//
//        public void displayList() {
//            Node currentNode = head;
//            System.out.println("Linked List: ");
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " ");
//                currentNode = currentNode.next;
//            }
//            System.out.println();
//        }
//
//        public static void main(String[] args) {
//            Queue linkedList = new Queue();
//
//            linkedList.addAtBeginning(4);
//            linkedList.addAtBeginning(1);
//            linkedList.addAtBeginning(6);
//
//            linkedList.pop();
//
//            linkedList.displayList();
//        }
//}
