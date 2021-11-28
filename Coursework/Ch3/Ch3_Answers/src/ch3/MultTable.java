package ch3;

public class MultTable {
	
	public static void main(String[] args) {
		
		int start = 1;
		int stop = 12;
		
		System.out.print("X");
		
		for(int i = start;i<=stop;i++) {
			
			System.out.print("\t"+i);
			
		}
		
		System.out.println();
		
		for(int i = start;i<=stop;i++) {
			
			System.out.print("\t"+"--");
			
		}
		
		System.out.println("\n");
		
		
		for(int i = start;i<=stop;i++) {
			
			System.out.print(i+ " |");
			
			for(int j = start;j<=stop;j++) {
				System.out.print("\t" + i*j);
			}
			
			System.out.println("\n");
			
		}

	}

}
