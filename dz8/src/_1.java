import java.util.Scanner;

public class _1 {
    public static void v(int now,int a, int now_a){
        for(int i = 1;i<=now;i++){
            if(now_a+1 == a){
                System.out.println(now+".");
                return;
            }
            System.out.print(now+", ");
            now_a++;
        }
        v(now+1,a,now_a);
    }
    public static void main(String[] args) {
        System.out.print("Вывод первых n-членов последовательность 1223334444...\nВведите n: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0) v(1,a,0);
    }
}
