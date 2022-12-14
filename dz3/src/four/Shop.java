package four;
import java.util.ArrayList;
public class Shop {
    private ArrayList<String> pks = new ArrayList<>();

    public ArrayList<String> getPks() {
        return pks;
    }
    public void setPks(String pks) {
        this.pks.add(pks);
    }

    public void search(String model) {
        int i;
        for (i = 0; i < pks.size(); i++)
            if (pks.get(i).equals(model)) {
                System.out.println("Компьютер есть в наличии");
                i = -1;
                break;
            }
        if (i != -1) System.out.println("Компьютера нет в наличии");
    }

    public void del(String model) {
        int i;
        for (i = 0; i < pks.size(); i++)
            if (pks.get(i).equals(model)) {
                pks.remove(i);
                System.out.println("Компьютер удален");
                i = -1;
                break;
            }
        if (i != -1) System.out.println("Компьютер не найден");
    }

    public void add (String name){
        this.pks.add(name);
        System.out.println("Компьютер добавлен");
    }
    public String toString() {
        return "Shop{" +
                "pks=" + pks +
                '}';
    }
}