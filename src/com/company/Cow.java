package com.company;

public class Cow extends Farm {

    public Cow(int weight,int age,String gender,String NickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.NickName = NickName;
    }
    @Override
    public String toString() {
        return "Weight: "+weight+", Age: "+age+", Gender: "+gender+", Nick Name: "+NickName;
     }
}
