package ch6;

import java.util.ArrayList;

public class Testing {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();

        int[] start = {-1,3,28,17,9,33};

        for (int i = 0; i < start.length; i++) {
            array.add(start[i]);
        }

        array.trimToSize();

        mystery2(array);

    }

    public static void mystery1(ArrayList<Integer> list) {
        
        for (int i = list.size()-1; i > 0; i--) {
            if(list.get(i)<list.get(i-1)){
                int element = list.get(i);
                list.remove(i);
                list.add(0,element);
            }
        }

        System.out.println(list);

    }

    public static void mystery2(ArrayList<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if(i%2==0){
                list.add(list.get(i));
            }else{
                list.add(0,list.get(i));
            }
        }

        System.out.println(list);
    }

    
    

}
