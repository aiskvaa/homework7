package com.company;

public class Main {

    public static void main(String[] args) {
        Magic Erzhan = new Magic();
        Medic Aibolit = new Medic();
        Warrior Bekzhan = new Warrior();

        Hero[]heroes = { Erzhan, Aibolit, Bekzhan};
        for (int i = 0; i < heroes.length ; i++) {
            heroes[i].applySuperAbility();

        }


    }


}
