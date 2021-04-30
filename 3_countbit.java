import java.util.Scanner;
class count
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int num = sc.nextInt(); //get the number from user
        int count=0; // set count as zero
        System.out.print("Bits in "+num+" : "); // label for printing bits
        while(num!=0) // while number is greater than zero
        {
            System.out.print((num&1)+" "); // print each bit
            count+=(num&1); // increment count by each bit
            num>>=1; // shift right to next bit
        }
        System.out.println("\nNumber of bits set to one is "+count); // print count
    }
}