package ex.bmi;

import sample.enumsample.Gender;

class Member {
    private String name;
    private Gender gender;
    private int age;
    private double height;
    private double weight;

    public Member(String name, Gender gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
     return weight / Math.pow(height,2);
    }

    public double getAppweight() {
        return Math.pow(height,2) * 22;
    }

    public String getBodyShape() {
        double bmi = getBmi();
        if (bmi >= 40) {
            return "判定：肥満(4度)";
        } else if(bmi >= 35) {
            return "判定：肥満(3度)";
        } else if(bmi >= 30) {
            return "判定：肥満(2度)";
        } else if(bmi >= 25) {
            return "判定：肥満(1度)";
        } else if(bmi >= 18.5) {
            return "判定：普通";
        } else {
            return "判定：低体重";
        }
    }


    @Override
    public String toString() {
        return String.format("%s %s %d %.2fm %.2fkg BMI:%.2f 標準:%.2fkg,%s",
                name,gender.getJpName(),age,height,weight,getBmi(),getAppweight(),getBodyShape());
    }
}
