package eight;

public class Book {
    private static String book[] = {"1", "2","3"};
    static public void printBook(){
        System.out.println("");
        for(String i : book){
            System.out.print(i+ " ");
        }
    }
}