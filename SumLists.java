import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/** Given two linked lists of digits, sum the numbers.
 * e.g. input: ->6->1->7, ->9->1
 * output: ->5->3->7 (735 = 716 + 19)**/

public class SumLists {
    public static MyLinkedList<Integer> sumLists(MyLinkedList<Integer> list1, MyLinkedList<Integer> list2){
        MyLinkedList<Integer> result = new MyLinkedList<Integer>();
        int remainder = 0;
        int tempSum = 0;
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++){
            tempSum = list1.get(i) + list2.get(i) + remainder;
            result.addAtEnd(tempSum % 10);
            remainder = tempSum/10;
        }
        int dif = 0;
        if (list1.size() < list2.size()){
            dif = list2.size() - list1.size();
            for (int i = list1.size(); i < list2.size(); i++){
                result.addAtEnd(list2.get(i));
            }
        } else if (list1.size() > list2.size()){
            dif = list1.size() - list2.size();
            for (int i = list2.size(); i < list1.size(); i++){
                result.addAtEnd(list1.get(i));
            }
        }
        return result;
    }

//    public static void main(String[] args){
//        MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
//        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
//        list1.addAtEnd(6);
//        list1.addAtEnd(1);
//        list1.addAtEnd(7);
//        list2.addAtEnd(9);
//        list2.addAtEnd(1);
//        //list2.addAtEnd(2);
//        MyLinkedList<Integer> result = sumLists(list1, list2);
//        System.out.print("list 1: ");
//        for (int i = list1.size() - 1; i >= 0; i--){
//            System.out.print(list1.get(i));
//        }
//        System.out.println();
//        System.out.print("list 2: ");
//        for (int i = list2.size() - 1; i >= 0; i--){
//            System.out.print(list2.get(i));
//        }
//        System.out.println();
//        System.out.print("result: ");
//        for (int i = result.size() - 1; i >= 0; i--){
//            System.out.print(result.get(i));
//        }
//    }
}
