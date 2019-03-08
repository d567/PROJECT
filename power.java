

import java.util.*;
import java.lang.*;
import java.io.*;

class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,k,r=1,i;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	k=in.nextInt();
	for(i=0;i<k;i++)
	{
	r=r*n;	
	}
	System.out.println(r);
	}
}
