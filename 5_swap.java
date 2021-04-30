import java.util.Scanner;
class swap
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //getting values from user
        System.out.print("Enter the first number : ");
        int a = sc.nextInt(); // get first number
        System.out.print("Enter the second number : ");
        int b= sc.nextInt(); // get second number
        a=a^b; //calculate a^b and store in a
        b=a^b; //calculate a^b and store in b
        a=a^b; //again calculate a^b and store in a
        System.out.println("After swapping,"); // print result
        System.out.println("Value of first number : "+a);
        System.out.println("Value of second number : "+b);
    }
}