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
        if(a % 4 == 0)
        {
            if(a % 100 == 0)
            {
                
                if (a % 400 == 0)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else
                System.out.println("yes");
        }
        else
            System.out.println("no");
	}
}
