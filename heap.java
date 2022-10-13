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

Merge K Sorted Lists
Hard

1. You are given a list of lists, where each list is sorted.
2. You are required to complete the body of mergeKSortedLists function. The function is expected to merge k sorted lists to create one sorted list.

Constraints
Space complextiy = O(k)
Time complexity = nlogk
where k is the number of lists and n is number of elements across all lists.

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

4
5
10 20 30 40 50
7
5 7 9 11 19 55 57
3
1 2 3
2
32 39

Sample Output
1 2 3 5 7 9 10 11 19 20 30 32 39 40 50 55 57 
	

import java.io.*;
import java.util.*;

public class Main {

   public static class Pair implements Comparable<Pair>
   {int li,vi,val;
   Pair(int li,int vi,int val)
   {
      this.li=li;
      this.vi=vi;
      this.val=val;

   }
   public int compareTo(Pair o)
   {
      return this.val-o.val;
   }

   }

   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Pair> pq=new PriorityQueue<>();

      for (int i = 0; i < lists.size(); i++) {
         pq.add(new Pair(i,0,lists.get(i).get(0)));
      }

      while(pq.size()>0)
      {
         Pair temp=pq.remove();
         rv.add(temp.val);
         if(temp.vi+1<lists.get(temp.li).size())
         {
            temp.vi+=1;
            temp.val=lists.get(temp.li).get(temp.vi);
            pq.add(temp);
         }
      }
      
      // write your code here

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
