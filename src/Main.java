import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {

        ArrayList<Challenge> challengeList = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/xyi.txt"), "UTF-8");
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(",");
            //String s = "";
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < split.length; i++) {
                sb.append(split[i]);
            }
            Challenge challange = new Challenge(split[0],split[1],sb.toString());
            challengeList.add(challange);
        }
        sc.close();
        Scanner hui = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Рандомь челенеж или nahui");
        while (true) {
            if (hui.nextLine().equals("nahui")) {
                int i = random.nextInt(challengeList.size());
                System.out.println(challengeList.get(i));
                challengeList.remove(i);
            }
            else{
                System.out.println("asdasdasdsam pshel nahui");
            }
        }



        //for (int i = 0; i < challangeList.size(); i++){


    }
}

/*
    String author = new String();
    String implementer = new String();
    String text = new String();
            for(int j = 0; j < currentChallenge.size(); j++){
        if(currentChallenge[j] != ","){

        }
        }
   */