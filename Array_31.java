/*

Geometric Progression Program

Input:
a= start element
r= difference
n= range

Example:
========
I/O
===
1 2 5

O/P
===
1 2 4 8 16

*/
import java.util.Scanner;
class Array_31 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int r=sa.nextInt();
		int n=sa.nextInt();
		int res=a;
		int copy=a;
		while(n!=0){
			if(copy==a){
				System.out.print(res+" ");
				copy--;
			}	
			else{
				res=res*r;
				System.out.print(res+" ");
			}
			n--;
		}
	}
}