import java.util.Scanner;
class Largest {
    public static void main(String args[])
    {
        int x,y,z;
        System.out.println("Enter three numbers : ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if(x>y && x>z)
        {
            System.out.println("First Number is largest number");
        }
        else if(y>x && y>z)
        {
            System.out.println("Second Number is largest number");
        }
        else if(z>x && z>y)
        {
            System.out.println("Third Number is largest number");
        }
        else{
            System.out.println("Your entering a wrong integer value");
        }
    }
}