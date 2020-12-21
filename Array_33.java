/*

Arithemetic Progression:
Input:
======
a=1
r=2
n=5

Output:
=======
1 3 5 7 9

*/
import java.util.Scanner;
class Array_33 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int r=sa.nextInt();
		int n=sa.nextInt();
		int cp=n;
		int r1=0;
		while(n!=0){
			if(n==cp){
				System.out.print(a);
				r1=a;
			}
			else{
				r1=r1+r;
				System.out.print(" "+r1);
			}
			n--;
		}
	}
}
