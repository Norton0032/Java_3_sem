package ten;

public class Memory {
    private int OZY;
    private int SSD;
    Memory(int OZ, int SS){
        OZY = OZ;
        SSD = SS;
    }
    public int getOZY() {
        return OZY;
    }
    public int getSSD() {
        return SSD;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "OZY=" + OZY +
                ", SSD=" + SSD +
                '}';
    }
}
