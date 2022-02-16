package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String human;

        final int NUM = 17;

        String word = "Dione is ";
        human = (word);
        System.out.println(human + NUM + ", " + word + "not 17 :)");
        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if(NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили путь");
        }
    }

}

