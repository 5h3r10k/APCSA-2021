package ch6;

/*
    * HW-2D arrays, For this assignment you need to write and test code for
    * each of the following methods. Make sure to test code for each method as
    * you are working through these methods. This will be a graded assessment.
    * Please make sure to email yourself this code as you will be using this
    * code in order to do next set of programs.
*/



public class Arrays2DAssignment {

    // Use this method to keep testing every method as you write them.

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        initColumn(arr, 1, 10);
        output2D(arr);

    }

    /*
     * 
     * #1 This method will initialize N in row major order with the integer
     * 
     * values in range start-end inclusive. Precondition: end is greater than
     * 
     * start
     * 
     */

    public static void initRow(int[][] N, int start, int end) {

        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = (int) ((end - start + 1) * Math.random() + start);
            }
        }

    }

    /*
     * 
     * #2 This method will initialize N in column major order with the integer
     * 
     * values in range start-end inclusive. Precondition: end is greater than
     * 
     * start
     * 
     */

    public static void initColumn(int[][] N, int start, int end) {

        for (int i = 0; i < N[0].length; i++) {
            for (int j = 0; j < N.length; j++) {
                N[j][i] = (int) ((end - start + 1) * Math.random() + start);
            }
        }

    }

    /*
     * 
     * #3 Outputs N in row by column format, with all row elements on the same
     * 
     * line separated by tabs.Example 2 4 7 4 7 0
     * 
     */

    public static void output2D(int[][] N) {

        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                System.out.print(N[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

    /*
     * 
     * #4 Returns an int array of size N.length. Each element of this array will
     * 
     * represent the sum of all the elements of corresponding row of the 2D
     * 
     * input array N.
     * 
     */

    public static int[] sumRow(int[][] N) {

        int[] rowSum = new int[N.length];
        int sum;

        for (int i = 0; i < rowSum.length; i++) {
            sum = 0;
            for (int j = 0; j < N[i].length; j++) {
                sum+=N[i][j];
            }
            rowSum[i] = sum;
        }

        return rowSum;

    }

    /*
     * 
     * #5 Returns an int array of size N[0].length. Each element of this array
     * 
     * will represent the sum of all the elements of corresponding column of the
     * 
     * 2D input array N.
     * 
     */

    public static int[] sumCol(int[][] N) {

        int[] colSum = new int[N[0].length];
        int sum;
        for (int i = 0; i < colSum.length; i++) {
            sum = 0;
            for (int j = 0; j < N.length; j++) {
                sum+=N[j][i];
            }
            colSum[i] = sum;
        }

        return colSum;

    }

    /*
     * 
     * #6 sumRC will return sum of all of the elements of row or column as
     * 
     * determined by rc, located at the location determined by index.
     * 
     */

    public static int sumRC(int[][] N, char rc, int index) {

        int sum = 0;

        if (rc == 'C') {
            sum = sumCol(N)[index];
        } else if (rc == 'R') {
            sum = sumRow(N)[index];
        }

        return sum;

    }

    /*
     * 
     * #7 Returns total number of elements in the 2D whose value is above val.
     * 
     */

    public static int countElementsAbove(int[][] N, int val) {

        int count = 0;

        for(int[] i: N) for(int j: i) if(j>val) count++;

        return count;

    }

    /*
     * 
     * #8 Converts 2D array to 1D, filling one row at a time going from left to
     * 
     * right
     * 
     */

    public static int[] convert2Dto1DRowMajor(int[][] N) {

        int[] out = new int[N.length*N[0].length];
        int idx = 0;

        for(int[] i: N) for(int j: i){
            out[idx]=j;
            idx++;
        }

        return out; // replace this statement with you own

    }

    /*
     * 
     * #9 Converts 2D array to 1D, filling from one column at a time going from
     * 
     * top to bottom
     * 
     */

    public static int[] convert2Dto1DColumnMajor(int[][] N) {

        int[] out = new int[N.length*N[0].length];
        int idx = 0;

        for(int i = 0; i<N[0].length;i++) for(int j = 0;j<N.length;j++){
            out[idx] = N[j][i];
            idx++;
        }

        return out; // replace this statement with you own

    }

    /*
     * 
     * #10 Converts 2D array to 1D, filling rows continuously. First going from
     * 
     * left to right, then right to left and then repeating the same pattern
     * 
     * over and over
     * 
     */

    public static int[] convert2Dto1DContinousRow(int[][] N) {

        int[] out = new int[N.length*N[0].length];
        
        int col; int idx = 0;

        for (int row = 0; row < N.length; row++) {
            
            for(int j = 0; j<N[row].length;j++){
                
                if(row%2==0) col = j;
                else col = N[row].length - j - 1;

                out[idx] = N[row][col];
                idx++;
            }

        }

        return out;

    }

    /*
     * 
     * #11 Converts 2D array to 1D, filling columns continuously. First going
     * 
     * from top to bottom of the first column, then bottom to top of second
     * 
     * column and then from top to bottom of the 3rd Column
     * 
     */

    public static int[] convert2Dto1DContinousColumn(int[][] N) {

        int[] out = new int[N.length*N[0].length];
        
        int row; int idx = 0;

        for (int col = 0; col < N[0].length; col++) {
            
            for(int j = 0; j<N.length;j++){
                
                if(col%2==0) row = j;
                else row = N.length - j - 1;

                out[idx] = N[row][col];
                idx++;
            }

        }
        
        return out;

    }

    /*
     * 
     * #12 This method receives an 2D int array and returns a 1D array of size
     * 
     * 2, representing the index of the minimum value found in this array.
     * 
     * minI[0]->row, minI[1] -> column.
     * 
     */

    public static int[] findMinIndex(int[][] N) {

        int min = N[0][0];
        int minRow = 0,minCol = 0;

        for(int i = 0;i<N.length;i++) for(int j = 0;j<N[i].length;j++){
        
            if(N[i][j]<min){
                min = N[i][j];
                minRow = i;
                minCol = j;
            }
        
        }

        int[] minI = {minRow,minCol};
        return minI;

    }

    /*
     * 
     * #13 This method swaps the element stored at loc1 with the element stored
     * 
     * at loc2 in N array.
     * 
     */

    public static void swap(int[][] N, int[] loc1, int[] loc2) {

        int temp = N[loc1[0]][loc1[1]];
        N[loc1[0]][loc1[1]] = N[loc2[0]][loc2[1]];
        N[loc2[0]][loc2[1]] = temp;

    }

}
