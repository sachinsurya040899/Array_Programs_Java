/*

Given 2 numbers N,K followed by N elements print all the elements lesser than K 
in sorted order.If the elements could not be found print -1
Input Size : N <= 100000

Sample Testcase :
=================
INPUT
=====
5 3
1 2 1 4 1

OUTPUT
======
1 1 1 2

*/
import java.util.Scanner;
class Array_38 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			b[i]=-1;
		}
		int in=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<k){
				b[in++]=a[i];
			}
		}
		int count=0;
		for(int i=0;i<b.length;i++){
			if(i+1<b.length){
				if(b[i]!=-1 && b[i+1]==-1){
					System.out.print(b[i]);
					break;
				} 
				else if(b[i]!=-1){
					System.out.print(b[i]+" ");
				}
				else{
					count++;
				}
			}
			else{
				if(b[i]!=-1){
					System.out.print(b[i]);
				}
				else{
					count++;
				}
			}
		}
		if(count>0){
			System.out.print(-1);
		}
	}
}