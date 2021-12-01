package ex.person2;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.addAll(Arrays.asList(
                new Person("さかぐち", Birthplace.HOKKAIDO,Gender.MEN,29),
                new Person("のむら",Birthplace.HOKKAIDO,Gender.WOMEN,35),
                new Person("うえまつ",Birthplace.HOKKAIDO,Gender.MEN,49),
                new Person("あかい", Birthplace.OSAKA,Gender.WOMEN,20),
                new Person("あんの",Birthplace.OSAKA,Gender.MEN,30),
                new Person("やまが",Birthplace.OSAKA,Gender.WOMEN,40),
                new Person("こんどう", Birthplace.TOKYO,Gender.MEN,50),
                new Person("ひじかた",Birthplace.TOKYO,Gender.WOMEN,40),
                new Person("おきた",Birthplace.TOKYO,Gender.MEN,60),
                new Person("ほりい",Birthplace.FUKUOKA,Gender.WOMEN,90),
                new Person("とりやま",Birthplace.FUKUOKA,Gender.MEN,80),
                new Person("すぎやま",Birthplace.FUKUOKA,Gender.WOMEN,70)
        ));

        //出身地ごとのマップ
        Map<Birthplace, List<Person>> birthplacePersonMap = new HashMap<>(40);

        for (Person person : personList) {
            //
            if (birthplacePersonMap.containsKey(person.getBirthplace())) {
                //リストに追加
                birthplacePersonMap.get(person.getBirthplace()).add(person);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Person> list = new ArrayList<>();
                list.add(person);
                birthplacePersonMap.put(person.getBirthplace(), list);
            }
        }

        //分類できたか表示
        for (Map.Entry entry:birthplacePersonMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Person person:(List<Person>)entry.getValue())
                System.out.println(person);
        }

        //平均年齢の算出
        double ageSum = 0;//年齢の合計
        double cnt = 0 ;//人数
        for (Map.Entry entry:birthplacePersonMap.entrySet()) {
            System.out.print(((Birthplace)entry.getKey()).getName());
            ageSum = 0;//クリア
            cnt = 0;//クリア
            for (Person person:(List<Person>)entry.getValue()) {
                ageSum += person.getAge();
                cnt++;
            }
            System.out.println(String.format(":%.1f歳",ageSum / cnt));
        }

        //男女別平均年齢の算出
        double ageMenSum = 0,ageWomenSum = 0,menCnt = 0,womenCnt = 0;
        for (Map.Entry entry:birthplacePersonMap.entrySet()) {
            System.out.println(((Birthplace)entry.getKey()).getName());
            for (Person person:(List<Person>)entry.getValue()) {
//                ageMenSum = 0;
//                ageWomenSum = 0;
//                menCnt = 0;
//                womenCnt = 0;
                if (person.getGender().equals(Gender.MEN)) {
                    ageMenSum += person.getAge();
                    menCnt++;
                } else {
                    ageWomenSum += person.getAge();
                    womenCnt++;
                }
                ageSum += person.getAge();
            }
            System.out.println(String.format("男性:%.1f歳",(ageMenSum / menCnt)));
            System.out.println(String.format("女性:%.1f歳",(ageWomenSum / womenCnt)));
            ageMenSum = 0;
            ageWomenSum = 0;
            menCnt = 0;
            womenCnt = 0;
        }

//        System.out.println(birthPlaceMap);

//        double sumHok = 0,sumTok = 0,sumFuk = 0,sumOsa = 0;
//        for (Map.Entry entry : birthPlaceMap.entrySet()) {
//            System.out.println(((Birthplace)entry.getKey()).getName());
//
//            for (Person person:(List<Person>)entry.getValue()) {
//                if(((Birthplace)entry.getKey()).getName().equals("北海道")) {
//                    sumHok += person.getAge();
//                }else if (((Birthplace)entry.getKey()).getName().equals("東京")) {
//                    sumTok += person.getAge();
//                }else if (((Birthplace)entry.getKey()).getName().equals("福岡")) {
//                    sumFuk += person.getAge();
//                }else if (((Birthplace)entry.getKey()).getName().equals("大阪")){
//                    sumOsa += person.getAge();
//                }
//            }
//            double aveHok = sumHok / ((List<Person>) entry.getValue()).size();
//            double aveTok = sumTok / ((List<Person>) entry.getValue()).size();
//            double aveFuk = sumFuk / ((List<Person>) entry.getValue()).size();
//            double aveOsa = sumOsa / ((List<Person>) entry.getValue()).size();
//
//            if(((Birthplace)entry.getKey()).getName().equals("北海道")) {
//            System.out.println(String.format("平均%.2f 歳",aveHok));
//            }else if (((Birthplace)entry.getKey()).getName().equals("東京")) {
//            System.out.println(String.format("平均%.2f 歳",aveTok));
//            }else if (((Birthplace)entry.getKey()).getName().equals("福岡")) {
//            System.out.println(String.format("平均%.2f 歳",aveFuk));
//            }else if (((Birthplace)entry.getKey()).getName().equals("大阪")){
//            System.out.println(String.format("平均%.2f 歳",aveOsa));
//            }
//            System.out.println(String.format("北海道:%.2f 東京:%.2f 福岡:%.2f 大阪:%.2f",aveHok,aveTok,aveFuk,aveOsa));

    }
}
