package sample.equals;

/*
    20211020更新
    Employee→Employee1に変更
    Employee2のequalsメソッドをサブクラスも等しいとするように変更

 */
class EqualsSample {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1(1,"Tom");
        Employee1 employee12 = employee1;
        Employee1 employee13 = new Employee1(2,"John");
        Employee1 employee14 = new Employee1(1,"Tom");
        Employee2 employee21 = new Employee2(1,"Tom");

        //比較
        System.out.println("1 2:" + employee1.equals(employee12));
        System.out.println("1 3:" + employee1.equals(employee13));
        System.out.println("1 4:" + employee1.equals(employee14));
        System.out.println("1 21:" + employee1.equals(employee21));
    }
}
