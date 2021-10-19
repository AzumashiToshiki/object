package sample.lambda;

import java.util.function.Function;

class FunctionSample {
    public static void main(String[] args) {
        Function<Integer,Integer> function1 = i -> i * 2;
        Function<String,Integer> function2 = s -> s.length();

        System.out.println(function1.apply(10));//20
        System.out.println(function2.apply("apple"));//5
    }
}
