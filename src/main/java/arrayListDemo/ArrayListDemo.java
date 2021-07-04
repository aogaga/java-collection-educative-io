package arrayListDemo;

import java.util.*;

public class ArrayListDemo {


    public static void main(String args[]){
        howToCreateArrayList();
    }
    public static void howToCreateArrayList(){
        List<String> list = new ArrayList<>();

        list.add("favour");
        list.add("Sam");
        list.add("charles");
        list.add("Rex");

        list.remove(2);
     //   Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
//        for(String x : list){
//            System.out.println(x);
//        }
//
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }


        // using the iterator

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
