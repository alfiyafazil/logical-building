import java.util.Scanner;
class bitwise
{
    public static void main(String args[]) {
        int a,b,and,or,xor,left,right,zero;//declaring variables
        Scanner sc = new Scanner(System.in);
        //getting values from user
        System.out.print("Enter the first number : "); 
        a = sc.nextInt(); // get first number
        System.out.print("Enter the second number : ");
        b= sc.nextInt(); // get second number
        and=a&b; // bitwise and
        System.out.println(a+" & "+b+" = "+and);
        or=a|b; // bitwise or
        System.out.println(a+" | "+b+" = "+or);
        xor=a^b; // bitwise XOR
        System.out.println(a+" ^ "+b+" = "+xor); 
        System.out.println("~"+a+" = "+(~a)); // bitwise compliment
        System.out.println("~"+b+" = "+(~b)); // bitwise compliment
        left=a<<b; // left shift
        System.out.println(a+" << "+b+" = "+left);
        right=a>>b; // right shift
        System.out.println(a+" >> "+b+" = "+right);
        zero=a>>>b; // zero fill right shift
        System.out.println(a+" >>> "+b+" = "+zero);
    }
}