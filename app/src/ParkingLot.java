public class ParkingLot {

    String[] table = new String[500];

    int hash(String plate) {
        return Math.abs(plate.hashCode()) % table.length;
    }

    void park(String plate) {

        int index = hash(plate);

        while (table[index] != null) {
            index = (index + 1) % table.length;
        }

        table[index] = plate;
        System.out.println("Parked at spot: " + index);
    }
}