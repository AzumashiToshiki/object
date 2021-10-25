package sample.equals;

/*
    20211020更新
    Employee→Employee1に変更
    Employee2のequalsメソッドをサブクラスも等しいとするように変更
    Employee2のサブクラスEmployee3を追加
 */
class EqualsSample {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1(1, "Tom");
        Employee1 employee12 = employee1;
        Employee1 employee13 = new Employee1(2, "John");
        Employee1 employee14 = new Employee1(1, "Tom");
        Employee2 employee21 = new Employee2(1, "Tom");
        Employee3 employee31 = new Employee3(1, "Tom");
        Employee3 employee32 = new Employee3(2, "John");

        //比較
        System.out.println("同一のオブジェクト:" + employee1.equals(employee12));
        System.out.println("値が異なる:" + employee1.equals(employee13));
        System.out.println("同一クラスで値も同一:" + employee1.equals(employee14));
        System.out.println("クラスが異なる" + employee1.equals(employee21));

        System.out.println("サブクラスで値が同じ" + employee21.equals(employee31));
        System.out.println("サブクラスで値が異なる" + employee21.equals(employee32));
    }
}
