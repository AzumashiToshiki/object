package basic.student;

class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("あいざわ","男",1);

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());

        student1.setGrade(2);
        System.out.println(student1);
    }
}
