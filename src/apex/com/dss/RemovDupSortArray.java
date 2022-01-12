
package apex.com.dss;
import java.util.Arrays;
import java.util.TreeSet;
public class RemovDupSortArray {
public static void main(String[] args) {
	int [] a= {3,2,1,2};int l1= a.length;
	String[] b= {"Ben","Ash","Lia","Ash"};int l2=b.length;
	TreeSet ts1=new TreeSet();TreeSet ts2=new TreeSet();
    for(int i=0;i<l1;i++)
    {
    ts1.add(a[i]);
    ts2.add(b[i]);
    }
System.out.println(ts1);System.out.println(ts2);
}
}