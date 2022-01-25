//6.Longest Sub string Without Repeating Characters
package apex.com.dss;
import java.util.LinkedHashMap;
public class LongestSubStrWithoutRepChars {
public static void main(String[] args) {
	String s="abbcdeabca";
	char[] ch=s.toCharArray();int l=ch.length;int maxval=0;String maxString="";
	LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<l;i++)
	{
		if(!map.containsKey(ch[i]))
		{map.put(ch[i], 1);}
		else
		   {i=i-1;
			map.clear();
			}
		if(map.size()>maxval) 
		{
			maxval=map.size();maxString=map.keySet().toString();
		}
	}
	System.out.println("Max SubString is "+maxString+" and its length is '"+maxval+"'.");
}
}
