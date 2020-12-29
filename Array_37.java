/*

Given 2 numbers N,K print the array after deleting the last K elements.
Input Size : N,K <= 100000
Sample Testcase :
=================
INPUT
=====
5 4
1 2 3 4 5

OUTPUT
======
1

*/
import java.util.Scanner;
class Array_37 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=a.length-1;i>=0;i--){
			if(k!=0){
				a[i]=-1;
				k--;
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=-1 && a[i+1]==-1){
				System.out.print(a[i]);
				break;
			}
			else if(a[i]!=-1){
				System.out.print(a[i]+" ");
			}
		}
	}
}