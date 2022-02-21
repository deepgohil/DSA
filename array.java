import java.util.Scanner;
public class array {
//////////////////////////////////////////////////////////////Question 2

    // public static int max_arr(int arr[]) {
    //     int ans=-1;
    //     for (int i = 0; i < arr.length; i++) {  
           
    //        if(arr[i] > ans)  
    //            ans = arr[i];  
    //     }  
    //     return ans;
        
    // }
    // public static void printbar(int arr[]) {
    //     int max=max_arr(arr);
    //     for(int i=max;i>=1;i--)
    //     {
    //         for (int j = 0; j < arr.length; j++) {
    //             if(i>arr[j])
    //             {
    //                 System.out.print("\t");
    //             }
    //             else{
                 
    //                 System.out.print("*\t");
    //             }
    //         }
    //         System.out.println();

    //     }
     
        
    // }
    // public static int max(int l1,int l2) {
    //    int max=0;
    //     if(l1>l2)
    //     {
    //         max=l1;
    //     }
    //     else
    //     {
    //         max=l2;
    //     }
    //     return max;
    // }
///////////////////////////////////////////////////////////////////////Q3
// public static void sumofarr(int arr1[],int arr2[]) {
//     int max=max(arr1.length,arr2.length)+1;
//     int ans[]=new int[max];
//     int i=arr1.length-1;
//     int j=arr2.length-1;
//     int k=ans.length-1;
//     int carry=0;
//     while(k>=0)
//     {
//         int sum=0;
//         if(i>=0)
//         {
//             sum+=arr1[i];
//         }
//         if(j>=0)
//         {
//             sum+=arr2[j];
//         }
//         sum+=carry;
//         int rem=sum%10;
//         int quo=sum/10;
//         carry=quo;
//         ans[k]=rem;
//         i--;
//         j--;
//         k--;    
//     }
//     for (int x = 0; x < ans.length; x++) {
//         if(x==0 && ans[x]==0)
//         {
//         }
//         else
//         {
//             System.out.print(ans[x]);
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////sub array
// public static int tobinary(int n) {
//    int ans=0;
 
//         int power=1;
//         while(n!=0)
//         {
// int rem=n%2;
// n/=2;
// ans+=(rem*power);
// power*=10;

//         }
    
//     return ans;
// }


// public static void printdata(int arr[])
// {
// int size=(int)arr.length;
// int ts=(int)Math.pow(2, size);

// for(int i=0;i<ts;i++)
// {

// int binary=tobinary(i);
// // System.out.println(binary);
// int pow=(int)Math.pow(10,size-1 );
// for (int j = 0; j < arr.length; j++) {
//     int digit=binary/pow;
//     int rem=binary%pow;
//      if(digit==1)
//    {
//     System.out.print(arr[j]+"\t");
//    } 
//    else
//    {
//     System.out.print("_\t");   
//    }
//    binary=rem;
//    digit=pow/=10;
// }
// System.out.println("");
// }
// }
/////////////////////////////////////////////////////////////////////BINARY SEARCH
public static int binarysearch(int arr[],int data) {
    int index=-1;
    int floor=-1;
    int seal =-1;
    int left=0;
    int right=(int) arr.length-1;
    while (left<=right) {
        int mid=(left+right)/2;
        if(arr[mid]==data)
        {
             return arr[mid];
        }
        else if(arr[mid]<data)
        {
            floor=arr[mid];
            left=mid+1;
        }
        else
        {
            seal=arr[mid];
            right=mid-1;
        }
        // return index;
    }
    System.out.println(seal+"\t"+floor);
    return 0;
}

    public static void main(String[] args) {
        // //////////////////////////////Q1 scale
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[] =new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // int max=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
        // }

        // int min=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        // System.out.println(max-min);
        // // arr.length;
        // System.out.println(arr.length);

        //////////////////////////////////////////////////////////////////Q2 
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[] =new int[n];

        //     for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }

        // printbar(arr);

        /////////////////////////////////////////////////////////////////////////Q3
        // Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int arr1[] =new int[n1];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i]=sc.nextInt();
        // }

        // int n2=sc.nextInt();
        // int arr2[] =new int[n2];
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i]=sc.nextInt();
        // }

        // sumofarr(arr1, arr2);

        
        /////////////////////////////////////////////////////////////////////////Q4(HW) home work






        /////////////////////////////////////////////sub set (array)
        //  Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int arr1[] =new int[n1];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i]=sc.nextInt();
        // }
        // printdata(arr1);

        /////////////////////////////////////////////Binary search
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[] =new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        int index=binarysearch(arr1,10);
        System.err.println(index+"\t");
    }
    
}
