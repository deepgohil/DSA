import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception {

Scanner sc=new Scanner(System.in);
String exp=sc.nextLine();

Stack<Character> st=new Stack<>();

for(int i=0;i<exp.length();i++)
{
    char ch=exp.charAt(i);
    if(ch ==')')
    {
        if(st.peek()=='(')
        {
           System.out.println("true");
            return;
        }
    
    while(st.peek()!='(')
    {
        st.pop();
    }
    st.pop();
    
    }
    else
    {
        st.push(ch);
    }
    
}

  System.out.println("false");


    }

}











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

