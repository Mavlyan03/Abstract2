package com.company;

public class Main {

    public static void main(String[] args) {

        Sheep sheep1 = new Sheep(10,1,"Male","Jack");
        Sheep sheep2 = new Sheep(11,2,"Male","John");
        Sheep sheep3 = new Sheep(12,3,"Male","MacDonald");
        Sheep sheep4 = new Sheep(13,4,"Female","Bony");

        Cow cow1 = new Cow(150,3,"Female","Bull1");
        Cow cow2 = new Cow(142,4,"Female","Bull2");
        Cow cow3 = new Cow(155,5,"Female","Bull3");
        Cow cow4 = new Cow(163,6,"Female","Bull4");
        Cow cow5 = new Cow(176,7,"Female","Bull5");
        Cow cow6 = new Cow(174,5,"Female","Bull6");

        Horse horse1 = new Horse(144,2,"Male","Spirit","Brown");
        Horse horse2 = new Horse(152,2,"Male","Speedy","White");
        Horse horse3 = new Horse(158,2,"Male","Arkan","Black");

        Farm[] farm1 = {sheep1,sheep2,sheep3,cow1,cow2,cow3,cow4,cow5,horse1,horse2};
        System.out.println(Farm.getAddress("Tokmok"));
        System.out.println(Farm.getOwnerName("Jylkybaev Elnur"));
        for (Farm i:farm1) {
            System.out.println((i));
        }
        System.out.println();
        System.out.println(Farm.getAddress("Kant"));
        System.out.println(Farm.getOwnerName("Kamchybekov Aibek"));
        Farm[] farm2 = {sheep4,cow6,horse3};
        for(Farm i:farm2) {
            System.out.println((i));
        }







    }}