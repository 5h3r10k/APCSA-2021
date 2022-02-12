package ch6;

public class InsertionSort {
    
    public static void main(String[] args) {

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

}
