// import java.util.Scanner;

// public class temp {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Please enter a temp in C:");
//         float tempC = in.nextFloat();
//         float tempF = (tempC * 9/5) + 32;
//         System.out.println(tempF);

//     }
// }

import java.util.Scanner;

/**
  * temp
  */
 public class temp {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" please enter temp in C");
        float tempF = in.nextFloat();
        float tempC = (tempF * 9/5 + 32);
        System.out.println(tempC);
    }
 }