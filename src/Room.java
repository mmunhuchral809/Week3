public class Room {
    private String name;
    private int area; // м2
    private int dirt; // 0 бол цэвэр

    public Room(String name, int area, int dirt) {
        this.name = name;
        this.area = area;
        this.dirt = dirt;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getDirt() {
        return dirt;
    }

    public boolean isClean() {
        return dirt == 0;
    }

    public void removeDirt(int amount) {
        dirt -= amount;
        if (dirt < 0) {
            dirt = 0;
        }
    }
}
