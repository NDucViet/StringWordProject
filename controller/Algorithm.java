package WordProject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Algorithm {
    public int countWord(String word){
        StringTokenizer stringTokenizer = new StringTokenizer(word);
        int a =0;
        for (int i = 0; i < stringTokenizer.countTokens(); i++) {
            try {
                Integer.parseInt(stringTokenizer.nextToken());
            } catch (Exception e) {
                a+=1;
                // TODO: handle exception
            }
        }
        return a;
    }

    public HashMap<String, Integer> countChar(String word){
        HashMap<String, Integer> hash = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(word);
        ArrayList<String> a = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            a.add(token);
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).length(); j++) {
                String s = ""+ a.get(i).charAt(j);
                if(!hash.containsKey(s)){
                    hash.put(s, 1);
                } else{
                    Integer n =hash.get(s) +1;
                    hash.put(s, n);
                }
            }
        }
        return hash;
    }
    public HashMap<String, Integer> word(String s){
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        HashMap<String, Integer> hash = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            a.add(token);
        }
        for (int i = 0; i < a.size(); i++) {
            try {
                Integer.parseInt(stringTokenizer.nextToken());
            } catch (Exception e) {
                if(!hash.containsKey(a.get(i))){
                    hash.put(a.get(i), 1);
                } else{
                    Integer n =hash.get(a.get(i)) +1;
                    hash.put(a.get(i), n);
                }
                // TODO: handle exception
            }
        }
        return hash;
    }
}
