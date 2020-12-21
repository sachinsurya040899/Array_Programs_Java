/*

Input:
======
s.java
s1.java

Output:
=======
2

*/
import java.util.Scanner;
import java.io.*;
class Array_32 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.next();
		String s1=sa.next();
		if(s.matches("(.*).java") && s1.matches("(.*).java")){
			System.out.print("2");
		}
		else if(s.matches("(.*).java") || s1.matches("(.*).java")){
			System.out.print("1");
		}
		else{
			System.out.print("0");
		}
	}
}