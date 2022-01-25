package apex.com.dss;
//1.Given an array of integers, find two numbers such that they add up to a specific target number

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddUptoSpecificTarget {

	public static void main(String[] args) {
		int[] a = { 150, 24, 80, 50, 88, 34 };
		int target = 200;
		List<Integer> al1 = Arrays.asList(150, 24, 80, 50, 88, 34);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (Integer i : a) {
			int diff = target - i;
			al2.add(diff);
		}
		for (Integer i1 : al2) {
			if (al1.contains(i1)) {
				System.out.println(i1);
			}
		}
	}
}
/*
 public class Test {
	public static void main(String[] args) {
		int[] a = { 24, 150, 80, 50, 88, 34 };
		int target = 200;// o/p 150,50

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
}
 */
 