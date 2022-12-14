package org.example._1;

public class Test {
    public static void main(String[] args) {
        String s = "5 0.5 /";
        RPN polish = new RPN(s);
        System.out.println(polish.calculations());
    }
}
