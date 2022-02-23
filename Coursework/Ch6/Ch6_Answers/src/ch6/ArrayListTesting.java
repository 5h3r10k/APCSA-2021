package ch6;

import java.util.ArrayList;

public class ArrayListTesting {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();

        int[] start = {0,0,2,0,4,0,6,0,8,0,10,0,12,0,14,0,16}; //change ONLY this
        String[] str = {"four","score","and","seven","years","ago","hello","hello","four"}; // or this

        for (int i = 0; i < start.length; i++) {
            array.add(start[i]);
        }

        for (int i = 0; i < str.length; i++) {
            strList.add(str[i]);
        }

        array.trimToSize();

        markLength4(strList);

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

    public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size()-2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i+1);
            list.set(i, a+b);
        }
        System.out.println(list);
    }

    public static void mystery4(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0,element+1);
        }
        System.out.println(list);
    }

    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size()-1;i+=2) {
            String temp = list.get(i+1);
            list.set(i+1, list.get(i));
            list.set(i, temp);
        }
        System.out.println(list);
    }

    public static void removeEvenLength(ArrayList<String> list) {
        int n = 0;
        while(n<list.size()){
            if(list.get(n).length()%2==0) list.remove(n);
            else n++;
        }
        System.out.println(list);
    }

    public static void doubleList(ArrayList<String> list) {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) out.add(list.get(i));
        }
        out.trimToSize();
        list = out;
        System.out.println(list);
    }

    public static void minToFront(ArrayList<Integer> list) {
        int min = list.get(0);
        for(int i:list) if(i<min) min = i;
        list.remove(list.indexOf(min));
        list.add(0, min);
        System.out.println(list);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        ArrayList<String> out = new ArrayList<String>();
        for(String s:list) if(out.indexOf(s)==-1) out.add(s);
        out.trimToSize();
        list = out;
        System.out.println(list);
    }

    public static void removeInRange(ArrayList<Integer> list, int val, int start, int stop) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(!(i>=start && i<stop &&list.get(i)==val)) out.add(list.get(i));
        }
        out.trimToSize();
        list = out;
        System.out.println(list);
    }

    public static void stutter(ArrayList<String> list, int k) {
        ArrayList<String> out = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < k; j++) {
                out.add(list.get(i));
            }
        }

        out.trimToSize();
        list = out;
        System.out.println(list);
    }

    public static void markLength4(ArrayList<String> list) {

        for (int i = 0;i<list.size();i++) {
            if(list.get(i).length()==4){
                list.add(i, "****");
                i++;
            }
        }

        System.out.println(list);
    }

}
