/*

Indian politics has an interesting trend in history. A party which assumes that 
it is the undefeatable champion in elections has been defeated by other parties 
in many instances.You are a data analyst in the Election Commission. You are given 
a list containing a year and the party which won the election in that particular year. 
Your task is to analyse the trend and find the years in which, one party, which won 
many elections consecutively, was suddenly defeated by another.
 

Input Description:
==================
Size of the array, followed by 2 arrays, one containing the year 
values and the other containing the party which won the election that year.

Output Description:
===================
The year of transition from one party to another.

Sample Input :
==============
5
2004 1999 2019 2009 2014
JDU JDU CON JDU CON

Sample Output :
===============
2014

Input:
======
6
1980 2005 1990 1985 1995 2000
KRR BSP BSP BSP KRR KRR

Expected Output:
================
1985
1995
2005

*/
import java.util.Scanner;
import java.util.ArrayList;
class Array_17{
    public static void main(String args[]){
        Scanner sa=new Scanner(System.in);
        ArrayList ar=new ArrayList();
        int n=sa.nextInt();
        int a[]=new int[n];
        String b[]=new String[n];
        int count=0;
        int num=0;
        for(int i=0;i<a.length;i++){
            a[i]=sa.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i]=sa.next();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    String s=b[i];
                    b[i]=b[j];
                    b[j]=s;
                }
            }
        }
       for(int i=0;i<b.length;i++){
          for(int j=i+1;j<b.length;j++){
             if(b[i].equals(b[j]))
             {
              continue;  
             }
             else{
              i=j-1;
              System.out.print(a[j]);
              break;
             }
          }
          System.out.println();
       }
    }
}