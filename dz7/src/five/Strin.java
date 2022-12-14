package five;

public class Strin implements Str {
    public String a;

    public Strin(String a) {
        this.a = a;
    }

    @Override
    public int score() {
        return a.length();
    }

    @Override
    public String nodd() {
        String b = "";
        for(int i = 0;i<a.length();i+=2) {
            b+=a.charAt(i);
        }
        return b;
    }

    @Override
    public StringBuilder rev() {
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        return b;
    }
}
