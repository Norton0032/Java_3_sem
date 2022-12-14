package ele;

public class Transform implements Convertable{
    public void convert(double a){
        double k = a+273.15;
        double f = a*9/5+32;
        System.out.println(a + " по цельсии - это "+ k +" по Кельвину и "+ f + " по Фаренгейту");
    }
}
