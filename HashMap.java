// Highest Frequency Character
// Easy

// 1. You are given a string str.
// 2. You are required to find the character with maximum frequency.

// Constraints
// 0 < str.length() <= 100
// There will be a single character with highest frequency

// Format
// Input
// A string str

// Output
// The character with highest frequency

// Example
// Sample Input

// zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

// Sample Output
// q

// import java.io.*;
// import java.util.*;
// import java.util.HashMap;
// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner sc=new Scanner(System.in);
//         String exp=sc.nextLine();
//         HashMap<Character, Integer> hm = new HashMap<>();
//         int hfn=0;
//         char hfc=' ';
//         for(int i=0;i<exp.length();i++)
//         {
//             char ch=exp.charAt(i);
//             if(hm.containsKey(ch))
//             {
//                 hm.put(ch,hm.get(ch)+1);
//             }
//             else 
//             {
//                 hm.put(ch,1);
//             }
//             if(hm.get(ch)>hfn)
//             {
//             hfn=hm.get(ch);
//             hfc=ch;
//             }

//         }
//         System.out.println(hfc);
//     }

// }


// Get Common Elements - 1
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// Time complexity should be O(n)

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// All relevant elements of a2 in separate lines (no duplicacy)

// Example
// Sample Input

// 9
// 5
// 5
// 9
// 8
// 5
// 5
// 8
// 0
// 3
// 18
// 9
// 7
// 1
// 0
// 3
// 6
// 5
// 9
// 1
// 1
// 8
// 0
// 2
// 4
// 2
// 9
// 1
// 5

// Sample Output
// 9
// 0
// 3
// 5
// 8


// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//     // write your code here
//     Scanner sc=new Scanner(System.in);
//     int arr1len=sc.nextInt();

//     int[] arr1=new int[arr1len];
//     for (int i = 0; i < arr1len; i++) {  
//         arr1[i]=sc.nextInt();
//        }  

//     int arr2len=sc.nextInt();
//     int[] arr2=new int[arr2len];
//     for (int i = 0; i < arr2len; i++) {  
//         arr2[i]=sc.nextInt();
//        }  
    
//     HashMap<Integer, Integer> hm = new HashMap<>();
//     for (int i = 0; i < arr1len; i++) {
//         hm.put(arr1[i],1);
//     }

//     for (int i = 0; i < arr2len; i++) {
//         if(hm.size()==0)
//         {
//             break;
//         }
//         if(hm.containsKey(arr2[i]))
//         {
//             System.out.println(arr2[i]);
//             hm.remove(arr2[i]);
//         }
//     }   


//  }

// }

// Longest Consecutive Sequence Of Elements
// Hard

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

// Constraints
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 15

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements

// Output
// Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)

// Example
// Sample Input

// 17
// 12
// 5
// 1
// 2
// 10
// 2
// 13
// 7
// 11
// 8
// 9
// 11
// 8
// 9
// 5
// 6
// 11

// Sample Output
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] =new int[n];
    for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
    }
 HashMap<Integer,Boolean> hm=new HashMap<>();
 for (int i = 0; i < arr.length; i++) {
     hm.put(arr[i],true);
 }

for (int my_key : hm.keySet()) {
    if(hm.containsKey(my_key-1))
    {
        hm.put(my_key,false);
    }
}
int starting_point=0;
int counter=0;

for (int my_key : hm.keySet()) {
   if(hm.get(my_key))
   {
    int sp=my_key;
    int l_counter=1;
while(hm.containsKey(sp+l_counter))
{
l_counter++;
}
if(l_counter>counter)
   {
       counter=l_counter;
       starting_point=sp;

   }

   }
   

}

for (int i = starting_point; i < starting_point+counter; i++) {
System.out.println(i);    
}
 }

}
