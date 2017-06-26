import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by rodio on 14.06.2017.
 */
public class ChallengeRandomizer {

    private Random random = new Random();

    public void startChallenges() throws IOException, URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(new File("challenges"), "UTF-8");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            stringBuilder.append(line);
        }
        scanner.close();

        JSONArray jsonArray = new JSONArray(stringBuilder.toString());
        List<Challenge> challengeList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            Challenge challenge = new ObjectMapper().readValue(jsonArray.getJSONObject(i).toString(), Challenge.class);
            challengeList.add(challenge);
        }

        System.out.println("Ready to start, for next type : \"poehali blet\"");

        Scanner in = new Scanner(System.in);
        while (true) {
            String s = in.nextLine();
            if (s.equals("poehali blet")) {
                getNextChallenge(challengeList);
            }
        }
    }

    private void getNextChallenge(List<Challenge> challenges) {
        int position = random.nextInt(challenges.size());
        System.out.println("Challenges left : " + challenges.size());
        System.out.println("Challenge picked : " + position);
        System.out.println(challenges.get(position));
        challenges.remove(position);

    }
}
