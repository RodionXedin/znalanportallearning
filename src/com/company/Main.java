package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  throws FileNotFoundException, IllegalArgumentException {
        ArrayList <Challenge> challengeList = new ArrayList<>();
        Scanner in = new Scanner(new File("src\\com\\company\\text.txt"));
        while (in.hasNextLine()){
            String[] split = in.nextLine().split(",");
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < split.length; i++) {
                sb.append(split[i]);
            }
            Challenge challenge = new Challenge(split[0],split[1],sb.toString());
            challengeList.add(challenge);
        }

        Random random = new Random();
        Scanner ras = new Scanner(System.in);
        System.out.println("Pishi roll dlya rolla chellendga");
        while (true){
            if(ras.nextLine().equals("roll")){
                int i = random.nextInt(challengeList.size());
                System.out.println(challengeList.get(i));
                challengeList.remove(i);
            }
            else{
                System.out.println("Nahui poshel");
            }

        }

    }


}


