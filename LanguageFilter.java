import java.util.*;

public class LanguageFilter {

    // This method filters languages with scores >= 60 and sorts them in descending order
    public static List<String> myLanguages(Map<String, Integer> results) {
        List<String> qualifiedLanguages = new ArrayList<>();

        // Step 1: Filter languages with score >= 60
        for (String language : results.keySet()) {
            int score = results.get(language);
            if (score >= 60) {
                qualifiedLanguages.add(language);
            }
        }

        // Step 2: Sort languages by score in descending order
        Collections.sort(qualifiedLanguages, new Comparator<String>() {
            public int compare(String lang1, String lang2) {
                return results.get(lang2) - results.get(lang1); // descending
            }
        });

        return qualifiedLanguages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter input
        System.out.println("Enter language-score pairs (e.g. Python:65,Ruby:80):");
        String input = scanner.nextLine();

        // Step 3: Convert input string to a Map
        Map<String, Integer> results = new HashMap<>();
        String[] pairs = input.split(",");
        for (String pair : pairs) {
            String[] parts = pair.split(":");
            String language = parts[0].trim();
            int score = Integer.parseInt(parts[1].trim());
            results.put(language, score);
        }

        // Step 4: Get the filtered and sorted list
        List<String> output = myLanguages(results);

        // Step 5: Print the result
        System.out.println("Languages with score >= 60 in descending order:");
        System.out.println(output);
    }
}