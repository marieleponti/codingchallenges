import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Test {

    public static ArrayList<String> readFile () throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        File file = new File("C:\\Users\\lumaf\\OneDrive\\Desktop\\CTCI\\people.txt");
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            list.add(s.next());
        }
        return list;
    }

    public static ArrayList<People> getListOfObjects() throws IOException, ClassNotFoundException {
        ArrayList<People> myList = new ArrayList<People>();
        ArrayList<String> list = readFile();
        for (int i = 0; i < list.size(); i+= 2){
            People p = new People(list.get(i), Integer.parseInt(list.get(i+1)));
            myList.add(p);
        }
        return myList;
    }

    public static void test(){
        Comparator<People> compareById_1 = Comparator.comparing(e -> e.getNum()); // function interface
        Comparator<People> comparableById_2 = (People o1, People o2) -> o1.getNum() - o2.getNum();
        Comparator<People> compareByName = Comparator.comparing(e->e.getName());
    }

//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ArrayList<People> people = getListOfObjects();
//        for (People p : people){
//            System.out.println(p);
//        }
//        System.out.println("sort");
//        Collections.sort(people);
//        for (People p : people){
//            System.out.println(p);
//        }
//    }
}
