package eight;
public class main {
    public static void main(String[] args) {
        String[] a = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh","ii"};
        for(int i =0;i<a.length;i++) System.out.print(a[i]+" ");
        for (int i=0;i<(a.length)/2;i++){
            String z = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i] = z;
        }
        System.out.println("\n");
        for(int i =0;i<a.length;i++) System.out.print(a[i]+" ");
    }
}
