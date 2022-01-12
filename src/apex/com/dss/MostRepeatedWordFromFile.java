 package apex.com.dss;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
public class MostRepeatedWordFromFile 
{public static void main(String[] args) throws FileNotFoundException {
File myfile=new File("C:\\Java\\iofile.txt");
Scanner sc=new Scanner(myfile);
while(sc.hasNextLine())
{
	String str=sc.nextLine();
	String [] str1=str.split("\\s+");int l=str1.length;
	  Map<String,Integer> map=new LinkedHashMap();
	  //To create Map with keys and values
	  for(int i=0;i<l;i++) {
		  if(str1[i]!=" ") {
	  if(map.containsKey(str1[i])==false) 
	  {map.put(str1[i], 1);} 
	  else { int oldval=map.get(str1[i]);
			 int newval=oldval+1;
	         map.put(str1[i], newval); 
	         } }}
	  System.out.println(map);
	//To find the most occuring word	
	
	  int maxval=0; String maxString =" "; for(Entry<String, Integer>
	  data:map.entrySet()) { if(data.getValue()>maxval) { maxval=data.getValue();
	  maxString=data.getKey(); map.put(maxString, maxval); } }
	  System.out.println("Most occuring word is '"+maxString+"' & it occured '"
	  +maxval+"' times.");
	 
//To sort the map by values
ArrayList<Entry<String,Integer>> al=new ArrayList<Entry<String,Integer>>(map.entrySet());
Collections.sort(al, new Comparator<Entry<String,Integer>>() //Anonymous Class
{
	public int compare(Entry<String,Integer> o1, Entry<String,Integer>o2)
	{
		return o1.getValue().compareTo(o2.getValue());
	}
});
System.out.println(al);
/*//To find the most occuring word using Stack if we sort desc top record will hav maxval
  Stack stack =new Stack(); stack.addAll(al);
  System.out.println("Most occuring word is :"+stack.peek()+" times.");*/
 
}
}
}