//3.Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
package apex.com.dss;
import java.util.Arrays;
//1,33,2,54,3,45,67,4,5,6
public class LongestConsecutiveElementSeq 
{	public static void main(String[] args) 
{
	int [] a= {2,3,8,9,10,4,5,6};int l=a.length;
	Arrays.sort(a);
	for (int i=0;i<l-1;i++) 
	{System.out.println(a[i]);}
int j=1;
for (int i=0;i<l-1;i++) 
{
if(a[i+1]-a[i]==1) 
{
j++;	
}
}System.out.println("The length of longest consecutive elements sequence is "+j);
}
}

