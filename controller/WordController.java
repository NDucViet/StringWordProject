package WordProject.controller;

import java.util.HashMap;
import java.util.Scanner;

import WordProject.model.StringWord;
import WordProject.view.Menu;

public class WordController extends Menu {
    Scanner sc = new Scanner(System.in);
    static String[] mc = { "Information about String", "Exit" };

    protected Library library = new Library();
    protected Algorithm algorithm = new Algorithm();

    public WordController() {
        super("programming", mc);
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                inforString();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public void inforString() {
        System.out.println("Enter your String");
        String word = sc.nextLine();
        HashMap<String, Integer> hash = new HashMap<>();
        StringWord stringWord = new StringWord();
        stringWord.setNum_Word(algorithm.countWord(word));
        hash.putAll(algorithm.countChar(word));
        hash.putAll(algorithm.word(word));
        stringWord.setCountWord(hash);
        stringWord.setWord(word);
        stringWord.toString(stringWord);
    }
}
