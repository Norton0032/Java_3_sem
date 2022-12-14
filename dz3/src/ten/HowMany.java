package ten;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        int k =0;
        String a = scan.nextLine();
        boolean f = false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ' && f) {
                k++;
                f = false;
            }
            else if(a.charAt(i)!=' ') f = true;
            else f = false;
        }
        if(a.charAt(a.length()-1)!=' ') k++;
        System.out.println("Всего "+k+" слов(а)");
    }
}
