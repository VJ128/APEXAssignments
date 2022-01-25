//11.Reverse Words in a String
package apex.com.dss;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String str6 = "today is tuesday";
		int le = str6.length();
		for (int i = le - 1; i >= 0; i--) {
			System.out.print(str6.charAt(i));
		}
		System.out.println();
		//method 2
		String s = "today is tuesday";
		int l = s.length();
		int k = l;
		char[] ch = s.toCharArray();
		char[] b = new char[l];
		for (int i = 0; i < k; i++) {
			b[i] = ch[l - 1];
			l--;
		}
		System.out.println(b);
		//method 3
		String str1="today is tuesday";
		StringBuffer str=new StringBuffer(str1);
		str.reverse();
		System.out.println(str);
		//method 4
		String str2 = "today is tuesday";

		char[] ch2 = str2.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < ch2.length; i++) {
			st.push(ch2[i]);
		}
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(st.pop());
		}
		//

		
	}
}

/*
 * // reverse words in a string import java.util.Stack;
 * 
 * public class Test { public static void main(String[] args) { String s =
 * "its raining today in here"; String[] str = s.split("\s+"); String[] s2=new
 * String[str.length]; Stack<String> st = new Stack<String>(); for (String s1 :
 * str) { st.add(s1); } for(int i=0;i<str.length;i++) { s2[i]=st.pop();
 * System.out.print(" "+s2[i]); } } }//o/p= here in today raining its
 */