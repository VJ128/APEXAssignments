//2.Balanced Brackets
package apex.com.dss;
import java.util.Stack;

public class BalancedBrackets  
{	public static void main(String[] args) 
{
	String str="[({})]]]";
	char[] ch=str.toCharArray();int l=ch.length;
	Stack<Character> st=new Stack<Character>();
//Iterating thru char array and pushing only open brackets into the stack for the brackets
// if the character is not bracket skip to the next character
	
	for(int i=0;i<l;i++) 
{
	if(ch[i]=='('||ch[i]=='{'||ch[i]=='['||ch[i]==')'||ch[i]=='}'||ch[i]==']') 
	{
	if(ch[i]=='['||ch[i]=='('||ch[i]=='{') 
     {st.push(ch[i]);}
	else if(!st.isEmpty() && 
			((ch[i]==')' && st.peek()=='(')||
			 (ch[i]=='}' && st.peek()=='{')||
			 (ch[i]==']' && st.peek()=='['))) 
	          {st.pop();}
	else {st.push(ch[i]);}}
	else {continue;}	
}
	if(st.isEmpty()) {System.out.println("Balanced Brackets");}
	else {System.out.println("Imbalanced Brackets");}
}
}

