package four;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String name;
        System.out.println("Введите название моделей(0 если хотите занончить): ");
        Shop shop = new Shop();
        while(true){
            name = scan.next();
            if(name.equals("0")) break;
            shop.setPks(name);
        }
        System.out.println("Введите 1 - если хотите добавить модель компьютера\n 2 - Если хотите проверить наличии компьютера\n 3 - Если хотите удалить компьютер\n 4 - Вывести список всех компьютеров\n0 - Если хотите завершить");
        while(true){
            n = scan.nextInt();
            if(n==0) break;
            if(n==1){
                System.out.println("Введите название модели: ");
                String z = scan.next();
                shop.add(z);
            }
            if(n==2){
                System.out.println("Введите название модели: ");
                String z = scan.next();
                shop.search(z);
            }
            if(n==3){
                System.out.println("Введите название модели: ");
                String z = scan.next();
                shop.del(z);
            }
            if(n==4){
                System.out.println(shop.toString());
            }
        }
    }
}
