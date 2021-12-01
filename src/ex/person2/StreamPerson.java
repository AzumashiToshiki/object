package ex.person2;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("やまだ", Birthplace.HOKKAIDO, Gender.MEN, 35),
                new Person("いけだ", Birthplace.HOKKAIDO, Gender.WOMEN, 25),
                new Person("いのうえ", Birthplace.FUKUOKA, Gender.MEN, 15),
                new Person("たむら", Birthplace.FUKUOKA, Gender.WOMEN, 22),
                new Person("わだ", Birthplace.TOKYO, Gender.MEN, 42),
                new Person("くどう", Birthplace.TOKYO, Gender.WOMEN, 55),
                new Person("さらど", Birthplace.OSAKA, Gender.MEN, 31),
                new Person("あいざわ", Birthplace.OSAKA, Gender.WOMEN, 44)
        ));

        System.out.println("課題1");
        personList
                .forEach(System.out::println);

        System.out.println("課題2");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("課題3");
        personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        System.out.println("課題4");
        personList.stream()
                .sorted((s1, s2) -> s2.getAge() - s1.getAge())
                .forEach(System.out::println);

        System.out.println("課題5");
        personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

//        System.out.println("課題6");
//        personList.stream()
//                .forEach(s -> System.out.println(s.getName()));

        System.out.println("課題6");
        List<String> nameList = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        System.out.println("課題7");
        Map<Gender, List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        map.entrySet().stream()
                .map(s -> s.getKey().getJpName() + ":" + s.getValue())
                .forEach(System.out::println);

        System.out.println("課題8");
//        personList.stream()
//                .filter(s -> s.getGender().equals(Gender.MEN))
//                .max(Comparator.comparing(Person::getAge))
//                .get();
        Optional<Person> person1 =personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));
        person1.ifPresent(System.out::println);

        System.out.println("課題9");
//        personList.stream()
//                .filter(s -> s.getGender().equals(Gender.MEN))
//                .max(Comparator.comparing(Person::getAge))
//                .get();
        Optional<Person> person2 =personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        person2.ifPresent(System.out::println);

        System.out.println("課題10");
        OptionalDouble womanAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womanAverageAge.ifPresent(a -> System.out.println("女性の平均年齢：" + a));

        System.out.println("課題11");
        OptionalDouble manAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        manAverageAge.ifPresent(a -> System.out.println("男性の平均年齢：" + Math.round(a*10.0)/10.0));

    }
}
