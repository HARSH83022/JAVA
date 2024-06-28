import java.util.Scanner;

public class ifelse1 {
  public static void main(String[] args) {
    // int age = 18;
    System.out.println("Enter the Age");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    // if (age >= 18) {
    // System.out.println("he can be drive");
    // } else {
    // System.out.println("not eligible");
    // }
    switch (age) {
      case 18:
        System.out.println("you can drive fastly");
        break;
      case 45:
        System.out.println("ypu can drive normally");
      case 60:
        System.out.println("you can`t drive");

      default:
        System.out.println("you can enjoy your life");
        break;
    }

  }
}
