import java.util.*;

public class AutoComplete {

    HashMap<String, Integer> searchFrequency = new HashMap<>();

    public void recordSearch(String query) {
        searchFrequency.put(query, searchFrequency.getOrDefault(query, 0) + 1);
    }

    public void suggest(String prefix) {

        for (String query : searchFrequency.keySet()) {

            if (query.startsWith(prefix)) {
                System.out.println(query + " (" + searchFrequency.get(query) + ")");
            }
        }
    }
}