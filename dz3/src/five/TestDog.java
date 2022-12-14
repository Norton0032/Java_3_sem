package five;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n;
        String name;
        System.out.println("Введите кличку и возраст(0 если хотите занончить): ");
        Dog dog;
        while(true){
            name = scan.next();
            if(name.equals("0")) break;
            n = scan.nextInt();
            dog = new Dog(name,n);
            dogs.add(dog);
        }
    for (int i =0;i<dogs.size();i++){
        System.out.println("Кличка "+ dogs.get(i).getName() + " Возраст " + dogs.get(i).getOld() + " Человеческий возраст " + dogs.get(i).toPeople());
    }
        for (int i =0;i<dogs.size();i++){
            System.out.println(dogs.get(i).toString());
        }
    }
}
