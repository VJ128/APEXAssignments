//13.Given a Sentence find most repeated word
package apex.com.dss;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MostRepeatedWordInSent 
{	public static void main(String[] args) 
{
String s="of the can of the of the";
String[] str=s.split("\\s+");
int l1=str.length;
Map<String,Integer> map=new LinkedHashMap();
for(int i=0;i<l1;i++) 
{
if(map.containsKey(str[i])==false) {map.put(str[i], 1);}
else { int oldval=map.get(str[i]);
int newval=oldval+1;
map.put(str[i], newval);}
}
//System.out.println(map);//{of=2, the=3, can=1}
int maxval=0; String maxstring=" ";
Set<Map.Entry<String,Integer>> set=map.entrySet();
for(Entry <String,Integer> data:set) 
{
if(data.getValue()>maxval) 
{
maxval=data.getValue();
maxstring=data.getKey();
}
}
System.out.println("Most repeated word is:'"+maxstring+"' & it occurs'"+maxval+"'times.");
}
}













