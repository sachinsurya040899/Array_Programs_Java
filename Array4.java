//Program to sort the 2d array in ascending order
import java.util.Scanner;
class Array4 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int m=sa.nextInt();
		int n=sa.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sa.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<m;k++){
					for(int l=0;l<n;l++){
						if(a[i][j]<a[k][l]){
							int temp=a[i][j];
							a[i][j]=a[k][l];
							a[k][l]=temp;
						}
					}
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(j==n-1){
					System.out.print(a[i][j]);
				}
				else{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
