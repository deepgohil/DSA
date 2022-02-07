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
// https://nados.io/question/pattern-5 link
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
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://nados.io/question/pattern-6 link
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//         int nst1=n/2+1;
//         int nst2=n/2+1;
//         int nsp=1;
//         for (int i = 1; i <= n; i++) {
//             ////for nst1
//             for (int j = 1; j <=nst1; j++) {
//                 System.out.print("*\t");
//             }
//             for (int j = 1; j <=nsp; j++) {
//                 System.out.print("\t");
//             }
//             for (int j = 1; j <=nst2; j++) {
//                 System.out.print("*\t");
//             }
//             if(i<=n/2)
//             {
//                 nst1--;
//                 nsp+=2;
//                 nst2--;
//             }
//             else{
//             nst1++;
//             nsp-=2;
//             nst2++;


//             }
//             System.out.println();
//     }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://nados.io/question/pattern-7 link
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//        int nst=1;
//        int nsp=0;
//        for (int i = 1; i <= n; i++) {
//                     ////for nst1
                    
//                     for (int j = 1; j <=nsp; j++) {
//                         System.out.print("\t");
//                     }
//                     for (int j = 1; j <=1; j++) {
//                         System.out.print("*\t");
//                     }
                    
//                     nsp++;
                    
//                     System.out.println();
//                 }
//////////////////////code two
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//        int nst=1;
//        int nsp=0;
//        for (int i = 1; i <= n; i++) {
//                     ////for nst1
                    
//                     for (int j = 1; j <=nsp; j++) {
//                         System.out.print("\t");
//                     }
//                     System.out.print("*\t");
                    
//                     nsp++;
                    
//                     System.out.println();
//                 }
//////////////////////code three (GAP method)
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//        int nst=1;
//        int nsp=0;
//        for (int i = 1; i <= n; i++) {
//                     ////for nst1
                    
//                     for (int j = 1; j <=n; j++) {
//                       if(i-j==0)
//                       {
//                           System.out.print("*\t");
//                       }
//                       else{
//                         System.out.print("\t");
//                       }
//                     }
                  
//                     System.out.println();
//                 }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://nados.io/question/pattern-8 link

// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//     int  nsp=n-1;
//     for (int i = 1; i <=n; i++) {
//         for (int j = 1; j <= nsp; j++) {
//             System.out.print("\t");
//         }
//         System.out.print("*\t");
//         nsp--;
//         System.out.println();
//     }
//////////////////////////////////////////////////////////////
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//     // int  nsp=;
//     for (int i = 1; i <=n; i++) {
//         for (int j = 1; j <= n; j++) {
//           if(j+i == n+1)
//           {
//               System.out.print("*\t");
//           }
//           else
//           {
//               System.out.print("\t");
//           } 
        
//             }
//         System.out.println();
//     }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-9 link
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//     // int  nsp=;
//     for (int i = 1; i <=n; i++) {
//         for (int j = 1; j <= n; j++) {
//           if(j+i==n+1 || i==j)
//           {
//               System.out.print("*\t");
//           }
//           else
//           {
//               System.out.print("\t");
//           } 
        
//             }
//         System.out.println();
//     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://nados.io/question/pattern-9 link
// Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//     int  nsp1=n/2;
//     int nsp2=-1;
//     for (int i = 1; i <=n; i++) {
//         ////////nsp1
// for (int j = 1; j <= nsp1; j++) {
//     System.out.print("\t");
// }

//     System.out.print("*\t");
// for (int j = 1; j <=nsp2; j++) {
//     System.out.print("\t");
// }
//     if(i!=1 && i!=n)
//     {
//         System.out.print("*\t");
//     }        
// if(i<=n/2)
// {
//     nsp2+=2;
//     nsp1--;
// }
// else{
//     nsp1+=1;
//     nsp2-=2;
// }
// System.out.println();
//     }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://nados.io/question/pattern-11 link
// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int no=1;
//         int ns=0;
//         int num=1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= no; j++) {
//                 System.out.print(num+"\t");
//                 num++;
//             }
//             no=no+1;
//             System.out.println("\n");
//         }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-12 link
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int no=1;
// int ns=0;
// int a=0;
// int b=1;
// int c;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= no; j++) {
//         System.out.print(a+"\t");
//         c=a+b;
//         a=b;
//         b=c;
      
//     }
//     no=no+1;
//     System.out.println("\n");
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-13 link
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for (int i = 0; i < n; i++) {
//         int num=1;

//         for (int j = 0; j <= i; j++) {
//                 System.out.print(num+"\t");
//                 num=num*(i-j)/(j+1);
//                 // num=newnum;
//         }
//         System.out.println();
        
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-14 link
// print table
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=1;i<=10;i++)
// {
//         System.out.println(n+" * "+i+" = "+n*i);
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // https://nados.io/question/pattern-15 link(GOOD QUESTION)
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int nst=1;
// int nsp=n/2;
// int row=1;
// for(int i=1;i<=10;i++)
// {       
//         int number=row;
//         for (int j = 1; j <=nsp; j++) {
//                 System.out.print("\t");
//         }
//         for (int j = 1; j <=nst; j++) {
               
//                if(j<=nst/2)
//                { System.out.print(number+"\t");
//                         number++;
//                }
//                else{
//                 System.out.print(number+"\t");
//                 number--;
//                }
              
//         }
//         if(i<=n/2)
//         {
//         nsp--;
//         nst++;
//         nst++;
//         row++;
//         }
//         else{
//                 nsp++;
//                 nst--;
//                 nst--;
//                 row--;
//         }
      
//         System.out.println("");
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // // https://nados.io/question/pattern-16 link(GOOD QUESTION)
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int nsp=2*n-3;
// int nst=1;
// for (int i = 1; i <= n; i++) {
      
//         for (int j = 1; j <= nst; j++) {
//                 System.out.print(j+"\t");
               
//         }
//         for (int j = 1; j <=nsp; j++) {
//                 System.out.print("\t");   

//         }
//     if(i==n)
//     {
//             nst--;
//     }
//         for (int j = nst; j >= 1; j--) {
//                 System.out.print(j+"\t");
//         }

//         nsp--;
//         nsp--;
//         nst++;
//         System.out.println("");
        
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // // https://nados.io/question/pattern-17 link(GOOD QUESTION).
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int nsp=n/2;
// int nst=1;
// for (int i = 1; i <= n; i++) {
       
        
//                 for (int j = 1; j <=nsp; j++) {
//                         if(i==n/2+1)
//                                  System.out.print("*\t");
//                         else
//                         System.out.print("\t");

                                       
//                                 }

     
//         for (int j = 1; j <= nst; j++) {
//                 System.out.print("*\t");
               
        
// }
//         if(i<=n/2)
//         {
//                 nst++;
//         }
//         else{
//                 nst--;
//         }

//         System.out.println("");
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // // https://nados.io/question/pattern-18 link(GOOD QUESTION).
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int nst=n;
// int nsp=0;
// for (int i = 1; i <= n; i++) {
      
//                 for (int j = 1; j <= nsp; j++) {
                        
//                         System.out.print("\t");
                       
                       
//                 }
//                 for (int j = 1; j <=nst; j++) {
//                         if(i>1 && i<=n/2 && j>1 && j<nst)
//                         {
//                                 System.out.print("\t"); 
//                         }
//                         else{
//                         System.out.print("*\t");   
//                         }
        
//                 }
//             if(i<=n/2)
//             {
//                     nsp++;
//         nst--;
//         nst--;
//            }
//            else{
//                    nst++;
//                    nst++;
//                    nsp--;
//            }
        
      
//                 System.out.println("");
                
//         }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // // https://nados.io/question/pattern-18 link(GOOD QUESTION).
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for (int i = 1; i <= n; i++) {
//    for (int j = 1; j <= n; j++) {
//            ///1st
//          if(i==1)
//          {
//                 if(j==1 || (j>=n/2+1 && j<=n))
//                 {
//                         System.out.print("*\t");      
//                 }
//                 else
//                 {
//                        System.out.print("\t");   
//                 }



//                 //  if(j==n || j<=n/2+1)
//                 //  {
//                 //          System.out.print("*\t");
//                 //  }
//                 //  else
//                 //  {
//                 //         System.out.print("\t");   
//                 //  }
//          }
//          //2nd
//          else if(i>1 && i<n/2+1)
//         {
//                 // if(j==n || j==n/2+1)
//                 // {
//                 //         System.out.print("*\t");
//                 // }
//                 // else
//                 // {
//                 //        System.out.print("\t");   
//                 // }

//                 if(j==1 || j==n/2+1)
//                 {
//                         System.out.print("*\t");
//                 }
//                 else
//                 {
//                        System.out.print("\t");   
//                 }
//         }
//         //3rd
//         else if(i==n/2+1)
//         {
//                 System.out.print("*\t");
//         }
//         ///4th
//         else if(i>n/2+1 && i<n)
//         {
//                 // if(j==1 || j==n/2+1)
//                 // {
//                 //         System.out.print("*\t");
//                 // }
//                 // else
//                 // {
//                 //        System.out.print("\t");   
//                 // }


//                 if(j==n || j==n/2+1)
//                 {
//                         System.out.print("*\t");
//                 }
//                 else
//                 {
//                        System.out.print("\t");   
//                 }

//         }
//         else
//         {

//                 if(j==n || j<=n/2+1)
//                 {
//                         System.out.print("*\t");
//                 }
//                 else
//                 {
//                        System.out.print("\t");   
//                 }

//                 // if(j==1 || (j>=n/2+1 && j<=n))
//                 // {
//                 //         System.out.print("*\t");      
//                 // }
//                 // else
//                 // {
//                 //        System.out.print("\t");   
//                 // }
//         }
        
         
           
//    }     
  
//    System.out.println();
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// // // https://nados.io/question/pattern-19 link(GOOD QUESTION).
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for (int i = 1; i <= n; i++) {

//         for (int j = 1; j <= n; j++) {
//                 if(i<n/2+1)
//                 {
//                         if(j==1 || j==n)
//                         {
//                                 System.out.print("*\t");
//                         }
//                         else{
//                                 System.out.print("\t");
//                         }
//                 }
//                 else{
//                         if(j==1 || i-j==0 || i+j==n+1 || j==n)
//                         {
//                                 System.out.print("*\t");     
//                         }
//                         else{
//                                 System.out.print("\t");
//                         }
//                 }
                
//         }
//         System.out.println();
// }

///////////////////////21extra M pattern
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= n; j++) {
                if(i<n/2+1)
                {
                        if(j==1 || i-j==0 || i+j==n+1 || j==n)
                        {
                                System.out.print("*\t");     
                        }
                        else{
                                System.out.print("\t");
                        } 


                        // if(j==1 || j==n)
                        // {
                        //         System.out.print("*\t");
                        // }
                        // else{
                        //         System.out.print("\t");
                        // }
                }
                else{

                        if(j==1 || j==n)
                        {
                                System.out.print("*\t");
                        }
                        else{
                                System.out.print("\t");
                        }
                        // if(j==1 || i-j==0 || i+j==n+1 || j==n)
                        // {
                        //         System.out.print("*\t");     
                        // }
                        // else{
                        //         System.out.print("\t");
                        // }
                }
                
        }
        System.out.println();
}





}
    
}
