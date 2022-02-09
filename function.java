import java.util.Scanner;

public class function {
    public static int setvalue(int n,int b) {
        int op=0;
        int power=1;
        while(n!=0)
        {
int rem=n%b;
n/=b;
op+=(rem*power);
power*=10;

        }
        return op;
        
    }
    public static void main(String[] args) {
    ///////////////////////////////////////integer into any base
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int base=sc.nextInt();

int output=setvalue(num,base);
System.out.println(output);


    }
}
