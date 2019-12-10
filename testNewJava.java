import java.util.*;
public class testif{
    public static void main(String args[]){
        int num1,num2,num3;
        String op1,op2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1 num2 num3 : ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        System.out.print("Enter op1 op2 : ");
        op1 = scan.next();
        op2 = scan.next();
        long result =num1+op1.charAt(0)+num2+op2.charAt(0)+num3;
        //int result = num1 op1.charAt(0)  num2;
        System.out.println("Result = "+result);
        System.out.println(num1+""+op1.charAt(0)+""+num2+""+op2.charAt(0)+""+num3);
        System.out.print(1+2+3);
    }
}