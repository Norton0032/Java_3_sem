package five;

public class Dog {
    private String name;
    private int old;

    public Dog(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }
    public void setOld(int old) {
        this.old = old;
    }
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
    public int toPeople(){
        return old*7;
    }
}
