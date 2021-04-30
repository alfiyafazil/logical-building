import java.util.Scanner;
class multiply
{
    public static void main(String args[]) {
        int mul=0;//initializing mul as zero
        Scanner sc = new Scanner(System.in);
        //getting values from user
        System.out.println("Enter the first number");
        int a = sc.nextInt(); // get first number
        System.out.println("Enter the second number");
        int b= sc.nextInt(); // get second number
        int temp1=a;
        int temp2=b; // storing a abd b in temp variables to display result
        while(b>0)//  while b is greater than 0
        {
            if((b&1)!=0)//check if b is odd
            {
                mul=mul+a; // add a to mul
            }
            a=a<<1; // double a
            b=b>>1; // halve b
        }
        System.out.println("Product is "+temp1+" and "+temp2+" is "+mul); // print mul
        
    }
}