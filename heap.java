 4. Input is handled for you
 5. It is a functional problem ,please do not modify main()

Constraints
1 <= N <= 100
 K <= N
 -1000 <= C[i] <= 1000

Format
Input
Input is handled for you

Output
Output MUST be in descending order

Example
Sample Input

8
44 -5 -2 41 12 19 21 -6 
2

Sample Output
44 41

import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
		  PriorityQueue<Integer> pq=new PriorityQueue<>();

		for(int i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k;i<n;i++)
		{
			if(pq.peek()<arr[i])
			{
				pq.remove();
				pq.add(arr[i]);
			}
		}
		int ans[]=new int[k];
		int i=0;
		while(pq.size()>0)
		{
			ans[i]=pq.remove();
			i++;
		
			
		}
		for(i=k-1;i>=0;i--)
		{
		System.out.print(ans[i]+" ");
		}

		
     }
 }
