import java.util.ArrayList;
import java.util.Scanner;
public class _16 {
    public static int maxx(int m, int k){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a==0) return k;
        if (a > m) {
            m = a;
            k = 1;
            return maxx(m,k);
        }
        else if(a==m) return maxx(m,++k);
        else return maxx(m,k);
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность и программа определит сколько раз встречается максимум");
        System.out.println(maxx(0,0));
    }
}
