import java.util.*;
import java.lang.*;
import java.io.*;


class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,sum=0,temp;    
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
		temp=n;    
		while(n>0)
		{    
		r=n%10; 
		sum=(sum*10)+r;    
		n=n/10;    
		}    
		if(temp==sum)    
		System.out.println("yes");    
		else    
		System.out.println("no");    
	}
}
