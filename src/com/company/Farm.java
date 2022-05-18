package com.company;

public abstract class Farm {
    public int weight;
    public int age;
    public String gender;
    public String NickName;
    private static String address;
    private static String ownerName;
    private int[] farm1;
    private int[] far2;

    static String getAddress(String address) {return "Address: " + address;}

    static String getOwnerName(String ownerName) {return "Owner name: " + ownerName;}

}

