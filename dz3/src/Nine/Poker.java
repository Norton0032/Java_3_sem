package Nine;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        String[] k1 = {"2♥","2♦","2♣","2♠","3♥","3♦","3♣","3♠","4♥","4♦","4♣","4♠","5♥","5♦","5♣","5♠",
            "6♥","6♦","6♣","6♠","7♥","7♦","7♣","7♠","8♥","8♦","8♣","8♠","9♥","9♦","9♣","9♠","10♥","10♦","10♣","10♠",
            "В♥","В♦","В♣","В♠","Д♥","Д♦","Д♣","Д♠","К♥","К♦","К♣","К♠","Т♥","Т♦","Т♣","Т♠"};
        ArrayList<String> k = new ArrayList<>(52);
        for(int i =0;i<52;i++) k.add(k1[i]);
        System.out.println("Введите количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>10) {System.out.println("Карт на всех не хватит)");
        System.exit(1);}
        if(n<1) {System.out.println("Что-то не то)");
            System.exit(1);}
        ArrayList<String> h= new ArrayList<>();
        String hh="";
        for(int i =0;i<n*5;i++){
            if(i%5==0 && !hh.equals("")) {
                h.add(hh);
                hh="";
            }
            int t = (int)(Math.random()*k.size());
            hh= hh + k.get(t)+" ";
            k.remove(t);
        }
        h.add(hh);
        for(int i =0;i< h.size();i++) System.out.println(h.get(i));
    }
}