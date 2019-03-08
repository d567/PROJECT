import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a,i,fact=1;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	for(i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	}
}
