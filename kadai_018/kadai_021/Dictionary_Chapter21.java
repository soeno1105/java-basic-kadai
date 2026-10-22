package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    public void noun(String[] search) {
        HashMap<String, String> Dictionary = new HashMap<>();
        Dictionary.put("apple", "りんご");
        Dictionary.put("peach", "桃");
        Dictionary.put("banana", "バナナ");
        Dictionary.put("lemon", "レモン");
        Dictionary.put("pear", "梨");
        Dictionary.put("kiwi", "キウィ");
        Dictionary.put("strawberry", "いちご");
        Dictionary.put("grape", "ぶどう");
        Dictionary.put("muscat", "マスカット");
        Dictionary.put("cherry", "さくらんぼ");

        for (String fruit : search) {
            if (Dictionary.get(fruit) == null) {
                System.out.println(fruit + "は辞書に存在しません");
            } else {
                System.out.println(fruit + "の意味は " + Dictionary.get(fruit) + " です");
            }
        }
    }
}