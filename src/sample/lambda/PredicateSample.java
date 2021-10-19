package sample.lambda;

import java.util.function.Predicate;

class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = i -> i >= 60;
        Predicate<String> predicate2 = s -> s.length() >= 3;

        System.out.println(predicate1.test(80));//true
        System.out.println(predicate2.test("ab"));//false
    }
}
