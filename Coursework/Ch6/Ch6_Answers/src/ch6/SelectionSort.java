package ch6;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] array = new int[15];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(100*Math.random()+1);
        }


        //String[] str = {"Zip","Hello","Lorem","Ipsum","Dolor","Sit","Amet"};

        output(array);
        sortAsc(array);
        System.out.println();
        output(array);

    }

    public static void swap(int[] arr,int fidx,int sidx) {
        if(fidx<arr.length && sidx<arr.length){
            int temp = arr[fidx];
            arr[fidx] = arr[sidx];
            arr[sidx] = temp;
        }
    }

    public static void output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
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

    public static void output(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }

}
