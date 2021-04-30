import java.util.Scanner;
class one_or_not
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int num = sc.nextInt(); //get the number from user
        System.out.println("Enter the Position");
        int position= sc.nextInt(); // get the position from user
        int result=(num >> (position)); // go to the bit position within the number
        if((result&1)==1) //check if the bit is one
        {
            System.out.println("The bit is set to one");
        }
        else
        {
            System.out.println("The bit is set to zero");
        }
    }
}