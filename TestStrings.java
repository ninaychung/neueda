import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;

public class TestStrings {
    public static void main(String[] args) {
        String s = "example.doc";
        s = "example.bak";

        String s1 = "hi";
        String s2 = "hello";
        longerString(s1, s2);

        String ow = "the quick brown fox swallowed down the lazy chicken";
        numOccurances(ow, "ow");

        String pali = "Live not on evil";
        isPalindrome(pali);

        Date d = new Date();
        System.out.println("OG Date: " + d);
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date format 1: " + f1.format(d));
        SimpleDateFormat f2 = new SimpleDateFormat("EEEEE MMMMM yyyy HH:mm:ss.SSSZ");
        System.out.println("Date format 1: " + f2.format(d));

        String sampleText = "Copy a page of news or other text from your favourite website. Split the text into sentences, count and display them. Next split each sentence into words, count and display the words. Finally split the whole text into words and count them, checking that this is consistent with the results of the previous step.";
        splitText(sampleText);

    }

    public static void longerString(String s1, String s2) {
        if (!s1.equals(s2)) {
            if (s1.length() > s2.length()) {
                System.out.println(s1 + " is the longer string.");
            } else {
                System.out.println(s2 + " is the longer string.");
            }
        } else {
            System.out.println("Strings are equal.");
        }
    }

    public static void numOccurances(String main, String sub) {
        String newMain = main.replaceAll(sub, "");

        int count = (main.length() - newMain.length()) / sub.length();

        System.out.println("Number of times '" + sub + "' appears in '" + main + "': " + count);

    }

    public static void isPalindrome(String s) {
        // remove spaces first and convert to lowercase
        boolean res = true;
        s = s.replaceAll(" ", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                res = false;
            }
            i++;
            j--;
        }

        System.out.println("Is the string '" + s + "' a palindrome? " + res);

    }

    public static void splitText(String s) {
        String[] sentences = s.split("\\. ");
        System.out.println("There are " + sentences.length + "sentences: ");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        System.out.println("Splitting each text into words... ");

        for (String sentence : sentences) {
            String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            for (String word : words) {
                System.out.println(word);
            }
        }

        System.out.println("Counting number of words...");

        String[] wordsAll = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordsAll) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }
        System.out.println(map);

    }
}
