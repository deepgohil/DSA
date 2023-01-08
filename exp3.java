// // // // // // // import java.util.*;
// // // // // // // public class exp3 {
// // // // // // //     public static void main(String[] args) {
// // // // // // //         System.out.println("Deep gohil");
// // // // // // //         System.out.println("Sap ID: 60004220122");
// // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // //         System.out.print("Enter a four digit number: ");
// // // // // // //         int i,j,k,l,temp,num;
// // // // // // //         num = sc.nextInt();
// // // // // // //         temp=num;
// // // // // // //         int [] arr = new int[4];
// // // // // // //         for(i=0; i<4; i++) {
// // // // // // //             arr[i] = temp%10;
// // // // // // //             temp/=10;
// // // // // // //         }
// // // // // // //         for(i=0; i<4; i++) {
// // // // // // //             for(j=0; j<4; j++) {
// // // // // // //                 if(i!=j) {
// // // // // // //                     for(k=0; k<4; k++) {
// // // // // // //                         if(k!=i && k!=j) {
// // // // // // //                             for(l=0; l<4; l++) {
// // // // // // //                                 if(l!=i && l!=j && l!=k) {
// // // // // // //                                     if((10*arr[i]+arr[j])*(10*arr[k]+arr[l])==num) {
// // // // // // //                                         System.out.print(num+" is a Vampire Number");
// // // // // // //                                         System.exit(0);
// // // // // // //                                     }
// // // // // // //                                 }
// // // // // // //                             }
// // // // // // //  }
// // // // // // //                     }
// // // // // // //                 }
// // // // // // //             }
// // // // // // //         }
// // // // // // //         System.out.print(num + " is not a Vampire Number");
// // // // // // //     }
// // // // // // // }


// // // // // // public class exp3{
// // // // // //     public static void main(String[] args) {
// // // // // //         System.out.println("Deep gohil");
// // // // // //         System.out.println("Sap ID:60004220122");
// // // // // //         int r = 3;
// // // // // //         int arr[][] = new int[r][];
// // // // // //         for (int i = 0; i < arr.length; i++)
// // // // // //             arr[i] = new int[i + 1];
// // // // // //         int count = 1;
// // // // // //         for (int i = 0; i < arr.length; i++) {
// // // // // //             for (int j = 0; j < arr[i].length; j++)
// // // // // //                 arr[i][j] = count++;
// // // // // //         }
// // // // // //         System.out.println("The given pattern is displayed below ");
// // // // // //         for (int i = 0; i < arr.length; i++) {
// // // // // //             for (int j = 0; j < arr[i].length; j++)
// // // // // //                 System.out.print(arr[i][j] + " ");
// // // // // //             System.out.println();
// // // // // //         }
// // // // // //     }
// // // // // // }


// // // // // import java.util.*;
// // // // // public class exp3{
// // // // //     public static void main(String args[]) {
// // // // //         System.out.println("Deep gohil");
// // // // //         System.out.println("Sap ID:60004220122");
// // // // //         Scanner in = new Scanner(System.in);
// // // // //         int row , col , i , j ,sum=0;
// // // // //         System.out.println("Enter the number of rows : ");
// // // // //         row = in.nextInt();
// // // // //         System.out.println("Enter the number of columns : ");
// // // // //         col = in.nextInt();
// // // // //         int[][] arr = new int[(row+1)][(col+1)];
// // // // //         for(i=0; i<row+1; i++) {
// // // // //             for(j=0; j<col+1; j++) {
// // // // //                 if(j != col && i != row ) {
// // // // //                     System.out.println("Enter element value : ");
// // // // //                     arr[i][j] = in.nextInt();
// // // // //                     sum = sum+ arr[i][j];
// // // // //                 } else {
// // // // //                     arr[i][j] = 0;
// // // // //                 }
// // // // //             }
// // // // //         }
// // // // //         for(i=0; i<row+1; i++) {
// // // // //             for(j=0; j<col+1; j++) {
// // // // //                 if(j != col && i != row ) {
// // // // //                     arr[i][col] = arr[i][col] + arr[i][j];
// // // // //                     arr[row][j] = arr[row][j] + arr[i][j];
// // // // //                 } else {
// // // // //                     arr[row][col] = sum;
// // // // //                 }
// // // // //             }
// // // // //         }
// // // // //         for(i=0; i<row+1; i++) {
// // // // //             for(j=0; j<col+1; j++) {
// // // // //                 System.out.print(arr[i][j] + "\t");
// // // // //             }
// // // // //             System.out.println(" ");
// // // // //         }
// // // // //     }
// // // // // }


// // // // import java.util.*;
// // // // public class exp3 {
// // // //     public static void main(String args[]) {
// // // //         Scanner in= new Scanner(System.in);
// // // //         System.out.println("Deep gohil");
// // // //                 System.out.println("Sap ID:60004220122");
// // // //         System.out.print("How many items are there in List : ");
// // // //         int n =in.nextInt();
// // // //         Vector v = new Vector(n,3);
// // // //         for(int i=0; i<n; i++) {
// // // //             System.out.printf("Enter item %d : ",(i+1));
// // // //             String str = in.next();
// // // //             v.addElement(str);
// // // //         }
// // // //         System.out.println("Choose an action to perform");
// // // //         System.out.println("1. Add an item ");
// // // //         System.out.println("2. Delete an item ");
// // // //         System.out.println("3. Display all items ");
// // // //         System.out.println("4. Exit");
// // // //         int choice = 1;
// // // //         while(choice != 3) {
// // // //             System.out.println("Enter your choice : ");
// // // //             choice = in.nextInt();
// // // //             if(choice == 1) {
// // // //                 System.out.println("Enter the location of the item to be added : ");
// // // //                 int pos = in.nextInt();
// // // //                 System.out.println("Enter the item : ");
// // // //                 String item = in.next();
// // // //                 v.add((pos-1),item);
// // // //                 System.out.println("Elements in the list are " + v );
// // // //             } else if(choice == 2 ) {
// // // //                 System.out.println("Enter the item to be deleted : ");
// // // //                 String items = in.next();
// // // //                 v.remove(items);
// // // //             } else if(choice == 3) {
// // // //                 System.out.println("Items in the list are " + v );
// // // //             } else {
// // // //                 System.out.println("Wrong choice");
// // // //             }
// // // //         }
// // // //     }
// // // // }


// // // import java.util.*;
// // // public class exp3 {
// // //     public static void main(String args[] ) {
// // //         System.out.println("Deep gohil");
// // //        System.out.println("Sap ID:60004220122");
// // //         int no, i;
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.print("No of Elements in Vector : ");
// // //         int n = sc.nextInt();
// // //         Vector v = new Vector(n);
// // //         for (i = 0; i < n; i++) {
// // //             no = i + 1;
// // //             System.out.print("element " + no + " : ");
// // //             String element = sc.next();
// // //             v.addElement(element);
// // //         }
// // //         System.out.println("Vector : " + v);
// // //         System.out.print("Find frequency of element : ");
// // //         String z = sc.next();
// // //         int count = Collections.frequency(v, z);
// // //         System.out.println("Find frequency of element " + z + " is " + count);
// // //     }
// // // }



// // import java.util.*;
// // public class exp3 {
    
// //     static String swap(String str, int i, int j) {
// //         char arr[] = str.toCharArray();
// //         char temp = arr[i];
// //         arr[i] = arr[j];
// //         arr[j] = temp;
// //         return String.valueOf(arr);
// //     }
    
// //     public static void main(String[] args) {
// //         Scanner in = new Scanner(System.in);
// //         String str1, str2, temp;
// //         int i, j, n = 0;
// //         System.out.println("Deep Gohil");
// //         System.out.println("Sap ID: 60004220122\n\n");
// //         System.out.println("Enter first word: ");
// //         str1 = in.nextLine();
// //         System.out.println("Enter second word: ");
// //         str2 = in.nextLine();
// //         if (str1.length() == str2.length()) {
// //             for (i = 0; i < str1.length(); i++) {
// //                 for (j = 0; j < str1.length(); j++) {
// //                     temp = swap(str1, i, j);
// //                     if (temp.equals(str2)) {
// //                         System.out.println("\n\nThey are a pair of Meta strings.");
// //                         n = 1;
// //                         break;
// //                     }
// //                 }
// //                 if (n == 1) {
// //                     break;
// //                 }
// //             }
// //         }
// //         if (n == 0) {
// //             System.out.println("They are not a pair of Meta strings.");
// //         }
// //     }
// // }


// import java.util.*;
// public class exp3 {
//     public static void main(String[] args) {
//         String line;
//         Scanner in = new Scanner(System.in);
//         System.out.println("Deep Gohil");
//         System.out.println("Sap ID: 60004220122\n\n");
//         System.out.print("Enter the string : ");
//         line = in.nextLine();
//         int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbol = 0;
//         line = line.toLowerCase();
//         for (int i = 0; i < line.length(); ++i) {
//             char ch = line.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 ++vowels;
//             } else if ((ch >= 'a' && ch <= 'z')) {
//                 ++consonants;
//             } else if (ch >= '0' && ch <= '9') {
//                 ++digits;
//             } else if (ch == ' ') {
//                 ++spaces;
//             } else
//                 ++symbol;
//         }
//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//         System.out.println("Digits: " + digits);
//         System.out.println("Blank spaces: " + spaces);
//         System.out.println("Special Symbols : " + symbol);
//     }
// }

