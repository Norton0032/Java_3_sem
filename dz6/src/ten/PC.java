package ten;

public class PC {
    private String name;
    private Memory m;
    private Monitor mo;
    private Processor p;
    PC(String n,int cor, double minf,double maxf,int OZY,int SSD,int h,int w){
        name = n;
        m = new Memory(OZY,SSD);
        mo = new Monitor(h,w);
        p = new Processor(cor,minf,maxf);
    }

    public String getName() {
        return name;
    }

    public Memory getM() {
        return m;
    }

    public Monitor getMo() {
        return mo;
    }

    public Processor getP() {
        return p;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", m=" + m.toString() +
                ", mo=" + mo.toString() +
                ", p=" + p.toString() +
                '}';
    }
}
