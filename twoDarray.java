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
    //     for (int i = 0; i < arr1.length; i++) {
    //         for (int j = 0; j < arr1[0].length; j++) {
    //             arr1[i][j]=sc.nextInt();
    //         }
    //         System.out.println();
    //     }


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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[][] =new int[n][m];

        for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[0].length; j++) {
                        arr1[i][j]=sc.nextInt();
                    }
                    System.out.println();
                }

        int cmin=0;
        int cmax=arr1[0].length-1;
        int rmin=0;
        int rmax=arr1.length-1;
        int count=0;
        while(count<n*m)
        {
            for(int row=rmin;row<=rmax;row++)
            {
                System.out.println();
                count++;
            }
        }
   
    }
    
}
