package apex.com.dss;

//Swap two strings without using temp string
import java.util.Stack;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		Stack<String> st = new Stack<String>();
		st.push(s1);
		st.push(s2);
		s1 = st.pop();
		s2 = st.pop();
		System.out.println("After swapping s1 = " + s1);
		System.out.println("After swapping s2 = " + s2);

	}
}
