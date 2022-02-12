package ch6;

public class ArrayHW3 {
    
    public static void main(String[] args) {
        
        //declaring Array
        int[] nums = new int[100];

        //random values
        // use inclusive values
        int min = 1;
        int max = 100;

        // frequency array
        String[] freq = {"","","","","","","","","",""};
        String marker = "*";

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)((max-min+1)*Math.random()+min);
            freq[(nums[i]-1)/10]+=marker;
        }

        System.out.println("Original array: ");
        System.out.println();
        outputTenByTen(nums);
        System.out.println();
        System.out.println();
        System.out.println("Frequency chart:");
        System.out.println();
        
        for (int i = 0; i < freq.length; i++) {
            System.out.print(+(1+i*10)+"-"+((i+1)*10)+"|");
            System.out.print("\t");
            System.out.println(freq[i]);
        }


    }

    public static void outputTenByTen(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%10==0 && i>0) System.out.println();
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}
