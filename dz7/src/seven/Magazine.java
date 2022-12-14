package seven;

public class Magazine {
    private static String Mag[] = {"1", "2","3"};
    static public void printMagazines(){
        System.out.println("");
        for(String i : Mag){
            System.out.print(i+ " ");
        }
    }
}
