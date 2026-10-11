public class Main {
    public static void main(String[] args) {
        SmartVacuumCleaner vacuum = new SmartVacuumCleaner("SV-100");

        Room livingRoom = new Room("Зочны", 20, 80);
        Room bedroom = new Room("Унтлагын", 15, 70);

        vacuum.startCleaning(livingRoom);
        vacuum.startCleaning(bedroom);   // хогийн сав дүүрнэ

        vacuum.emptyBin();
        vacuum.startCleaning(bedroom);   // үлдсэн хэсгийг цэвэрлэнэ

        vacuum.chargeBattery();
    }
}
