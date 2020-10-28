//Program to subtract the index of the largest number to smallest number
import java.util.Scanner;
class Array1 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int max=0;
		int min=0;
		int ma=0;
		int mi=0;
		for (int i=0;i<n ;i++)
		{
			a[i]=sa.nextInt();
		}
		min=a[0];
		max=a[0];
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[j]>max){
					max=a[j];
					ma=j;	
				}
				if(a[j]<min){
					min=a[j];
					mi=j;
				}
			}
		}
		System.out.print(ma-mi);
	}
}
