/*

An organization named “JPOKS” has a well-maintained library in its own building. 
Librarian orders and gets books for the library very frequently. Each book which
is newly arrived has its own unique serial number. The books initially are placed
in descending order. The librarian want to place a new book without disturbing the
descending order of books in terms of unique id. Now you must help librarian to 
find the right spot for placing the book.

Input Description:
==================
The first line of program contains integer ‘n denoting no. of books 
already placed in the shelf. Next line contains n serial number of 
already placed books. Next line contains integer m denoting no of new
books to be placed on the shelf. Next line contains m serial numbers of new book.

Output Description:
===================
print the position at which it must be placed

Sample Input :
==============
7
95 68 62 58 55 41 30
2
45 61

Sample Output :
===============
6 4

*/
import java .util.Scanner;
class Array_25 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int count=0;
		int index=0;
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		int m=sa.nextInt();
		int b[]=new int[m];
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			for(int j=a.length-1;j>=0;j--){
				if(b[i]>a[j]){
					index=j;
				}
			}
			a[index]=b[i];
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a.length;j++){
				if(b[i]==a[j] && count==b.length-1){
					System.out.print(j+1);
					count++;
					break;
				}
				else if(b[i]==a[j]){
					System.out.print(j+1+" ");
					count++;
					break;
				}
			}
		}
	}
}
