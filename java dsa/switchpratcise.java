import java.util.Scanner;

public class switchpratcise {
  public static void main(String[] args) {
    byte m1, m2, m3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter yours marks in physics");
    m1 = sc.nextByte();
    System.out.println("Enter yours marks in Chemistry");
    m2 = sc.nextByte();
    System.out.println("Enter your marks in Mathematics");
    m3 = sc.nextByte();

    float avg = (m1 + m2 + m3) / 3.0f;
    System.out.println("your 0verall perecentage is " + avg);
    if (avg >= 40 && m1 >= 33 && m2 >= 34 && m3 >= 45) {
      System.out.println("Congralutions,You have been promotesd");
    } else {
      System.out.println("Sorry , You have not been promoted");
    }

  }

}
