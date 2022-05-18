package com.company;

public class Horse extends Farm {
    private String colour;

    public Horse(int weight,int age,String gender,String NickName,String colour) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.NickName = NickName;
        this.colour = colour;
    }
    public Horse() {}
    @Override
    public String toString() {
        return "Weight: "+weight+", Age: "+age+", Gender: "+gender+", Nick Name: "+NickName+", Colour: "+colour;
    }
}
