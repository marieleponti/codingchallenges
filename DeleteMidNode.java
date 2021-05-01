public class DeleteMidNode {

    public static class MyLinkedList{
        private class Node{
            int data;
            Node next;

            Node (int d){
                data = d;
            }
        }

        Node head;
        Node tail;
        int size = 0;

        public MyLinkedList() {
            head = null;
            tail = null;
        }

        public void insertAtEnd(int d){
            Node node = new Node(d);
            if (head == null){
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            size++;
        }

        public void deleteMidNode(){
            if (head == null) return;
            Node slow = head;
            Node fast = head;
            Node holder = head;
            if (fast.next == null){return;} // list has only one element
            while(fast.next != null && fast.next.next != null){
                holder = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
            // now fast is at end and slow is halfway, and holder is one before middle
            holder.next = slow.next;
        }

        public void print(){
            Node walker = head;
            while (walker != null){
                System.out.print(walker.data + " ");
                walker = walker.next;
            }
            System.out.println();
        }
    }

//    public static void main(String[] args){
//        MyLinkedList list = new MyLinkedList();
//        list.insertAtEnd(2);
//        System.out.println("List 0------------------");
//        list.print();
//        list.deleteMidNode();
//        System.out.println("List 0 after deleteMidNode()------------------");
//        list.print();
//
//        MyLinkedList list1 = new MyLinkedList();
//        for (int i = 1; i < 6; i++){
//            list1.insertAtEnd(i);
//        }
//        System.out.println("List 1------------------");
//        list1.print();
//        list1.deleteMidNode();
//        System.out.println("List 1 after deleteMidNode()------------------");
//        list1.print();
//
//        MyLinkedList list2 = new MyLinkedList();
//        for (int i = 1; i < 7; i++){
//            list2.insertAtEnd(i);
//        }
//        System.out.println("List 2------------------");
//        list2.print();
//        list2.deleteMidNode();
//        System.out.println("List 2 after deleteMidNode()------------------");
//        list2.print();
//    }
}
