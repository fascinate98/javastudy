package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		int[] count = new int[10];
		/* 코드 작성 */
		System.out.print("금액 : ");
		int i = scanner.nextInt();
		
		while(i > 0) {
			if(i >= 50000) {
				count[0] += 1;
				i -= 50000;
				System.out.println(i);
				continue;
			}
			else if(i >= 10000) {
				count[1] += 1;
				i -= 10000;
				continue;
			}
			else if(i >= 5000) {
				count[2] += 1;
				i -= 5000;
				continue;
			}else if(i >= 1000) {
				count[3] += 1;
				i -= 1000;
				continue;
			}else if(i >= 500) {
				count[4] += 1;
				i -= 500;
				continue;
			}else if(i >= 100) {
				count[5] += 1;
				i -= 100;
				continue;
			}else if(i >= 50) {
				count[6] += 1;
				i -= 50;
				continue;
			}else if(i >= 10) {
				count[7] += 1;
				i -= 10;
				continue;
			}else if(i >= 5) {
				count[8] += 1;
				i -= 5;
				continue;
			}
			else if(i >= 1) {
				count[9] += 1;
				i -= 1;
				continue;
			}
		}
		
		for(int j = 0; j < MONEYS.length; j++) {
			System.out.println(MONEYS[j] + "원 : " + count[j] + "개");
		}
		

		
		scanner.close();
 	}
}