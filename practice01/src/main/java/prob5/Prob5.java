package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for(int i = 1; i <= 99; i++) {
			if(i % 3 == 0 ) {
				System.out.print(i + "짝");
				if((i / 10) % 3 == 0 && i > 10) {
					if(i % 10 != 0)
						System.out.print("짝");
				}
				System.out.println("\n");
			}
		}
		
	}
}
