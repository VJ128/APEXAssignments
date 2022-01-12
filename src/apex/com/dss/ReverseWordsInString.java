//11.Reverse Words in a String
package apex.com.dss;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "Happy Birthday Dotty";
		int l = s.length();
		int k = l;
		char[] ch = s.toCharArray();
		char[] b = new char[l];
		for (int i = 0; i < k; i++) {
			b[i] = ch[l - 1];
			l--;
		}
		System.out.println(b);
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