import java.util.*;
import java.lang.*;
import java.io.*;

class OddNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a,b,i;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	for(i=a+1;i<b;i++)
	{
		if(i%2!=0)
		{
			System.out.print(i+" ");
		}
	}
	}
}
