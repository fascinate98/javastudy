package prob5;

public class MyStack {
	private String[] stack ;
	private int num;
	
	public MyStack(int i) {
		stack = new String[i];
	}
	
	public void push(String msg) {
		if(num>= stack.length) {
			System.out.println("스택 오버 플로우");
		}else {
			stack[num++]=msg;			
		}
	}
	
	public String pop() throws MyStackException  {
		
		if(num>0) {
			return stack[--num];
		}else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public boolean isEmpty() {
		if(stack.length == 0) {
			return true;
		}
		else
		{
			return false;
			
		}
	}
}