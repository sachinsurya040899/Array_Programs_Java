//Program merge the two arrays then sort them too and then find the sum of two middlemost elements
import java.util.Scanner;
class Array8 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n+n];
		int count=0;
		int len=c.length;
		int mid=len/2;
		int mid1=mid-1;
		int sum;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
			count++;
		}
		for(int i=0;i<b.length;i++){
			c[count]=b[i];
			count++;
		}
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		sum=c[mid]+c[mid1];
		System.out.print(sum);
	}
}
