

// import java.io.*;
// import java.util.*;

// public class Main {

// public static void main(String[] args) throws Exception {

// Scanner sc=new Scanner(System.in);
// String exp=sc.nextLine();

// Stack<Character> st=new Stack<>();

// for(int i=0;i<exp.length();i++)
// {
//     char ch=exp.charAt(i);
//     if(ch ==')')
//     {
//         if(st.peek()=='(')
//         {
//            System.out.println("true");
//             return;
//         }
    
//     while(st.peek()!='(')
//     {
//         st.pop();
//     }
//     st.pop();
    
//     }
//     else
//     {
//         st.push(ch);
//     }
    
// }

//   System.out.println("false");


//     }

// }











///////////////////////////////balanced bracket
// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
// Scanner sc=new Scanner(System.in);
// String exp=sc.nextLine();

// System.out.println(isBalanced(exp));

//     }
//     public static boolean isBalanced(String exp)
//     {
        
// Stack<Character> st=new Stack<>();


// for(int i=0;i<exp.length();i++)
// {
//     char ch=exp.charAt(i);
//     if(ch=='(' || ch=='{' || ch=='[')
//     {
//         st.push(ch);
//     }
//    else if(ch==')' || ch=='}' || ch==']')
//    {
//        if(st.size()==0)
//        {
//            return false;
           
//        }
//        if(ch==')' && st.peek()!='(')
//        {
//            return false;
//        }
//        if(ch=='}' && st.peek()!='{')
//        {
//            return false;
//        }
//        if(ch==']' && st.peek()!='[')
//        {
//            return false;
//        }
//        st.pop();
       
//    }
    
// }
// if(st.size()!=0)
// {
//     return false;
// }
// return true;
//     }

// }



//////////////////////////////////////Stock span

// import java.io.*;
// import java.util.*;

// public class Main{
//   public static void display(int[] a){
//     StringBuilder sb = new StringBuilder();

//     for(int val: a){
//       sb.append(val + "\n");
//     }
//     System.out.println(sb);
//   }

// public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     int[] a = new int[n];
//     for(int i = 0; i < n; i++){
//        a[i] = Integer.parseInt(br.readLine());
//     }

//     int[] span = solve(a);
//     display(span);
//  }


//  public static int[] solve(int[] arr){
//    // solve
//    int n=arr.length;
//    int[] ans = new int[n];
//    ans[0]=1;
//    Stack<Integer> st=new Stack<Integer>();
//    st.push(0);
 
//   for(int idx=1;idx<n;idx++)
//   {
//       int data=arr[idx];
//       while(st.size()>0 && data>=arr[st.peek()])
//       {
//           st.pop();
//       }
//       if(st.size()==0)
//       {
//           ans[idx]=idx+1;
//       }
//       else{
//           ans[idx]=idx-st.peek();
//       }
//       st.push(idx);
//   }
   
   
   
//    return ans;
//  }
// }



// 1. You are given a postfix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to prefix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// Constraints
// 1. Expression is a valid postfix expression
// 2. The only operators used are +, -, *, /
// 3. All operands are single digit numbers.

// Format
// Input
// Input is managed for you

// Output
// value, a number
// infix
// prefix

// Example
// Sample Input

// 264*8/+3-

// Sample Output
// 2
// ((2+((6*4)/8))-3)
// -+2/*6483


// ///////////////////////////////////////////////////////////////////code
// import java.io.*;
// import java.util.*;

// public class Main{
  

// public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String exp = br.readLine();

//     // code
//     Stack<Integer> eval=new Stack<>();
//     Stack<String> infi=new Stack<>();
//     Stack<String> prefi=new Stack<>();

//     for (int i = 0; i < exp.length(); i++) {
//         char ch=exp.charAt(i);
//         if(ch=='+' || ch=='-' || ch=='*' ||ch=='/')
//         {
//             int val_2=eval.pop(),val_1=eval.pop();
//             if(ch=='+') eval.push(val_1+val_2);
//             if(ch=='-') eval.push(val_1-val_2);
//             if(ch=='*') eval.push(val_1*val_2);
//             if(ch=='/') eval.push(val_1/val_2);

//             String val2=infi.pop(),val1=infi.pop();
//             infi.push('('+val1+ch+val2+')');
//             val2=prefi.pop();
//             val1=prefi.pop();
//             prefi.push(ch+val1+val2);
        
        
//         }

//         else
//         {
//             eval.push(Integer.parseInt(ch+""));
//             infi.push(ch+"");
//             prefi.push(ch+"");
//         }
        
//     }
//     System.out.println(eval.peek());
//     System.out.println(infi.peek()+'\n'+prefi.peek());
    


//  }
// }


// 1. You are given a prefix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to postfix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// Constraints
// 1. Expression is a valid prefix expression
// 2. The only operators used are +, -, *, /
// 3. All operands are single digit numbers.

// Format
// Input
// Input is managed for you

// Output
// value, a number
// infix
// prefix

// Example
// Sample Input

// -+2/*6483

// Sample Output
// 2
// ((2+((6*4)/8))-3)
// 264*8/+3-

// import java.io.*;
// import java.util.*;

// public class Main{
  

// public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String exp = br.readLine();

//     // code
//     Stack<Integer> eval=new Stack<>();
//     Stack<String> infi=new Stack<>();
//     Stack<String> postfi=new Stack<>();

//     for (int i = exp.length()-1; i >= 0; i--) {
//         char ch=exp.charAt(i);
//         if(ch=='+' || ch=='-' || ch=='*' ||ch=='/')
//         {
//             int val_1=eval.pop(),val_2=eval.pop();
//             if(ch=='+') eval.push(val_1+val_2);
//             if(ch=='-') eval.push(val_1-val_2);
//             if(ch=='*') eval.push(val_1*val_2);
//             if(ch=='/') eval.push(val_1/val_2);

//             String val1=infi.pop(),val2=infi.pop();
//             infi.push('('+val1+ch+val2+')');
//             val1=postfi.pop();
//             val2=postfi.pop();
//             postfi.push(val1+val2+ch);
        
        
//         }

//         else
//         {
//             eval.push(Integer.parseInt(ch+""));
//             infi.push(ch+"");
//             postfi.push(ch+"");
//         }
        
//     }
//     System.out.println(eval.peek());
//     System.out.println(infi.peek()+'\n'+postfi.peek());
    


//  }
// }




// ///////////////////////incomplete infix eval
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> oprand=new Stack<>();
    Stack<Charactor> oprator=new Stack<>();


    for (int i = 0; i < exp.length(); i++) {
        char ch=exp.charAt(i);
        if(ch>='0'&&ch<='9')
        {
            oprand.push(Integer.parse(ch+''));
        }
        if(ch=='+' ||ch=='-' ||ch=='*' ||ch=='/')
        {
            while(oprator.size()>0 && )
        }

    }
 
 
    // code
 }
 public static void eval(Stack<Integer> opraNd,char opr)
 {
     int val_2=opraNd.pop(),val_1=opraNd.pop();
     if(ch=='+') opraNd.push(val_1+val_2);
     if(ch=='-') opraNd.push(val_1-val_2);
     if(ch=='*') opraNd.push(val_1*val_2);
     if(ch=='/') opraNd.push(val_1/val_2);
 }
}
