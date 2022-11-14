import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] wordOfText = text.split("\\P{IsAlphabetic}+");
        Set<String> words = new HashSet<>();
        for (int i = 0; i < wordOfText.length; i++) {
            words.add(wordOfText[i]);
        }
        boolean hasWord = words.contains(word);
        return hasWord;
    }
}
