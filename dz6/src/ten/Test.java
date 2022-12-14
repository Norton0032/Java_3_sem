package ten;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        PC pc = new PC("MSI",8,3.4,4.4,16,512,1080,1920);
        shop.Add(pc);
        pc = new PC("LENOVO",4,3.4,4.0,8,1024,1080,1920);
        shop.Add(pc);
        pc = new PC("ACER",6,2.4,3.6,16,1024,1080,1920);
        shop.Search("LENOVO");
        shop.Search("MSI");
        shop.Add(pc);
        shop.Dell("LENOVO");
        shop.Search("LENOVO");
    }
}
