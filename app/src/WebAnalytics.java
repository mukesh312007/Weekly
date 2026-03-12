import java.util.*;

public class WebAnalytics {

    HashMap<String, Integer> pageViews = new HashMap<>();
    HashMap<String, HashSet<String>> uniqueVisitors = new HashMap<>();

    public void recordVisit(String page, String user) {

        pageViews.put(page, pageViews.getOrDefault(page, 0) + 1);

        uniqueVisitors.putIfAbsent(page, new HashSet<>());
        uniqueVisitors.get(page).add(user);
    }

    public void showStats(String page) {
        System.out.println("Page Views: " + pageViews.get(page));
        System.out.println("Unique Visitors: " + uniqueVisitors.get(page).size());
    }
}