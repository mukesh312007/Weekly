import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class DNSCache {

    private HashMap<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {

        if (cache.containsKey(domain)) {
            DNSEntry entry = cache.get(domain);

            if (System.currentTimeMillis() < entry.expiry) {
                return entry.ip;
            }
        }

        String ip = queryDNS(domain);
        cache.put(domain, new DNSEntry(ip, 60000));
        return ip;
    }

    private String queryDNS(String domain) {
        return "192.168.1.1";
    }
}