//Program to merge two array 1st array must be in ascending order and 2nd array in descending order
import java.util.Scanner;
class Array2 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
			int n=sa.nextInt();
			int m=sa.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			int c[]=new int[n+m];
			int count=0;
			for(int i=0;i<a.length;i++){
				a[i]=sa.nextInt();
			}
			for(int i=0;i<b.length;i++){
				b[i]=sa.nextInt();	
			}
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[j]<a[i]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<b.length;i++){
				for(int j=i+1;j<b.length;j++){
					if(b[j]>b[i]){
						int temp=b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++){
				c[i]=a[i];
				count++;
			}
			for(int i=0;i<b.length;i++){
				c[count++]=b[i];
			}
			for(int i=0;i<c.length;i++){
				if(i==count-1)
					System.out.print(c[i]);
				else
					System.out.print(c[i]+" ");
			}
	}
}
