//Remove Duplicates from Sorted List --using TreeSet
package apex.com.dss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemvDupSortList 
{
	public static void main(String[] args) 
	{
	ArrayList<String> ll=new ArrayList(Arrays.asList("Ben","Ash","leo","Ben","Clara","Ash"));
    TreeSet<String> ts=new TreeSet<String>(ll);
    System.out.println(ts);
	}
}
