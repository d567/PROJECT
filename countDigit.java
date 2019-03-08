

import java.util.*;
import java.lang.*;
import java.io.*;


class count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,count=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
	
}
