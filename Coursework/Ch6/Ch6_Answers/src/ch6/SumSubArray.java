package ch6;

import ch4.Point;

public class SumSubArray {

    public static void main(String[] args) {

        // -------- SETUP INITIAL ARRAY

        int[][] arr = new int[5][5];

        int num = 1;

        for (int[] i : arr) {
            for (int j = 0; j<i.length;j++) {
                i[j] = num;
                num++;
            }
        }

        Arrays2DAssignment.output2D(arr);
        System.out.println("------------------------");

        // -------- TESTING
        
        int size = 2;

        Arrays2DAssignment.output2D(subSumMax(arr, size));


    }

    public static int[][] createSubArray(Point pt,int s, int[][] a){
        int x = (int)pt.getX();
        int y = (int)pt.getY();

        int[][] out = new int[s][s];

        for(int i = y; i<y+s; i++){
            for (int j = x; j < x+s; j++) {
                out[i-y][j-x] = a[i][j];
            }
        }

        return out;


    }

    public static int[][] subSumMax(int[][] a, int s){

        int[][] max = {{0}};
        int[][] cur;

        for(int i = 0;i<a.length-s+1;i++){
            for(int j = 0;j<a[0].length-s+1;j++){
                cur = createSubArray(new Point(j,i), s, a);
                if(sumArray(cur)>sumArray(max)) max = cur;
            }
        }

        return max;
    }

    private static int sumArray(int[][] a){
        int sum=0;
        for(int[] i:a){
            for(int j:i) sum+=j;
        }
        return sum;
    }

}
