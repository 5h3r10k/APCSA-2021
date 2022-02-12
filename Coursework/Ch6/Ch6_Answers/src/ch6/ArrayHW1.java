package ch6;

public class ArrayHW1 {
    
    public static void main(String[] args) {
        
        //declaring Array
        int[] nums = new int[10];

        //random values
        // use inclusive values
        int min = 1;
        int max = 100;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)((max-min+1)*Math.random()+min);
        }

        //using all the methods

        System.out.println("Original array:");
        output(nums);
        System.out.println();
        System.out.println("Average: "+average(nums));
        System.out.println();
        System.out.println("Min value: "+min(nums));
        System.out.println();
        System.out.println("Max value: "+max(nums));
        System.out.println();
        System.out.println("Swapping index 0 and 7");
        output(swap(nums, 0, 7));
        System.out.println();
        System.out.println("Max first, min last");
        output(maxFirstMinLast(nums));
        System.out.println();
        System.out.println("# of even values in array: "+countEven(nums));
        System.out.println();
        System.out.println("# of odd values in array: "+countOdd(nums));
    }

    public static void output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }

    public static double average(int[] arr) {
        double arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum+=arr[i];
        }
        return arrSum/arr.length;
    }

    public static int min(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) minVal = arr[i];
        }
        return minVal;
    }

    public static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
        }
        return maxVal;
    }

    public static int[] swap(int[] arr,int fidx,int sidx) {
        if(fidx<arr.length && sidx<arr.length){
            int temp = arr[fidx];
            arr[fidx] = arr[sidx];
            arr[sidx] = temp;
            return arr;
        }
        return null;
    }

    private static int find(int[] arr,int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    public static int[] maxFirstMinLast(int[] arr) {
        int[] out = swap(arr, find(arr, max(arr)), 0);
        out = swap(out, find(out, min(out)), out.length-1);
        return out;
    }

    public static int countEven(int[] arr) {
        int out = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) out++;
        }
        return out;
    }

    public static int countOdd(int[] arr) {
        int out = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0) out++;
        }
        return out;
    }

}
