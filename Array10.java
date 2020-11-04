/*
   Rahul is fond of numbers.He is given a list of queries. 1 means store that element,
   2 means means print the minimum element of the stored list. For more clarity see the 
   input and output example

Input Description:
===================
The first line of the input N indicates the size of the query list. For N lines,
the queries are given with the format of '1 M', where M indicates the number to be stored 
and 1 indicates the query type. Similarly, '2' which indicates the type of query and it 
does not contain M since it is not required by this query type. Briefly saying, '1 M' 
means store that element M in a list '2' means print the minimum element of stored list

Output Description:
====================
Print the minimum element and -1 if there are 
no elements in stored list if the querytype is 2. 
Store the given number in the list if the query type is 1.

Sample Input :
===============
5
1 60
2
1 58
2
1 69

Sample Output :
================
60 58

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Array10
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int count=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int n1=sa.nextInt();
			if(n1==1){
				a.add(sa.nextInt());
			}
			else if(n1==2){
				if(a.size()==0){
					count++;
					System.out.print("-1");
				}
				else{
					count=count+1;
					if(count==1)
						System.out.print(Collections.min(a));
					else
						System.out.print(" "+Collections.min(a));
				}
			}
			else{
				System.out.print("Wrong Input");
			}
		}
	}
}
