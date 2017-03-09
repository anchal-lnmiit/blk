package org;
import java.util.*;

public class happyLoser{
	
	public String abc = "abc";
	public String out = "";
	public String arg1 = "I am working";
	public static void main(String args[]) {
		happyLoser hp = new happyLoser();
		hp.imp();
	}
	public void imp() {
		
		ArrayList<String> ai = new ArrayList<String>();
		while(true) {
			int flag = 0;
			for (int i = 0; i < 3; i++) {
				StringBuilder input = new StringBuilder(arg1);
				if(arg1.length() > 0) {
					ai.add(Character.toString(input.charAt(0)));
					input.deleteCharAt(0);
					arg1 = input.toString();
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