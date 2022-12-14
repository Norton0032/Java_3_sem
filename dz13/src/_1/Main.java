package _1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите строку: ");
        String userString = scanner.nextLine();
        ex1(userString);
        ex2(userString);
        System.out.println(ex3(userString));
        System.out.println(ex4(userString));
        System.out.println(ex5(userString));
        System.out.println(ex6(userString));
        System.out.println(ex7(userString));
        System.out.println(ex8(userString));
        System.out.println(ex9(userString));
        ex10(userString);

    }

    public static void ex1(String str){
        System.out.println(str);
    }

    public static void ex2(String str){
        for(int i =0;i<str.length();i++){
            if(i!= str.length()-1)  System.out.print(str.charAt(i)+", ");
            else System.out.println(str.charAt(i)+".");
        }
    }

    public static boolean ex3(String str){
        return str.endsWith("!!!");
    }

    public static boolean ex4(String str){
        return str.startsWith("I like");
    }

    public static boolean ex5(String str){
        return str.contains("Java");
    }

    public static int ex6(String str){
        return str.indexOf("Java");
    }

    public static String ex7(String str){
        return str.replace('a', 'o');
    }

    public static String ex8(String str){
        return str.toUpperCase();
    }

    public static String ex9(String str){
        return str.toLowerCase();
    }

    public static void ex10(String str){
        if(ex5(str)){
            System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
        }
        else System.out.println("Нет подстроки Java");
    }
}
