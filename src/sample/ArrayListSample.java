package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayListのサンプル
class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化
        List<Integer> list = new ArrayList<>();

        //初期化
        list.addAll(Arrays.asList(20,10,40,30,50));

        //表示
        System.out.println(list);

        //要素の追加
        list.add(60);
        System.out.println(list);
        list.add(2,70);
        System.out.println(list);

        //要素の上書き
        list.set(0,80);
        System.out.println(list);

        //要素の削除
        list.remove(2);
        System.out.println(list);

        list.removeAll(Arrays.asList(30,60));
        System.out.println(list);

        //インデックスを指定して要素を取得
        System.out.println(list.get(3));

        //サイズ
        System.out.println(list.size());

        //一部の要素の取得
        System.out.println(list.subList(1,3));

        //要素の消去
        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());//true
    }
}
