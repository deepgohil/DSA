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
Sort K-sorted Array
Easy

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. The array is nearly sorted. Every element is at-max displaced k spots left or right to it's position in the sorted array. Hence it is being called k-sorted array.
4. You are required to sort and print the sorted array.

Note -> You can use at-max k extra space and nlogk time complexity.

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 100
0 < k <= n

Format
Input
Input is managed for you

Output
Print the elements of sorted array in separate lines.

Example
Sample Input

9
3
2
4
1
6
5
7
9
8
3

Sample Output
1
2
3
4
5
6
7
8
9

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      PriorityQueue<Integer> pq=new PriorityQueue<>();

      for (int i = 0; i < k+1; i++) {
         pq.add(arr[i]);
      }
     
      for (int i = k+1; i < n; i++) {

         System.out.println(pq.remove());
         pq.add(arr[i]);
      }
      while ( pq.size()>0 ) {
          System.out.println(pq.remove());
      }


   }

}
