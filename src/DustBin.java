public class DustBin {
    private int capacity;
    private int dust;

    public DustBin(int capacity) {
        this.capacity = capacity;
        this.dust = 0;
    }

    public int getDust() {
        return dust;
    }

    public boolean isFull() {
        return dust >= capacity;
    }

    public void addDust(int amount) {
        dust += amount;
        if (dust > capacity) {
            dust = capacity;
        }
    }

    public void empty() {
        dust = 0;
    }
}
