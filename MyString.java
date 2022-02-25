/*
 * 
 * CSCI Project 10 This Program implements and test MyString class
 * 
 * Author: Cheron Fletcher
 * Date: 04/07/21
 */

public class MyString {

    // data fields
    private char[] data;
    // private int size;

    // constructor

    public MyString(char[] chars) {
        data = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            data[i] = chars[i];
        }
    }

    public char charAt(int i) {
        return this.data[i];
    }

    public int length() {
        return data.length;
    }

    public MyString substring(int begin, int end) {
        // returns new MyString containing substring
        // get length of new substring
        int length = end - begin;
        // create new char array
        char[] newSubArray = new char[length];
        for (int i = 0; i < newSubArray.length; i++) {
            newSubArray[i] = this.charAt(begin + i);
        }
        return new MyString(newSubArray);
        // data[begin] to data[end]
        // newSub[0] = data[begin]
    }

    public MyString toLowerCase() {
        // convert current MyString into lowercase
        // char[] newLower = new char[this.length()];
        for (int i = 0; i < this.length(); i++) {
            this.data[i] = Character.toLowerCase(charAt(i));
        }
        return this;
    }

    public boolean equal(MyString other) {
        // does this.equal(other)
        boolean equals = true;
        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != other.charAt(i))
                equals = false;
        }
        return equals;
    }

    public MyString valueOf(int i) {
    }

    public void print() {
        for (int i = 0; i < this.length(); i++) {
            System.out.print(this.data[i]);
        }
        System.out.println();
    }

}