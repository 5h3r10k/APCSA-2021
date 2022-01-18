package ch4;

public class Testing {
    
    public static void main(String[] args) {
        
        String[] pts = {"A","B","C","D","E"};

        for (int i = 0; i < pts.length; i++) {
            
            for(int j = i+1;j < pts.length;j++){

                System.out.print(pts[i]);
                System.out.println(pts[j]);

            }

        }

    }

}
