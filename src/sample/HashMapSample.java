package sample;

import java.util.HashMap;
import java.util.Map;

class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String,String> map = new HashMap<>(32);
        //要素の追加
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orange","オレンジ");
        //表示
        System.out.println(map);
        //要素の取得
        System.out.println(map.get("apple"));//りんご
        //キーの集合を取得
        System.out.println(map.keySet());
        //値の集合の取得
        System.out.println(map.values());
        //キーと値を取得
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":"  + entry.getValue());
        }
        //要素の削除
        System.out.println(map.remove("orange"));
        //要素の変更
        System.out.println(map.put("apple", "リンゴ"));
        //表示
        System.out.println(map);
        //キーによる検索
        String searchWord = "orange";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not find:" + searchWord);
        }
    }
}
