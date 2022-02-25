/*
 * 
 * CSCI Project 10 This Program implements and test MyString class
 * 
 * Author: Cheron Fletcher
 * Date: 04/07/21
 */

public class CFletcherProject10 {

    public static void main(String[] args) {
        // create 3 myString objects

        MyString string1 = new MyString("You miss 100% of the shots you don't take.".toCharArray());
        MyString string2 = new MyString(
                "WHETHER YOU THINK YOU CAN OR YOU THINK YOU CAN'T, YOU'RE RIGHT.".toCharArray());
        MyString string3 = new MyString(
                "WHETHER YOU THINK YOU CAN OR YOU THINK YOU CAN'T, YOU'RE RIGHT.".toCharArray());

        // print out myStrings
        System.out.println();
        System.out.println("MyString1 is: ");
        string1.print();
        System.out.println("MyString2 is: ");
        string2.print();
        System.out.println("MyString3 is: ");
        string3.print();
        System.out.println();

        // test charAt
        System.out.print("Character at index 5 of MyString 1 is: ");
        System.out.println(string1.charAt(5));
        System.out.print("Character at index 10 of MyString 1 is: ");
        System.out.println(string1.charAt(10));
        System.out.print("Character at index 20 of MyString 1 is: ");
        System.out.println(string1.charAt(20));
        System.out.print("Character at index 12 of MyString 2 is: ");
        System.out.println(string2.charAt(12));
        System.out.print("Character at index 22 of MyString 2 is: ");
        System.out.println(string2.charAt(22));
        System.out.print("Character at index 30 of MyString 2 is: ");
        System.out.println(string2.charAt(30));
        System.out.println();

        // test length
        System.out.print("Lenght of MyString 1 is ");
        System.out.println(string1.length());
        System.out.print("Lenght of MyString 2 is ");
        System.out.println(string2.length());
        System.out.print("Lenght of MyString 3 is ");
        System.out.println(string3.length());
        System.out.println();

        // test equal
        System.out.print("Does MyString 1 equal MyString 2? ");
        System.out.println(string1.equal(string2));
        System.out.print("Does MyString 1 equal MyString 1? ");
        System.out.println(string1.equal(string1));
        System.out.print("Does MyString 2 equal MyString 3? ");
        System.out.println(string2.equal(string3));
        System.out.println();

        // test toLowerCase
        System.out.println("MyString 2 in lower case is: ");
        string2.toLowerCase();
        string2.print();
        System.out.println();

        // test substring
        System.out.println("The substring of MyString 1 from index 9 to 35 is: ");
        MyString string4 = string1.substring(9, 36);
        string4.print();

    }
}

/*
 * 
 * MyString1 is: You miss 100% of the shots you don't take. MyString2 is:
 * WHETHER YOU THINK YOU CAN OR YOU THINK YOU CAN'T, YOU'RE RIGHT. MyString3 is:
 * WHETHER YOU THINK YOU CAN OR YOU THINK YOU CAN'T, YOU'RE RIGHT.
 * 
 * Character at index 5 of MyString 1 is: i Character at index 10 of MyString 1
 * is: 0 Character at index 20 of MyString 1 is: Character at index 12 of
 * MyString 2 is: T Character at index 22 of MyString 2 is: C Character at index
 * 30 of MyString 2 is: O
 * 
 * Lenght of MyString 1 is 42 Lenght of MyString 2 is 63 Lenght of MyString 3 is
 * 63
 * 
 * Does MyString 1 equal MyString 2? false Does MyString 1 equal MyString 1?
 * true Does MyString 2 equal MyString 3? true
 * 
 * MyString 2 in lower case is: whether you think you can or you think you
 * can't, you're right.
 * 
 * The substring of MyString 1 from index 9 to 35 is: 100% of the shots you
 * don't
 */