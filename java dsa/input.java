import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking the input from the user  : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:" );
        int num1 = sc.nextInt();
        System.out.println("enter the number 2  :");
        
        int num2 = sc.nextInt();
        int num3 = num1+num2;
        System.out.println("the sum of two number is "+num3);


    }
}
