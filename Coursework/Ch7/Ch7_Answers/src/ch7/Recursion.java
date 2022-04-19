package ch7;

import java.util.Scanner;

public class Recursion {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        revDigs(123456);
    }

    //uses recursion to find factorial of n
    public static int fac(int n){
        if (n==0) return 1;
        return n*fac(n-1);
    }

    //uses recursion to find the sum of the first n natural numbers
    public static int sum(int n){
        if (n==0) return 0;
        return n+sum(n-1);
    }

    //uses recursion to find the sum of all numbers from n to 100
    public static int sumTo100(int n){
        if (n==100) return 100;
        return n+sumTo100(n+1);
    }

    //uses recursion to find the sum of all numbers from n to m
    public static int sum(int n, int m){
        if (n==m) return m;
        return n+sum(n+1,m);
    }

    // stacks words using recursion
    public static void stackWords(){
        String word = in.nextLine();
        if(word.equals(".")){
            System.out.println();
        }else{
            stackWords();
        }
        System.out.println(word);
    }

    
    public static void drawLine(int num){
        if(num==0){
            System.out.println("That's all folks!");
        }else{
            for(int i = 0;i<num;i++){
                System.out.print("*");
            }
            System.out.println();
            drawLine(num-1);
        }
    }

    //revDigs: reverses the digits of an integer
    public static void revDigs(int n){
        System.out.print(n%10);
        if(n%10<10 && n%10>0){
            revDigs(n/10);
        }

    }


    //fib: returns the nth Fibonacci number
    public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    

}
