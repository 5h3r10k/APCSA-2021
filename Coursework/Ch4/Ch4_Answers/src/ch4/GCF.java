package ch4;

public class GCF {
    
    public static void main(String[] args) {
        System.out.println(gcf(100, 250)); //just an example
    }

    public static double gcf(double n1,double n2){
        /**
         * @param n1 the first number to compare for a GCF
         * @param n2 the second number to compare with n1 for a GCF
         * @return GCF of n1 and n2 as a double
         */

        for(double i=Math.min(n1, n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }

        return -1;
    }

}
