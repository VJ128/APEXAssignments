package apex.com.dss;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Merge Two Sorted Lists
public class Merge2Lists 
{
public static void main(String[] args) 
{
ArrayList<String> l1=new ArrayList<String>(Arrays.asList("banana","apple","orange","grapes"));
		l1.add("kiwi");
ArrayList<String> l2=new ArrayList<String>(Arrays.asList("berries","blackberries"));
		l2.add("Strawberries");
		l1.addAll(l2);
System.out.println(l1);
}
}
