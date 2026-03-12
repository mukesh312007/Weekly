import java.util.*;

public class PlagiarismDetector {

    HashMap<String, List<Integer>> index = new HashMap<>();

    public void addDocument(int docId, String text) {
        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {
            String ngram = words[i] + " " + words[i+1] + " " + words[i+2];

            index.putIfAbsent(ngram, new ArrayList<>());
            index.get(ngram).add(docId);
        }
    }

    public void check(String text) {

        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {
            String ngram = words[i] + " " + words[i+1] + " " + words[i+2];

            if (index.containsKey(ngram)) {
                System.out.println("Match found in documents: " + index.get(ngram));
            }
        }
    }
}