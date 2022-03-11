package arrow;

public class ITestImpl implements ITest {

	@Override
	public Integer test(Integer i) {
		System.out.println("Test");
		return i;
	}

}
