/*

Given a number N and an array of N elements, find the length of the 
longest repeating sequence of the elements.If no such sequence is found print -1
Input Size : N <= 100000
Sample Testcase :
=================
INPUT
=====
8
1 2 2 2 3 4 5 6

OUTPUT
======
3

*/
import java.util.Scanner;
class Array_36 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int max[]=new int[n];
		int count;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && a[i]!=-1){
					count++;
					a[j]=-1;
				}
			}
			max[i]=count;
		}
		int s=max[0];
		for(int i=1;i<max.length;i++){
			if(s<max[i]){
				s=max[i];
			}
		}
		if(s>1){
			System.out.print(s);
		}
		else{
			System.out.print(-1);
		}
	}
}