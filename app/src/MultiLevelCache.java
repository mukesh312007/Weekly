import java.util.*;

public class MultiLevelCache {

    HashMap<String,String> L1 = new HashMap<>();
    HashMap<String,String> L2 = new HashMap<>();

    public String getData(String key) {

        if (L1.containsKey(key)) {
            System.out.println("Found in L1 cache");
            return L1.get(key);
        }

        if (L2.containsKey(key)) {
            System.out.println("Found in L2 cache");

            String value = L2.get(key);
            L1.put(key, value);
            return value;
        }

        String value = fetchFromDB(key);
        L2.put(key, value);
        L1.put(key, value);

        return value;
    }

    private String fetchFromDB(String key) {
        return "Data for " + key;
    }
}