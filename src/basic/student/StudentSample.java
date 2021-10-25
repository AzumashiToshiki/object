package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("toshiki","male",3);
        Student student2 = new Student("chie","female",3);

        //インスタンスの利用
        //値の取得
        System.out.println(student1);
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1.getGrade());
        System.out.println(student2);
        System.out.println(student2.getName());
        System.out.println(student2.getGender());
        System.out.println(student2.getGrade());

        //値のセット
        student1.setName("joe");
        student1.setGender("男");
        student1.setGrade(1);
        System.out.println(student1);


    }
}
