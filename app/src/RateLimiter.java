import java.util.*;

class TokenBucket {
    int tokens = 5;
    long lastRefill = System.currentTimeMillis();
}

public class RateLimiter {

    HashMap<String, TokenBucket> clients = new HashMap<>();

    public boolean allowRequest(String clientId) {

        clients.putIfAbsent(clientId, new TokenBucket());
        TokenBucket bucket = clients.get(clientId);

        if (bucket.tokens > 0) {
            bucket.tokens--;
            return true;
        }

        return false;
    }

}