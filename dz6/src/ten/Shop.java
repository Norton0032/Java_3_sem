package ten;
import java.util.ArrayList;

public class Shop {
    private ArrayList<PC> shop= new ArrayList<>();
    public void Add(PC pc){
        shop.add(pc);
    }
    public void Search(String n){
        int f=0;
        for(int i=0;i<shop.size();i++)
            if(n==shop.get(i).getName()) {
                System.out.println(shop.get(i).toString());
                f = 1;
            }
        if(f==0) System.out.println("Компьютер не найден");
    }
    public void Dell(String name){
        for(int i=0;i<shop.size();i++)
            if(name==shop.get(i).getName()) shop.remove(i);
    }
}
