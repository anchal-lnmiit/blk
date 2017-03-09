import java.util.*;
class Test1{
	public static void main(String[] args) {
		String out = "";
		ArrayList<String> ai = new ArrayList<String>();
		while(true) {
			int flag = 0;
			for (int i = 0; i < 3; i++) {
				StringBuilder input = new StringBuilder(args[i]);
				if(args[i].length() > 0) {
					ai.add(Character.toString(input.charAt(0)));
					input.deleteCharAt(0);
					args[i] = input.toString();
					flag = 1;
				}
			}
			ai.sort(null);
			for (String x : ai) {
				out = out + x;
			}
			ai.clear();
			if(flag == 0) 
				break;
			
		}
		System.out.println(out);
		
	}
}