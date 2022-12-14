package ten;

public class Processor {
    private int core;
    private double minf;
    private double maxf;

    public Processor(int core, double minf, double maxf) {
        this.core = core;
        this.minf = minf;
        this.maxf = maxf;
    }

    public int getCore() {
        return core;
    }

    public double getMinf() {
        return minf;
    }

    public double getMaxf() {
        return maxf;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "core=" + core +
                ", minf=" + minf +
                ", maxf=" + maxf +
                '}';
    }
}
