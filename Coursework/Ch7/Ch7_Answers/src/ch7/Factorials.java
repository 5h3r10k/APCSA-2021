package ch7;

public class Factorials {
    
    public static void main(String[] args) {
        
    }

    //using loops to find factorial of n
    public static int facLoop(int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    //using recursion to find factorial of n
    public static int facRecur(int n){
        if (n==0) return 1;
        return n*facRecur(n-1);
    }

}
