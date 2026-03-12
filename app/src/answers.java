import java.util.*;

public class answers {

    private HashSet<String> usernames = new HashSet<>();

    public boolean isAvailable(String username) {
        if (usernames.contains(username)) {
            System.out.println("Username already taken.");
            suggest(username);
            return false;
        } else {
            usernames.add(username);
            System.out.println("Username registered successfully.");
            return true;
        }
    }

    private void suggest(String username) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Suggestion: " + username + i);
        }
    }

    public static void main(String[] args) {
        answers uc = new answers();
        uc.isAvailable("john");
        uc.isAvailable("john");
    }
}