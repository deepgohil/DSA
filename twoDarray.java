import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        // int arr1[][] =new int[n1][n2];
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[0].length; j++) {
        //         arr1[i][j]=sc.nextInt();
        //     }
        //     System.out.println();
        // }


        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[0].length; j++) {
        //     //    sys arr1[i][j]
        //     System.out.print(arr1[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
/////////////////////////////////state of wakanda
    //     Scanner sc=new Scanner(System.in);
    //     int n1=sc.nextInt();
    //     int n2=sc.nextInt();
    //     int arr1[][] =new int[n1][n2];
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[0].length; j++) {
        //         arr1[i][j]=sc.nextInt();
        //     }
        //     System.out.println();
        // }


    //     for (int j = 0; j < arr1.length; j++) {
    //    if(j%2==0)
    //    {
    //        for (int i = 0; i < arr1.length; i++) {
    //            System.out.println(arr1[i][j]);
    //        }
           
    //    }
    //    else{
    //     for (int i = n2-1; i >=0; i--) {
    //         System.out.println(arr1[i][j]);
    //     }
    //    }
    //     }
        /////////////////////////////////////////////////////////////////////   SPIRAL DISPLAY(IMPORTANT QUESTION)
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int arr1[][] =new int[n][m];

        // for (int i = 0; i < arr1.length; i++) {
        //             for (int j = 0; j < arr1[0].length; j++) {
        //                 arr1[i][j]=sc.nextInt();
        //             }
        //             System.out.println();
        //         }

        // int cmin=0;
        // int cmax=arr1[0].length-1;
        // int rmin=0;
        // int rmax=arr1.length-1;
        // int count=0;
        // while(count<n*m)
        // {
        //     for(int row=rmin;row<=rmax;row++)
        //     {
        //         System.out.println();
        //         count++;
        //     }
        // }
        /////////////////////////////////////////////////////////////90. rotate
            //  Scanner sc=new Scanner(System.in);
            // int n=sc.nextInt();
            // int m=sc.nextInt();
            // int arr[][] =new int[n][m];
       
            // for (int i = 0; i < arr.length; i++) {
            //     for (int j = 0; j < arr[0].length; j++) {
            //         arr[i][j]=sc.nextInt();
            //     }
            //     System.out.println();
            // }
            
            // for (int i = 0; i < arr.length-1; i++) {
            //     for (int j = i; j < arr[0].length; j++) {
                   
            //        int temp=arr[i][j];
            //         arr[i][j]=arr[j][i];
            //         arr[j][i]=temp;

            //     }
            // }


            // int left=0;
            // int right=arr[0].length-1;

            // while(left<right)
            // {
            //     for (int i = 0; i < arr.length; i++) {
            //         int temp=arr[i][left];
            //         arr[i][left]=arr[i][right];
            //         arr[i][right]=temp;
            //     }
            //     left++;
            //     right--;
            // }

            // for (int i = 0; i < arr.length; i++) {
            //             for (int j = 0; j < arr[0].length; j++) {
            //                System.out.print(arr[i][j]+"\t");
            //             }
            //             System.out.println();
            //         }
 ////////////////////////////////////////////////////////////////state of wakanda
//  Scanner sc=new Scanner(System.in);
//  int n=sc.nextInt();
//  int m=sc.nextInt();
//  int arr[][] =new int[n][m];

//  for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < arr[0].length; j++) {
//          arr[i][j]=sc.nextInt();
//      }
//      System.out.println();
//  }
// // int x=0;
//  for (int dig = 0; dig < n; dig++) {
//      int i=0;
//      int j=dig;
//     while(j<n) {
       
//         System.out.print(arr[i][j]+"\t");
//         i++;
//         j++;
// // x++;
//     }
// }
           
  ////////////////////////////////////////////////////////////////state of wakanda
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int arr[][] =new int[n][m];
 
  for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
          arr[i][j]=sc.nextInt();
      }
      System.out.println();
  }

for (int i = 0; i < arr.length; i++) {
    // find min element in col
    int min=arr[i][0];
    int colno=0;
    for(int col=0;col<n;col++)
    {
if(arr[i][col]<min)
{
    min=arr[i][col];
    colno=col;
}

    }
    boolean ans=true;
for (int row = 0; row < n; row++) {
    if(arr[row][colno]>min)
    {
ans=false;
break;

    } 
}
if(ans==true)
{
    System.out.println(min);
    return ;
}

}
System.out.println("invalid input");
    }
    
}
