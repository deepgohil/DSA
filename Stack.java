
// // import java.io.*;
// // import java.util.*;

// // public class Main {

// // public static void main(String[] args) throws Exception {

// // Scanner sc=new Scanner(System.in);
// // String exp=sc.nextLine();

// // Stack<Character> st=new Stack<>();

// // for(int i=0;i<exp.length();i++)
// // {
// //     char ch=exp.charAt(i);
// //     if(ch ==')')
// //     {
// //         if(st.peek()=='(')
// //         {
// //            System.out.println("true");
// //             return;
// //         }
    
// //     while(st.peek()!='(')
// //     {
// //         st.pop();
// //     }
// //     st.pop();
    
// //     }
// //     else
// //     {
// //         st.push(ch);
// //     }
    
// // }

// //   System.out.println("false");


// //     }

// // }











// ///////////////////////////////balanced bracket
// // import java.io.*;
// // import java.util.*;

// // public class Main {

// //     public static void main(String[] args) throws Exception {
// // Scanner sc=new Scanner(System.in);
// // String exp=sc.nextLine();

// // System.out.println(isBalanced(exp));

// //     }
// //     public static boolean isBalanced(String exp)
// //     {
        
// // Stack<Character> st=new Stack<>();


// // for(int i=0;i<exp.length();i++)
// // {
// //     char ch=exp.charAt(i);
// //     if(ch=='(' || ch=='{' || ch=='[')
// //     {
// //         st.push(ch);
// //     }
// //    else if(ch==')' || ch=='}' || ch==']')
// //    {
// //        if(st.size()==0)
// //        {
// //            return false;
           
// //        }
// //        if(ch==')' && st.peek()!='(')
// //        {
// //            return false;
// //        }
// //        if(ch=='}' && st.peek()!='{')
// //        {
// //            return false;
// //        }
// //        if(ch==']' && st.peek()!='[')
// //        {
// //            return false;
// //        }
// //        st.pop();
       
// //    }
    
// // }
// // if(st.size()!=0)
// // {
// //     return false;
// // }
// // return true;
// //     }

// // }



// //////////////////////////////////////Stock span

// // import java.io.*;
// // import java.util.*;

// // public class Main{
// //   public static void display(int[] a){
// //     StringBuilder sb = new StringBuilder();

// //     for(int val: a){
// //       sb.append(val + "\n");
// //     }
// //     System.out.println(sb);
// //   }

// // public static void main(String[] args) throws Exception {
// //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// //     int n = Integer.parseInt(br.readLine());
// //     int[] a = new int[n];
// //     for(int i = 0; i < n; i++){
// //        a[i] = Integer.parseInt(br.readLine());
// //     }

// //     int[] span = solve(a);
// //     display(span);
// //  }


// //  public static int[] solve(int[] arr){
// //    // solve
// //    int n=arr.length;
// //    int[] ans = new int[n];
// //    ans[0]=1;
// //    Stack<Integer> st=new Stack<Integer>();
// //    st.push(0);
 
// //   for(int idx=1;idx<n;idx++)
// //   {
// //       int data=arr[idx];
// //       while(st.size()>0 && data>=arr[st.peek()])
// //       {
// //           st.pop();
// //       }
// //       if(st.size()==0)
// //       {
// //           ans[idx]=idx+1;
// //       }
// //       else{
// //           ans[idx]=idx-st.peek();
// //       }
// //       st.push(idx);
// //   }
   
   
   
// //    return ans;
// //  }
// // }



// // 1. You are given a postfix expression.
// // 2. You are required to evaluate it and print it's value.
// // 3. You are required to convert it to infix and print it.
// // 4. You are required to convert it to prefix and print it.

// // Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// // Constraints
// // 1. Expression is a valid postfix expression
// // 2. The only operators used are +, -, *, /
// // 3. All operands are single digit numbers.

// // Format
// // Input
// // Input is managed for you

// // Output
// // value, a number
// // infix
// // prefix

// // Example
// // Sample Input

// // 264*8/+3-

// // Sample Output
// // 2
// // ((2+((6*4)/8))-3)
// // -+2/*6483


// // ///////////////////////////////////////////////////////////////////code
// // import java.io.*;
// // import java.util.*;

// // public class Main{
  

// // public static void main(String[] args) throws Exception {
// //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //     String exp = br.readLine();

// //     // code
// //     Stack<Integer> eval=new Stack<>();
// //     Stack<String> infi=new Stack<>();
// //     Stack<String> prefi=new Stack<>();

// //     for (int i = 0; i < exp.length(); i++) {
// //         char ch=exp.charAt(i);
// //         if(ch=='+' || ch=='-' || ch=='*' ||ch=='/')
// //         {
// //             int val_2=eval.pop(),val_1=eval.pop();
// //             if(ch=='+') eval.push(val_1+val_2);
// //             if(ch=='-') eval.push(val_1-val_2);
// //             if(ch=='*') eval.push(val_1*val_2);
// //             if(ch=='/') eval.push(val_1/val_2);

// //             String val2=infi.pop(),val1=infi.pop();
// //             infi.push('('+val1+ch+val2+')');
// //             val2=prefi.pop();
// //             val1=prefi.pop();
// //             prefi.push(ch+val1+val2);
        
        
// //         }

// //         else
// //         {
// //             eval.push(Integer.parseInt(ch+""));
// //             infi.push(ch+"");
// //             prefi.push(ch+"");
// //         }
        
// //     }
// //     System.out.println(eval.peek());
// //     System.out.println(infi.peek()+'\n'+prefi.peek());
    


// //  }
// // }


// // 1. You are given a prefix expression.
// // 2. You are required to evaluate it and print it's value.
// // 3. You are required to convert it to infix and print it.
// // 4. You are required to convert it to postfix and print it.

// // Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// // Constraints
// // 1. Expression is a valid prefix expression
// // 2. The only operators used are +, -, *, /
// // 3. All operands are single digit numbers.

// // Format
// // Input
// // Input is managed for you

// // Output
// // value, a number
// // infix
// // prefix

// // Example
// // Sample Input

// // -+2/*6483

// // Sample Output
// // 2
// // ((2+((6*4)/8))-3)
// // 264*8/+3-

// // import java.io.*;
// // import java.util.*;

// // public class Main{
  

// // public static void main(String[] args) throws Exception {
// //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //     String exp = br.readLine();

// //     // code
// //     Stack<Integer> eval=new Stack<>();
// //     Stack<String> infi=new Stack<>();
// //     Stack<String> postfi=new Stack<>();

// //     for (int i = exp.length()-1; i >= 0; i--) {
// //         char ch=exp.charAt(i);
// //         if(ch=='+' || ch=='-' || ch=='*' ||ch=='/')
// //         {
// //             int val_1=eval.pop(),val_2=eval.pop();
// //             if(ch=='+') eval.push(val_1+val_2);
// //             if(ch=='-') eval.push(val_1-val_2);
// //             if(ch=='*') eval.push(val_1*val_2);
// //             if(ch=='/') eval.push(val_1/val_2);

// //             String val1=infi.pop(),val2=infi.pop();
// //             infi.push('('+val1+ch+val2+')');
// //             val1=postfi.pop();
// //             val2=postfi.pop();
// //             postfi.push(val1+val2+ch);
        
        
// //         }

// //         else
// //         {
// //             eval.push(Integer.parseInt(ch+""));
// //             infi.push(ch+"");
// //             postfi.push(ch+"");
// //         }
        
// //     }
// //     System.out.println(eval.peek());
// //     System.out.println(infi.peek()+'\n'+postfi.peek());
    


// //  }
// // }




// // ///////////////////////incomplete infix eval
// // import java.io.*;
// // import java.util.*;

// // public class Main{
  

// // public static void main(String[] args) throws Exception {
// //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //     String exp = br.readLine();

// //     Stack<Integer> oprand=new Stack<>();
// //     Stack<Character> oprator=new Stack<>();


// //     for (int i = 0; i < exp.length(); i++) {
// //         char ch=exp.charAt(i);
// //         if(ch>='0'&&ch<='9')
// //         {
// //             oprand.push(Integer.parseInt(ch+""));
// //         }
// //         else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
// //         {
// //             while(oprator.size()>0 && oprator.peek()!='(' && prec(ch)>=prec(oprator.peek()))
// //             {
// //                 char m_oprn=oprator.peek();
// //                 eval(oprand,m_oprn);
// //             }
// //             oprator.push(ch);
// //         }
// //         else if(ch=='(')
// //         {
// //             oprator.push(ch);

// //         }
// //         else if(ch==')')
// //         {
// //             while(oprator.peek()!='(')
// //             {
// //                 char oprn=oprator.peek();
// //                 eval(oprand,oprn);
// //             }
// //           oprator.pop();  
// //         }
        

// //     }
// //   while(oprator.size()>0)
// //     {
// //     char m_oprn=oprator.pop();
// //     eval(oprand,m_oprn);
// //     }

// //     System.out.println(oprand.peek());
 
// //     // code
// //  }
// //  public static void eval(Stack<Integer> opraNd,char ch)
// //  {
// //      int val_2=opraNd.pop(),val_1=opraNd.pop();
// //      if(ch=='+') opraNd.push(val_1+val_2);
// //      else if(ch=='-') opraNd.push(val_1-val_2);
// //      else if(ch=='*') opraNd.push(val_1*val_2);
// //      else if(ch=='/') opraNd.push(val_1/val_2);
// //  }

// //   public static int prec(char opr)
// // { 
// // if(opr=='+')
// // {
// //     return 1;
// // }
// // if(opr=='-')
// // {
// //     return 1;
// // }
// // else 
// // {
// //     return 2;
// // }

// //  }
// // }



// import java.io.*;
// import java.util.*;

// public class Main {

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String exp = br.readLine();

//     // code
//     Stack<Integer> operands = new Stack<>();
//     Stack<Character> operators = new Stack<>();

//     for (int i = 0; i < exp.length(); i++) {
//       char ch = exp.charAt(i);

//       if (ch == '(') {
//         operators.push(ch);
//       } else if (Character.isDigit(ch)) {
//         operands.push(ch - '0');
//       } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//         while (operators.size() > 0 && operators.peek() != '(' && 
//                precedence(ch) <= precedence(operators.peek())) {
//           int val2 = operands.pop();
//           int val1 = operands.pop();
//           char op = operators.pop();

//           int opval = operation(val1, val2, op);
//           operands.push(opval);
//         }

//         operators.push(ch);
//       } else if (ch == ')') {
//         while (operators.size() > 0 && operators.peek() != '(') {
//           int val2 = operands.pop();
//           int val1 = operands.pop();
//           char op = operators.pop();

//           int opval = operation(val1, val2, op);
//           operands.push(opval);
//         }

//         if (operators.size() > 0) {
//           operators.pop();
//         }
//       }
//     }

//     while (operators.size() > 0) {
//       int val2 = operands.pop();
//       int val1 = operands.pop();
//       char op = operators.pop();

//       int opval = operation(val1, val2, op);
//       operands.push(opval);
//     }

//     int val = operands.pop();
//     System.out.println(val);
//   }

//   public static int precedence(char op){
//     if(op == '+'){
//       return 1;
//     } else if(op == '-'){
//       return 1;
//     } else if(op == '*'){
//       return 2;
//     } else {
//       return 2;
//     }
//   }

//   public static int operation(int val1, int val2, char op){
//     if(op == '+'){
//       return val1 + val2;
//     } else if(op == '-'){
//       return val1 - val2;
//     } else if(op == '*'){
//       return val1 * val2;
//     } else {
//       return val1 / val2;
//     }
//   }
// }
                                
// //////////////////////////////////////////////////////////////////////////
// // Celebrity Problem
// // Easy

// // 1. You are given a number n, representing the number of people in a party.
// // 2. You are given n strings of n length containing 0's and 1's
// // 3. If there is a '1' in ith row, jth spot, then person i knows about person j.
// // 4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
// // 5. If there is a celebrity print it's index otherwise print "none".

// // Note -> There can be only one celebrity. Think why?

// // Constraints
// // 1 <= n <= 10^4
// // e1, e2, .. n * n elements belongs to the set (0, 1)

// // Format
// // Input
// // Input is managed for you

// // Output
// // Index of celebrity or none

// // Example
// // Sample Input

// // 4
// // 0000
// // 1011
// // 1101
// // 1110

// // Sample Output
// // 0

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[][] arr = new int[n][n];

//         for (int j = 0; j < n; j++) {
//             String line = br.readLine();
//             for (int k = 0; k < n; k++) {
//                 arr[j][k] = line.charAt(k) - '0';
//             }
//         }

//         findCelebrity(arr);
//     }

//     public static void findCelebrity(int[][] arr) {
//         // if a celebrity is there print it''s index (not position), if there is not then print "none"
//         Stack < Integer > st = new Stack < > ();
//         for (int i = 0; i < arr.length; i++) {
//             st.push(i);
//         }

//         while (st.size() > 1) {
//             int i = st.pop();
//             int j = st.pop();

//             if (arr[i][j] == 1) {
//                 st.push(j);
//             } else {
//                 st.push(i);
//             }
//         }

//         int pot = st.pop();
//         boolean flag = true;
//         for (int i = 0; i < arr.length; i++) {
//             if (i != pot) {
//                 if (arr[i][pot] == 0 || arr[pot][i] == 1) {
//                     flag = false;
//                     break;
//                 }
//             }
//         }

//         if (flag) {
//             System.out.println(pot);
//         } else {
//             System.out.println("none");
//         }
//     }

// }



// Normal Stack
// Easy  Prev   Next
// 1. You are required to complete the code of our CustomStack class. The class should mimic the behaviour of java.util.Stack class and implement LIFO semantic.
// 2. Here is the list of functions that you are supposed to complete
//    2.1. push -> Should accept new data if there is space available in the underlying 
//    array or print "Stack overflow" otherwise.
//    2.2. pop -> Should remove and return last data if available or print "Stack 
//    underflow" otherwise and return -1.
//    2.3. top -> Should return last data if available or print "Stack underflow" 
//    otherwise and return -1.
//    2.4. size -> Should return the number of elements available in the stack.
//    2.5. display -> Should print the elements of stack in LIFO manner (space- 
//    separated) ending with a line-break.
// 3. Input and Output is managed for you.



// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class CustomStack {
//     int[] data;
//     int tos;

//     public CustomStack(int cap) {
//       data = new int[cap];
//       tos = -1;
//     }

//     int size() {
//       // write ur code here
//       return tos+1;
//     }

//     void display() {
//       // write ur code here
//       for (int i = tos; i >=0; i--) {
//         System.out.print(this.data[i]+" ");
//       }
//       System.out.println();

//     }

//     void push(int val) {
//       // write ur code here
//       if(this.size()==data.length)
//       {
//         System.out.println("Stack overflow");
//         return;
//       }
      
//         tos+=1;
//         data[tos]=val;
   
//     }

//     int pop() {
//       // write ur code here
//       if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
    
//       int val=data[tos];
//       data[tos]=0;
//       tos-=1;
//       return val;
//     }

//     int top() {
//        // write ur code here
//       if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
//       return data[tos];
//       }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int n = Integer.parseInt(br.readLine());
//     CustomStack st = new CustomStack(n);

//     String str = br.readLine();
//     while(str.equals("quit") == false){
//       if(str.startsWith("push")){
//         int val = Integer.parseInt(str.split(" ")[1]);
//         st.push(val);
//       } else if(str.startsWith("pop")){
//         int val = st.pop();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("top")){
//         int val = st.top();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("size")){
//         System.out.println(st.size());
//       } else if(str.startsWith("display")){
//         st.display();
//       }
//       str = br.readLine();
//     }
//   }
// // }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////// S&Q impl lec 4 rewatch
// Normal Queue
// Easy

// 1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
// 2. Here is the list of functions that you are supposed to complete
//      2.1. add -> Should accept new data if there is space available in the underlying 
//      array or print "Queue overflow" otherwise.
//      2.2. remove -> Should remove and return value according to FIFO, if available or 
//      print "Queue underflow" otherwise and return -1.
//      2.3. peek -> Should return value according to FIFO, if available or print "Queue 
//      underflow" otherwise and return -1.
//      2.4. size -> Should return the number of elements available in the queue.
//      2.5. display -> Should print the elements of queue in FIFO manner (space- 
//      separated) ending with a line-break.
// 3. Input and Output is managed for you.

// Constraints
// None

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// 5
// add 10
// display
// add 20
// display
// add 30
// display
// add 40
// display
// add 50
// display
// add 60
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// quit

// Sample Output
// 10 
// 10 20 
// 10 20 30 
// 10 20 30 40 
// 10 20 30 40 50 
// Queue overflow
// 10 20 30 40 50 
// 10
// 10
// 20 30 40 50 
// 20
// 20
// 30 40 50 
// 30
// 30
// 40 50 
// 40
// 40
// 50 
// 50
// 50

// Queue underflow
// Queue underflow

// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class CustomQueue {
//     int[] data;
//     int front;
//     int size;

//     public CustomQueue(int cap) {
//       data = new int[cap];
//       front = 0;
//       size = 0;
//     }

//     int size() {
//       // write ur code here
//       return size;
//     }

//     void display() {
//       // write ur code here
//       int n=data.length;
//       for (int i = 0; i < this.size; i++) {
//         System.out.print(data[(this.front+i)%n]+" ");
//       }
//       System.out.println();
//     }

//     void add(int val) {
//       // write ur code here
//       if(this.size==this.data.length)
//       {
//     System.out.println("Queue overflow");
//     return;
//       }
//       int idx=(this.front+this.size)%this.data.length;
//       this.data[idx]=val;
//       size++;

//     }

//     int remove() {
//       // write ur code here
//         if(this.size==0)
//        {
//          System.out.println("Queue underflow");
//          return -1;
//        }
//       int val=data[front];
//       data[front]=0;
//       size--;
//       front=(front+1)%this.data.length;
//       return val;
//     }

//     int peek() {
//        // write ur code here
//        if(this.size==0)
//        {
//          System.out.println("Queue underflow");
//          return -1;
//        }
//       int val=data[front];
//       return val;
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int n = Integer.parseInt(br.readLine());
//     CustomQueue qu = new CustomQueue(n);

//     String str = br.readLine();
//     while(str.equals("quit") == false){
//       if(str.startsWith("add")){
//         int val = Integer.parseInt(str.split(" ")[1]);
//         qu.add(val);
//       } else if(str.startsWith("remove")){
//         int val = qu.remove();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("peek")){
//         int val = qu.peek();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("size")){
//         System.out.println(qu.size());
//       } else if(str.startsWith("display")){
//         qu.display();
//       }
//       str = br.readLine();
//     }
//   }
// }



// 1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
// 2. Here is the list of functions that are written in the class
//     2.1. add -> Accepts new data if there is space available in the underlying array or 
//     print "Queue overflow" otherwise.
//     2.2. remove -> Removes and returns value according to FIFO, if available or print 
//     "Queue underflow" otherwise and return -1.
//     2.3. peek -> Returns value according to FIFO, if available or print "Queue 
//      underflow" otherwise and return -1.
//     2.4. size -> Returns the number of elements available in the queue.
//     2.5. display -> Prints the elements of queue in FIFO manner (space-separated) 
//     ending with a line-break.
// 3. Input and Output is managed for you.

// Constraints
// None

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// 5
// add 10
// display
// add 20
// display
// add 30
// display
// add 40
// display
// add 50
// display
// add 60
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// quit

// Sample Output
// 10 
// 10 20 
// 10 20 30 
// 10 20 30 40 
// 10 20 30 40 50 
// 10 20 30 40 50 60 
// 10
// 10
// 20 30 40 50 60 
// 20
// 20
// 30 40 50 60 
// 30
// 30
// 40 50 60 
// 40
// 40
// 50 60 
// 50
// 50
// 60 
// 60
// 60
// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class CustomQueue {
//     int[] data;
//     int front;
//     int size;

//     public CustomQueue(int cap) {
//       data = new int[cap];
//       front = 0;
//       size = 0;
//     }

//     int size() {
//       // write ur code here
//       return size;
//     }

//     void display() {
//       // write ur code here
//       for(int i = 0; i < size; i++){
//         int idx = (front + i) % data.length;
//         System.out.print(data[idx] + " ");
//       }
//       System.out.println();
//     }

//     // change this code
//     void add(int val) {
//       // write ur code here
//       if(size == data.length){
//         int[] newData=new int[2*this.data.length];

//       for(int i = 0; i < size; i++){
//        int idx = (front + i) % data.length;
//        newData[i]=data[idx];
//       }
//       front=0;
//       this.data=newData;
//       this.add(val);
//       } 
//       else {
//         int idx = (front + size) % data.length;
//         data[idx] = val;
//         size++;
//       }
//     }

//     int remove() {
//       // write ur code here
//       if(size == 0){
//         System.out.println("Queue underflow");
//         return -1;
//        } else {
//         int val = data[front];

//         front = (front + 1) % data.length;
//         size--;

//         return val;
//        }
//     }

//     int peek() {
//        // write ur code here
//        if(size == 0){
//         System.out.println("Queue underflow");
//         return -1;
//        } else {
//         int val = data[front];
//         return val;
//        }
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int n = Integer.parseInt(br.readLine());
//     CustomQueue qu = new CustomQueue(n);

//     String str = br.readLine();
//     while(str.equals("quit") == false){
//       if(str.startsWith("add")){
//         int val = Integer.parseInt(str.split(" ")[1]);
//         qu.add(val);
//       } else if(str.startsWith("remove")){
//         int val = qu.remove();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("peek")){
//         int val = qu.peek();
//         if(val != -1){
//           System.out.println(val);
//         }
//       } else if(str.startsWith("size")){
//         System.out.println(qu.size());
//       } else if(str.startsWith("display")){
//         qu.display();
//       }
//       str = br.readLine();
//     }
//   }
// }



// Queue To Stack Adapter - Push Efficient
// Easy

// 1. You are required to complete the code of our QueueToStackAdapter class. 
// 2. As data members you've two queues available - mainQ and helperQ. mainQ is to contain data and helperQ is to assist in operations. (This is cryptic - take hint from video)
// 3. Here is the list of functions that you are supposed to complete
//      3.1. push -> Should accept new data in LIFO manner.
//      3.2. pop -> Should remove and return data in LIFO manner. If not available, print 
//       Stack underflow" and return -1.
//      3.3. top -> Should return data in LIFO manner. If not available, print "Stack 
//      underflow" and return -1.
//      3.4. size -> Should return the number of elements available in the stack.
// 4. Input and Output is managed for you.

// Note -> push and size should work in constant time. pop and top should work in linear time.

// Constraints
// Note -> push and size should work in constant time. pop and top should work in linear time.

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// push 10
// push 20
// push 5
// push 8
// push 2
// push 4
// push 11
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// quit

// Sample Output
// 11
// 7
// 11
// 4
// 6
// 4
// 2
// 5
// 2
// 8
// 4
// 8
// 5
// 3
// 5
// 20
// 2
// 20
// 10
// 1
// 10

// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class QueueToStackAdapter {
//     Queue<Integer> mainQ;
//     Queue<Integer> helperQ;

//     public QueueToStackAdapter() {
//       mainQ = new ArrayDeque<>();
//       helperQ = new ArrayDeque<>();
//     }

//     int size() {
//       // write your code here
//       return mainQ.size();
//     }

//     void push(int val) {
//       // write your code here
//       mainQ.add(val);
//     }

//     int pop() {
//       if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
//       else
//       {
//         while(mainQ.size()!=1)
//         {
//           helperQ.add(mainQ.remove());

//         }
//         int tme=mainQ.remove();

//         Queue<Integer> tempQ=mainQ;
//         mainQ=helperQ;
//         helperQ=tempQ;

//         return tme;

//       }
//       // write your code here
//     }

//     int top() {
//             if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
//       else
//       {
//         while(mainQ.size()!=1)
//         {
//           helperQ.add(mainQ.remove());

//         }
//         int tme=mainQ.remove();
//         helperQ.add(tme);

//         Queue<Integer> tempQ=mainQ;
//         mainQ=helperQ;
//         helperQ=tempQ;

//         return tme;

//       }
//       // write your code here
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     QueueToStackAdapter st = new QueueToStackAdapter();

//     String str = br.readLine();
//     while (str.equals("quit") == false) {
//       if (str.startsWith("push")) {
//         int val = Integer.parseInt(str.split(" ")[1]);
//         st.push(val);
//       } else if (str.startsWith("pop")) {
//         int val = st.pop();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("top")) {
//         int val = st.top();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("size")) {
//         System.out.println(st.size());
//       }
//       str = br.readLine();
//     }
//   }
// }






// Queue To Stack Adapter - Pop Efficient
// Easy

// 1. You are required to complete the code of our QueueToStackAdapter class. 
// 2. As data members you've two queues available - mainQ and helperQ. mainQ is to contain data and helperQ is to assist in operations. (This is cryptic - take hint from video)
// 3. Here is the list of functions that you are supposed to complete
//      3.1. push -> Should accept new data in LIFO manner.
//      3.2. pop -> Should remove and return data in LIFO manner. If not available, print 
//      "Stack underflow" and return -1.
//     3.3. top -> Should return data in LIFO manner. If not available, print "Stack 
//     underflow" and return -1.
//     3.4. size -> Should return the number of elements available in the stack.
// 4. Input and Output is managed for you.

// Note -> pop, top and size should work in constant time. push should work in linear time.

// Constraints
// Note -> pop, top and size should work in constant time. push should work in linear time.

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// push 10
// push 20
// push 5
// push 8
// push 2
// push 4
// push 11
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// quit

// Sample Output
// 11
// 7
// 11
// 4
// 6
// 4
// 2
// 5
// 2
// 8
// 4
// 8
// 5
// 3
// 5
// 20
// 2
// 20
// 10
// 1
// 10

// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class QueueToStackAdapter {
//     Queue<Integer> mainQ;
//     Queue<Integer> helperQ;

//     public QueueToStackAdapter() {
//       mainQ = new ArrayDeque<>();
//       helperQ = new ArrayDeque<>();
//     }

//     int size() {
//       // write your code here
//       return mainQ.size();

//     }

//     void push(int val) {
//       // write your code here
//       if(mainQ.size()==0)
//       {
//         mainQ.add(val);
//         return;
//       }
//       else{
//         helperQ.add(val);
//         while ( mainQ.size()!=0 ) {
//           helperQ.add(mainQ.remove());
//         }
         
//           Queue<Integer> tempQ=mainQ;
//           mainQ=helperQ;
//           helperQ=tempQ;

//           return;
//       }
//     }

//     int pop() {
//       // write your code here
//       if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
//       else
//       {
//       int topel=mainQ.remove();
//       return topel;
//       }
//     }

//     int top() {
//       // write your code here
//       if(this.size()==0)
//       {
//         System.out.println("Stack underflow");
//         return -1;
//       }
//       else
//       {
//       return mainQ.peek();
//       }
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     QueueToStackAdapter st = new QueueToStackAdapter();

//     String str = br.readLine();
//     while (str.equals("quit") == false) {
//       if (str.startsWith("push")) {
//         int val = Integer.parseInt(str.split(" ")[1]);
//         st.push(val);
//       } else if (str.startsWith("pop")) {
//         int val = st.pop();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("top")) {
//         int val = st.top();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("size")) {
//         System.out.println(st.size());
//       }
//       str = br.readLine();
//     }
//   }
// }


// Stack To Queue Adapter - Add Efficient
// Easy

// 1. You are required to complete the code of our StackToQueueAdapter class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
// 2. Here is the list of functions that are written in the class 
//     2.1. add -> Accepts new data if there is space available in the underlying array or 
//     print "Queue overflow" otherwise.
//     2.2. remove -> Removes and returns value according to FIFO, if available or print 
//     "Queue underflow" otherwise and return -1.
//     2.3. peek -> Returns value according to FIFO, if available or print "Queue 
//     underflow" otherwise and return -1.
//     2.4. size -> Returns the number of elements available in the queue.
// 3. Input and Output is managed for you.

// Constraints
// Note -> add and size should work in constant time. remove and peek should work in linear time.

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// add 10
// add 20
// add 30
// add 40
// add 50
// remove
// remove
// add 60
// add 70
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// quit

// Sample Output
// 10
// 20
// 30
// 30
// 40
// 40
// 50
// 50
// 60
// 60
// 70
// 70
// Queue underflow
// Queue underflow
// import java.io.*;
// import java.util.*;

// public class Main {

//   public static class StackToQueueAdapter {
//     Stack<Integer> mainS;
//     Stack<Integer> helperS;

//     public StackToQueueAdapter() {
//       mainS = new Stack<>();
//       helperS = new Stack<>();
//     }

//     int size() {
//       // write your code here
//     return mainS.size();
//     }

//     void add(int val) {
//       // write your code here
//       mainS.push(val);
//     }

//     int remove() {
//       // write your code here
//       if(this.size()==0)
//       {
//       System.out.println("Queue underflow");
//       return -1;
//       }
//       else{
//         while ( mainS.size()!=1 ) {
//           helperS.push(mainS.pop());
//         }
//         int rel=mainS.pop();
//           while ( helperS.size()!=0 ) {
//         mainS.push(helperS.pop());
//         }
//         return rel;
//       }
//     }

//     int peek() {
//       // write your code here
//       if(mainS.size()==0)
//       {
//       System.out.println("Queue underflow");
//       return -1;
//       }
//       else{
//         while ( mainS.size()!=1 ) {
//           helperS.push(mainS.pop());
//         }
//         int rel=mainS.pop();
//         helperS.push(rel);
//           while ( helperS.size()!=0 ) {
//         mainS.push(helperS.pop());
//         }
//         return rel;
//       }
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     StackToQueueAdapter qu = new StackToQueueAdapter();

//     String str = br.readLine();
//     while (str.equals("quit") == false) {
//       if (str.startsWith("add")) {
//         int val = Integer.parseInt(str.split(" ")[1]);
//         qu.add(val);
//       } else if (str.startsWith("remove")) {
//         int val = qu.remove();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("peek")) {
//         int val = qu.peek();
//         if (val != -1) {
//           System.out.println(val);
//         }
//       } else if (str.startsWith("size")) {
//         System.out.println(qu.size());
//       }
//       str = br.readLine();
//     }
//   }
// }
