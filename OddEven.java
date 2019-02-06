import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	if(a>0)
	{
	if(a%2==0)
	{
		System.out.print("Even");
	}
	else
	{
		System.out.println("Odd");
	}
	}
	else if(a<0)
	{
		System.out.println("invalid");
	}
	
	}
}
