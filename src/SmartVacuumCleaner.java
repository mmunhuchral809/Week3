public class SmartVacuumCleaner {
    private String model;
    private Battery battery;
    private DustBin dustBin;
    private Motor motor;
    private Room currentRoom;

    public SmartVacuumCleaner(String model) {
        this.model = model;
        this.battery = new Battery();
        this.dustBin = new DustBin(100);
        this.motor = new Motor(2);
    }

    public void startCleaning(Room room) {
        currentRoom = room;
        if (battery.isLow()) {
            System.out.println("Батарей бага байна, эхлээд цэнэглэнэ үү.");
            return;
        }
        if (dustBin.isFull()) {
            System.out.println("Хогийн сав дүүрсэн байна, эхлээд хоослоно уу.");
            return;
        }

        motor.start();
        System.out.println(model + ": " + room.getName() + " өрөөг цэвэрлэж эхэллээ.");

        while (!room.isClean()) {
            if (battery.isLow()) {
                System.out.println("Батарей дуусаж байна, зогслоо.");
                break;
            }
            if (dustBin.isFull()) {
                System.out.println("Хогийн сав дүүрлээ, зогслоо.");
                break;
            }
            moveForward();
            room.removeDirt(10);
            dustBin.addDust(10);
            battery.use(5);
        }

        stopCleaning();
    }

    public void moveForward() {
        motor.moveForward();
    }

    public void stopCleaning() {
        motor.stop();
        System.out.println("Зогсов. Өрөөний бохирдол: " + currentRoom.getDirt()
                + ", батарей: " + battery.getLevel() + "%, хогийн сав: " + dustBin.getDust());
    }

    public void chargeBattery() {
        battery.charge();
        System.out.println("Батарей цэнэглэгдлээ (100%).");
    }

    public void emptyBin() {
        dustBin.empty();
        System.out.println("Хогийн савыг хоослолоо.");
    }

    public int getBatteryLevel() {
        return battery.getLevel();
    }
}
