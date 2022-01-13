package prob3;

public class Sparrow extends Bird{
	public void sing() {
		System.out.println("참새 (" + super.getName() + ")이가 소리내어 웁니다");
	}
	public void fly() {
		System.out.println("오리 (" + super.getName() + ")이는 날아다닙니다.");
	}
	@Override
	public String toString() {
		String msg = "오리의 이름은" + super.getName() + "입니다.";
		return msg;
	}
	
	
}
