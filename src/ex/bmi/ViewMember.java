package ex.bmi;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();

        memberList.addAll(Arrays.asList(
                new Member("やまだ", Gender.MEN, 35, 1.73, 72.0),
                new Member("きむら", Gender.WOMEN, 28, 1.654, 52.6),
                new Member("くろいわ", Gender.MEN, 45, 1.85, 77.7),
                new Member("わだ",Gender.WOMEN,18,1.45,38.6),
                new Member("みねぎし",Gender.MEN,66,1.45,80.6)
        ));

        for (Member member:memberList) {
            System.out.println(member);
        }
    }
}
