public class Battery {
    private int level; // 0-100 хувь

    public Battery() {
        this.level = 100;
    }

    public int getLevel() {
        return level;
    }

    public boolean isLow() {
        return level < 20;
    }

    public void use(int amount) {
        level -= amount;
        if (level < 0) {
            level = 0;
        }
    }

    public void charge() {
        level = 100;
    }
}
