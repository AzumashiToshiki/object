package ex.student1;

class Student {
    private String name;//名前
    private String gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }
}
