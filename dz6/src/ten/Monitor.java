package ten;

public class Monitor {
    private int height;
    private int width;
    public Monitor(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
