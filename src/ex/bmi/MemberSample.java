package ex.bmi;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberSample {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        members.addAll(Arrays.asList(
                new Member("あいざわ", Gender.MEN,20,1.73,75.0),
                new Member("いのうえ", Gender.WOMEN,26,1.51,60.0),
                new Member("うえだ", Gender.MEN,34,1.92,90.0),
                new Member("えなり", Gender.WOMEN,71,1.60,65.0),
                new Member("おのだ", Gender.MEN,55,1.80,99.0)
        ));

        //表示処理
        System.out.println("名前 性別　年齢　身長　体重　BMI　体形　適正体重");
        for (Member member:members) {
            System.out.println(member);
        }
    }

}
