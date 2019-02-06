import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner in=new Scanner(System.in);
	char c= in.next().charAt(0); 
    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	{
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Consonant");
	}
	}
	else
	System.out.println("invalid");
	}
}
