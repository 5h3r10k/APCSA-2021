package ch6;

public class ArrayHW2 {
    
    public static void main(String[] args) {
        
        int arrayLength = 20;
        int numSame = 0;

        int[] a = new int[arrayLength];
        int[] b = new int[arrayLength];

        int min = 1;
        int max = 100;


        System.out.println("i"+"\t"+"a[i]"+"\t"+"b[i]"+"\t"+"same?");
        System.out.println("----"+"\t"+"----"+"\t"+"----"+"\t"+"----");

        for (int i = 0; i < arrayLength; i++) {
            a[i] = (int)((max-min+1)*Math.random()+min);
            b[i] = (int)((max-min+1)*Math.random()+min);
            System.out.println(i+"\t"+a[i]+"\t"+b[i]+"\t"+((a[i]==b[i])?"TRUE":""));
            if(a[i]==b[i]) numSame++;
        }
        
        System.out.println("----"+"\t"+"----"+"\t"+"----"+"\t"+"----");
        System.out.println("Number of corresponding elements: "+numSame);

    }

    public static void output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }

}
