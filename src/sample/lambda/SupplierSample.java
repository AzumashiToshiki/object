package sample.lambda;

import java.util.function.Supplier;

class SupplierSample {
    public static void main(String[] args) {
        class Test{}

        Supplier<String> supplier1 = () -> "abc";
        Supplier<Test> supplier2 = () -> new Test();

        System.out.println(supplier1.get());//abc
        Test test = supplier2.get();//インスタンス作成
    }
}
