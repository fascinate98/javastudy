package prob04;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		String rs = "";
		
		for(int i = 0; i < str.length; i++) {
			 rs += str[i];
		}
		
		return rs;
	}
}
