import java.util.Scanner;

import static java.lang.Math.max;

public class _2 {
    public static void v(int now,int a){
       if(now==a){
           System.out.print(now+".");
           return;
       }
       else{
           System.out.print(now+", ");
           v(++now,a);
       }
    }
    public static void main(String[] args) {
        System.out.print("Вывод первых n чисел.\nВведите n: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0) v(1,a);
    }
}
