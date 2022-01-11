package ch4;


import java.util.Random;

public class UsingPoint {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();

        Point A = new Point(rnd.nextInt(15)+5,rnd.nextInt(15)+5);
        Point B = new Point(rnd.nextInt(15)+5,rnd.nextInt(15)+5);
        Point C = new Point(rnd.nextInt(15)+5,rnd.nextInt(15)+5);
        Point D = new Point(rnd.nextInt(15)+5,rnd.nextInt(15)+5);
        Point E = new Point(rnd.nextInt(15)+5,rnd.nextInt(15)+5);

        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        System.out.println("E: "+E);

        double AB = A.distanceTo(B);
        double AC = A.distanceTo(C);
        double AD = A.distanceTo(D);
        double AE = A.distanceTo(E);
        double BC = B.distanceTo(C);
        double BD = B.distanceTo(D);
        double BE = B.distanceTo(E);
        double CD = C.distanceTo(D);
        double CE = C.distanceTo(E);
        double DE = D.distanceTo(E);
        
        System.out.println();
        System.out.println("Distance between A and B = " + AB);
        System.out.println("Distance between A and C = " + AC);
        System.out.println("Distance between A and D = " + AD);
        System.out.println("Distance between A and E = " + AE);
        System.out.println("Distance between B and C = " + BC);
        System.out.println("Distance between B and D = " + BD);
        System.out.println("Distance between B and E = " + BE);
        System.out.println("Distance between C and D = " + CD);
        System.out.println("Distance between C and E = " + CE);
        System.out.println("Distance between D and E = " + DE);
        System.out.println();


        // CALCULATING DISTANCES BETWEEN POINTS

        Point[] pts = {A,B,C,D,E};
        Point[][] combos = new Point[10][2];
        int count = 0;

        // generating array of point combinations

        for (int i = 0; i < pts.length; i++) {
            
            for(int j = i+1;j < pts.length;j++){

                //System.out.print(pts[i]);
                //System.out.println(pts[j]);

                combos[count][0]=pts[i];
                combos[count][1]=pts[j];

                count++;

            }

        }

        // calc max dist and the 2 pts involved
        double maxDist = 0, currDist = 0;
        Point currpt1 = new Point(),currpt2 = new Point(),maxpt1 = new Point(),maxpt2 = new Point();

        for(int i = 0; i<combos.length;i++){
            currpt1 = combos[i][0];
            currpt2 = combos[i][1];
            currDist = currpt1.distanceTo(currpt2);
            //System.out.println(currDist);

            if(currDist>maxDist){
                maxDist = currDist;
                maxpt1 = currpt1;
                maxpt2 = currpt2;
            }

        }

        System.out.println("Max distance is "+ maxDist + " between "+maxpt1+" and " + maxpt2);


        // calc min distance and 2 pts involved

        double minDist = maxDist;
        Point minpt1 = new Point(),minpt2 = new Point();
        
        for(int i = 0; i<combos.length;i++){
            currpt1 = combos[i][0];
            currpt2 = combos[i][1];
            currDist = currpt1.distanceTo(currpt2);
            //System.out.println(currDist);

            if(currDist<minDist){
                minDist = currDist;
                minpt1 = currpt1;
                minpt2 = currpt2;
            }

        }

        System.out.println("Min distance is "+ minDist + " between "+minpt1+" and " + minpt2);

    }

}
