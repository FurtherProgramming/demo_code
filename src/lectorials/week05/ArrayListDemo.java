package lectorials.week05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);

//        System.out.println(list);
//        System.out.println(list.size());int
        Integer myInt = 1;
        list.remove(myInt);
//        list.remove(1);
        for(Integer i: list){
            System.out.println(i);
        }


        ArrayList<Printable> list2 = new ArrayList<>();

    }
}
