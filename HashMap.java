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
