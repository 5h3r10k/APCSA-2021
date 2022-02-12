package ch6;

import java.util.Scanner;

public class SortMenu {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int typeChoice,orderChoice,sortChoice,choice;

        // go into SortMenu

        while(true){

            //init num array and string array
            int[] array = new int[10];
        
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(100*Math.random()+1);
            }

            String[] str = {"Zip","Hello","Lorem","Ipsum","Dolor","Sit","Amet","Bob","Allen","Soup","Mary","George"};

            System.out.println("----------------------------------------------------------------");

            System.out.println("Integer array: ");
            output(array);
            System.out.println();

            System.out.println("String array: ");
            output(str);
            System.out.println();

            System.out.println("Select Integer (0) or String (1): ");
            typeChoice = in.nextInt();

            System.out.println("Select Ascending (0) or Descending (1): ");
            orderChoice = in.nextInt();

            System.out.println("Select Selection (0) or Insertion sort (1): ");
            sortChoice = in.nextInt();

            if(typeChoice==0 && orderChoice==0 && sortChoice==0){
                sortAsc(array);
                output(array);
            }else if(typeChoice==0 && orderChoice==0 && sortChoice==1){
                output(insertSortAsc(array));
            }else if(typeChoice==0 && orderChoice==1 && sortChoice==0){
                sortDesc(array);
                output(array);
            }else if(typeChoice==0 && orderChoice==1 && sortChoice==1){
                output(insertSortDesc(array));
            }else if(typeChoice==1 && orderChoice==0 && sortChoice==0){
                sortAZ(str);
                output(str);
            }else if(typeChoice==1 && orderChoice==0 && sortChoice==1){
                output(insertSortAZ(str));
            }else if(typeChoice==1 && orderChoice==1 && sortChoice==0){
                sortZA(str);
                output(str);
            }else if(typeChoice==1 && orderChoice==1 && sortChoice==1){
                output(insertSortZA(str));
            }

            System.out.println("\n");

            System.out.println("Repeat(0) or quit(1)?");
            choice = in.nextInt();

            if(choice==1) break;

            
        }
        
        in.close();

    }

    //output methods

    public static void output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }

    public static void output(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }

    //insertion sort methods

    public static int[] insertSortAsc(int[] og){
        
        int k, j;
        int[] out = og;
        for(int i = 1; i<out.length;i++){

            k = out[i];
            j = i-1;

            while(j>=0 && k<out[j]){
                out[j+1]=out[j];
                j--;
            }

            out[j+1] = k;

        }

        return out;

    }

    public static int[] insertSortDesc(int[] og){
        
        int k, j;
        int[] out = og;
        for(int i = 1; i<out.length;i++){

            k = out[i];
            j = i-1;

            while(j>=0 && k>out[j]){
                out[j+1]=out[j];
                j--;
            }

            out[j+1] = k;

        }

        return out;

    }

    public static String[] insertSortZA(String[] og){
        
        String k; 
        int j;
        String[] out = og;

        for(int i = 1; i<out.length;i++){

            k = out[i];
            j = i-1;

            while(j>=0 && k.compareTo(out[j])>0){
                out[j+1]=out[j];
                j--;
            }

            out[j+1] = k;

        }

        return out;

    }

    public static String[] insertSortAZ(String[] og){
        
        String k; 
        int j;
        String[] out = og;

        for(int i = 1; i<out.length;i++){

            k = out[i];
            j = i-1;

            while(j>=0 && k.compareTo(out[j])<0){
                out[j+1]=out[j];
                j--;
            }

            out[j+1] = k;

        }

        return out;

    }

    // selection sort methods

    public static void swap(int[] arr,int fidx,int sidx) {
        if(fidx<arr.length && sidx<arr.length){
            int temp = arr[fidx];
            arr[fidx] = arr[sidx];
            arr[sidx] = temp;
        }
    }

    public static int findMinIndex(int[] a,int start) {
        int minVal = a[start];
        int minIdx = start;
        for (int i = start+1; i < a.length; i++) {
            if(a[i]<minVal){
                minVal=a[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIndex(int[] a,int start) {
        int maxVal = a[start];
        int maxIdx = start;
        for (int i = start+1; i < a.length; i++) {
            if(a[i]>maxVal){
                maxVal=a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void selectionSort(int[] a, int start){

        swap(a,start,findMinIndex(a, start));

    }

    public static void sortAsc(int[] z){

        for(int j = 0;j<z.length;j++){
            selectionSort(z, j);
        }

    }

    public static void sortDesc(int[] z){

        for(int j = 0;j<z.length;j++){
            swap(z,j,findMaxIndex(z, j));
        }

    }

    public static void sortAZ(String[] s){
        
        for (int i = 0; i < s.length; i++) {
            swap(s,i,findMinIndex(s, i));
        }

    }

    public static void sortZA(String[] s){
        
        for (int i = 0; i < s.length; i++) {
            swap(s,i,findMaxIndex(s, i));
        }

    }


    public static int findMinIndex(String[] a,int start) {
        String minVal = a[start];
        int minIdx = start;
        for (int i = start+1; i < a.length; i++) {
            if(minVal.compareTo(a[i])>0){
                minVal=a[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIndex(String[] a,int start) {
        String maxVal = a[start];
        int maxIdx = start;
        for (int i = start+1; i < a.length; i++) {
            if(maxVal.compareTo(a[i])<0){
                maxVal=a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void swap(String[] arr,int fidx,int sidx) {
        if(fidx<arr.length && sidx<arr.length){
            String temp = arr[fidx];
            arr[fidx] = arr[sidx];
            arr[sidx] = temp;
        }
    }

}
