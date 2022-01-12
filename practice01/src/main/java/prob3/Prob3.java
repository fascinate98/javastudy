package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요:");
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int a = scanner.nextInt();
		int result = 0;
		
		if(a % 2 == 0) {
			for(int i = 0; i <= a; i ++) {
				if(i % 2 == 0) {
					result += i;
				}
			}
		
		}else {
			for(int i = 0; i <= a; i ++) {
				if(i % 2 == 1) {
					result += i;
				}
			}
		}
		System.out.println("결과 값 : " + result);
		
		scanner.close();
	}
}
