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
