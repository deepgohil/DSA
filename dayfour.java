import java.util.Scanner;

public class dayfour {
    public static void main(String[] args) {

        ////////////patterns in JAVA for loops
        //////////////steps for any pattern
        ///////////// 1->identify number of rows
        ///////////// 1->identify number of space & number of stars(and analyse pattern)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///  * * * *
        ///  * * * *
        ///  * * * *
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int nst=n;
        // int nep=0;
        // for (int i = 1; i <= n; i++) {
        //  for (int j = 1; j <= nst; j++) {
        //      System.out.print("*\t");
        //  }   
        //  System.out.println("\n");
        // }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         ///  * 
        ///  * * 
        ///  * * *
        ///  * * * *
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int no=1;
        // int ns=0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= no; j++) {
        //         System.out.print("*\t");
        //     }
        //     no=no+1;
        //     System.out.println("\n");
        // }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *
// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int no=n;
//         int ns=0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= no; j++) {
//                 System.out.print("*\t");
//             }
//             no=no-1;
//             System.out.println();
//         }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// 				*	
// 			*	*	
// 		*	*	*	
// 	*	*	*	*	
// *	*	*	*	
// Scanner scn = new Scanner(System.in);

//          Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int nst=1;
//         int nsp=n-1;
//         for (int i = 1; i <= n; i++) {
//           ////////////firest loop for space
//             for (int j = 1; j <= nsp; j++) {
//                 System.out.print("\t");
//             }
//             for(int k=1;k<=nst;k++)
//             {
//                  System.out.print("*\t");
//             }
//             nsp=nsp-1;
//             nst=nst+1;
//             System.out.println();
//         }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-5 link
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//         int nst=1;
//         int nsp=n/2;
//         for (int i = 1; i <= n; i++) {


//             //////////for loop for space
//             for (int j = 1; j <= nsp; j++) {
//                 System.out.print("\t");
//             }
//            /////////for stars
//             for (int k = 1; k <=nst; k++) {
//                 System.out.print("*\t");
//             }
        
//             if(i<=n/2)
//             {
//                 nsp-=1;
//                 nst+=2;
//             }
//             else{
//                 nst-=2;
//                 nsp+=1;

//             }
           
            
//             System.out.println();
            
//         }
        

//     }
    
}
