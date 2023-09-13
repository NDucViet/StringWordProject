package WordProject.model;
import java.util.HashMap;
import java.util.Map;
public class StringWord {
    private String word;
    private int num_Word;
    private HashMap<String, Integer> countWord;
    
    public StringWord() {
    }
    public StringWord(String word, int num_Word, HashMap<String, Integer> countWord) {
        this.word = word;
        this.num_Word = num_Word;
        this.countWord = countWord;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getNum_Word() {
        return num_Word;
    }
    public void setNum_Word(int num_Word) {
        this.num_Word = num_Word;
    }
    public HashMap<String, Integer> getCountWord() {
        return countWord;
    }
    public void setCountWord(HashMap<String, Integer> countWord) {
        this.countWord = countWord;
    }
    
    public String toString(StringWord stringWord) {
        
        System.out.println("the String " + stringWord.getWord());
        System.out.println("Number of String " + stringWord.getNum_Word());
        HashMap<String, Integer> hash = new HashMap<>();
        hash.putAll(stringWord.getCountWord());
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
          }
        return "";
    }
    
}
