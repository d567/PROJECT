import java.util.*;
import java.lang.*;
import java.io.*;

class primeNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,i,temp;
		boolean flag=false;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(i=2;i<=a/2;i++)
		{
           temp=a%i;
		   if(temp==0)
		   {
	       flag=true;
	       break;
		   }
	}
		if(!flag)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
