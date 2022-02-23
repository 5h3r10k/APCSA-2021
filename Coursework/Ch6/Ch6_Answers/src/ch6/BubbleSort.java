package ch6;

public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] vals = new int[15];
        fillRandomInt(vals, 1, 50);

        String[] str = {"Zip","Hello","Lorem","Ipsum","Dolor","Sit","Amet","Bob","Allen","Soup","Mary","George"};

        output(bubbledAsc(vals));
        System.out.println();
        output(bubbledDesc(vals));
        System.out.println();
        output(bubbledAsc(str));
        System.out.println();
        output(bubbledDesc(str));


    }

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

    public static void fillRandomInt(int[] arr,int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)((max-min+1)*Math.random()+min);
        }
    }

    public static int[] bubbledAsc(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        return arr;

    }

    public static int[] bubbledDesc(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        return arr;

    }

    public static String[] bubbledAsc(String[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        return arr;

    }

    public static String[] bubbledDesc(String[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                if(arr[j].compareTo(arr[j+1])<0){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        return arr;

    }


}