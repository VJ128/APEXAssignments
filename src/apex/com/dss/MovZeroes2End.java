//15.Moving all the zeros to the end of the array
package apex.com.dss;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MovZeroes2End {
public static void main(String[] args) {
	int[] a= {3,1,0,8,0,6};	int l=a.length;	int[]b= new int[l];int j=0;
//1. copy non zeros from a-b, extra space of b will be filled with zeroes
	for(int i=0;i<l;i++)
	{
		if(a[i]!=0)
		{b[j]=a[i];j++;}
	}
//	for (int i=0;i<l;i++) {System.out.println(b[i]);}
//2.Copy array into ArrayList and sort using Comparator (customized sorting)
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<l;i++)
{
	al.add(a[i]);
}
//Sorting the ArrayList
Collections.sort(al, new MyComp1());
System.out.println("After moving all zeroes"+al);

//3.sorting using Lambda
int[] p={4,0,2,0,1};
ArrayList<Integer> al1=new ArrayList<Integer>();
for(int k=0;k<p.length;k++) {
al1.add(p[k]);
}
al1.sort((o1,o2)->o2.compareTo(o1));
System.out.println(al1);
}
}

class MyComp1 implements Comparator
{
public int compare(Object o1, Object o2) 
{	
	Integer i1=(Integer)o1;
	Integer i2=(Integer)o2;
	return i2.compareTo(i1);	
	}}



