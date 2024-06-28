public class stringPractise {
    public static void main(String[] args) {
    //                                                                           Problem 1
    String name = "Harsh Mishra";
    name = name.toLowerCase();
    System.out.println(name);
    //                                                                           Problem2 
    String text = "To Lower Case";
    text = text.replace(" ", " _--");
    System.out.println(text);
    //                                                                           Problem3

     String letter = "Dear <|name|>, Thanks a lot!";
     letter = letter.replace("<|name|>","HARSH");
     System.out.println(letter);
//                                                                                problem 4
    String myString = "This string contain double   and    triple spaces ";
    System.out.println(myString.indexOf("    "));
    System.out.println(myString.indexOf("  "));
//                                                                                 Problem 5
    String name1 = " HI this is harsh Mishra!\n\t How are you?";
    System.out.println(name1.toUpperCase());
    System.out.println(name1.toLowerCase());
    

    }
}
