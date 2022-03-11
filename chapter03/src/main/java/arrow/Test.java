package arrow;

import java.io.Console;

public class Test {
	public static void test(ITest i) {
		Integer result = i.test(10);
		System.out.println(result);
	}
	public static void main(String[] args) {
//		ITest i = new ITest() {
//			@Override
//			public void test() {
//				System.out.println("TEST");
//			}
//		};
//		
//		i.test();
		
		//ex01
		test(new ITestImpl());
		
		//ex02 : Annonymous Class
		test(new ITest() {

			@Override
			public Integer test(Integer val) {
				System.out.println("Test" + val);
				return val * 10;
			}
			
		});
		
		
		//ex03: Lamda Method 함수가 하나잇을떄만 가능. new itest가 들어갈거 아니까 알아서 해줌
		test(val -> {
			return val * 10;
		});
		
		test(x -> x * 10);
		
	}
}
