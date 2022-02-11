import java.util.Scanner;
///////////////////////////////////////integer into any bas Q1
public class function {
//     public static int setvalue(int n,int b) {
//         int op=0;
//         int power=1;
//         while(n!=0)
//         {
// int rem=n%b;
// n/=b;
// op+=(rem*power);
// power*=10;

//         }
//         return op;
        
//     }
//////////////////////////////////////////////////// Q2
// public static int setvaluetoint(int num,int base) {

//     int ans=0;
//     int pow=1;
//     while(num!=0)
//     {
//         int rem=num%10;
//         num/=10;
//         ans+=rem*pow;
//         pow*=base;

//     }
//     return ans;
    
// }
/////////////////////////////////////////////////////////Q3
// public static int todec(int num,int base) {

//    int ans=0;
//     int pow=1;
//     while(num!=0)
//     {
//         int rem=num%10;
//         num/=10;
//         ans+=rem*pow;
//         pow*=base;

//     }
 
    
//     return ans;
    
// }
// public static int tobase(int num,int base) {

//     int op=0;
//             int power=1;
//             while(num!=0)
//             {
//     int rem=num%base;
//     num/=base;
//     op+=(rem*power);
//     power*=10;
    
//             }
//             return op;

    
// }


/////////////////////////////////////////////////////////Q4
// public static int sum(int b,int num1,int num2) {
//     int ans=0;
//     int power=1;
//     int carry=0;

//     while(num1!=0 || num2!=0 || carry!=0)
//     {
//         int ld1=num1%10;
//         int ld2=num2%10;

//         num1/=10;
//         num2/=10;

//         int sum=ld1+ld2+carry;

//         int rem=sum%b;
//         int quo=sum/b;

//         ans+=(rem*power);
//         carry=quo;
//         power*=10;
//     }

//     return ans;

    
// }

/////////////////////////////////////////////////////////Q5
// public static int sub(int b,int num1,int num2) {
//     int ans=0;
//     int power=1;
//     int borrow=0;

//     while(num2>0)
//     {
//         int ld1=num1%10;
//         int ld2=num2%10;

//         num1/=10;
//         num2/=10;

//         int diff=ld2-ld1-borrow;
//         if(diff<0)
//         {
// borrow=1;
// diff+=b;
//         }
//         else{
//             borrow=0;
//         }
//         ans+=(diff*power);
//         power*=10;
//     }

//     return ans;

    
// }
    public static void main(String[] args) {
    ///////////////////////////////////////Q1
// int num=sc.nextInt();
// int base=sc.nextInt();

// int output=setvalue(num,base);
// System.out.println(output);

// //////////////////////////////////////////Q2
// Scanner sc=new Scanner(System.in);
// int num=sc.nextInt();
// int base=sc.nextInt();

// int output=setvaluetoint(num,base);
// System.out.println(output);


//////////////////////////////////////////Q3
// Scanner sc=new Scanner(System.in);
// int num=sc.nextInt();
// int sbase=sc.nextInt();
// int dbase=sc.nextInt();

// int output=todec(num,sbase);

// int finaloutput=tobase(output,dbase);
// System.out.println(finaloutput);


/////////////////////////////////////////////////////////Q4
// Scanner sc=new Scanner(System.in);
// int base=sc.nextInt();
// int num1=sc.nextInt();
// int num2=sc.nextInt();

// int sum=sum(base,num1,num2);

// System.out.println(sum);

/////////////////////////////////////////////////////////Q5
// Scanner sc=new Scanner(System.in);
// int base=sc.nextInt();
// int num1=sc.nextInt();
// int num2=sc.nextInt();

// int sub=sub(base,num1,num2);

// System.out.println(sub);

}
}
