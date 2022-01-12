/*12.Given a string find most repeated character number of times each character is repeated
arrange in the order of repeat ions*/
package apex.com.dss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedCharInString {

	public static void main(String[] args) {
		String s = "cddabaeeabb";// a-3 b-3 c-1 d-2 e-2
		char[] ch = s.toCharArray();
		int l = ch.length;
		int maxval = 0;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < l; i++) {
			if (!map.containsKey(ch[i]))// Checking if the map has the character already, if not add
			{
				map.put(ch[i], 1);
			} else // if its already there get the val corr to that char & +1 and add new val to
					// the map
			{
				int oldval = map.get(ch[i]);
				int newval = oldval + 1;
				map.put(ch[i], newval);
			}
		}
		// System.out.println(map);//{c=1, d=2, a=3, b=3, e=2}

		Collection<Integer> c = map.values();
		/*
		 * //To get most occuring char val for(Integer i:c) { if(i.intValue()>maxval)
		 * {maxval=i.intValue();} }
		 */
		Iterator<Integer> itr1 = c.iterator();// To get most occuring char val
		while (itr1.hasNext()) {
			if (itr1.next() > maxval) {
				maxval = itr1.next();
			}
		}
		// System.out.println(maxval);
		// To get the characters corr to maxval
		Set<Entry<Character, Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		// Using Streams,prints most occuring character
		Integer maxvl = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
		map.entrySet().stream().filter(e -> e.getValue() == maxvl)
				.forEach(x -> System.out.println("Most occuring character is " + x));
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			if (entry.getValue() == maxval) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		ArrayList<Entry<Character, Integer>> al = new ArrayList<Entry<Character, Integer>>(set);
		// Collections.sort(al,(o1,o2)->o2.getValue().compareTo(o1.getValue()));//Sorting
		// using Lambdaexp

		/*
		 * Collections.sort(al, new Comparator<Entry<Character,Integer>>(){ public int
		 * compare(Entry<Character,Integer> o1, Entry<Character,Integer> o2) { return
		 * o2.getValue().compareTo(o1.getValue()); }});
		 */

		Collections.sort(al, new MyComp());// Sorting using customized comparator
		// al.sort(new MyComp());Sorting using customized comparator
		System.out.println(al);
	}
}

class MyComp implements Comparator<Entry<Character, Integer>>// customized comparator
{
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}
}
