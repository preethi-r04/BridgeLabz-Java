package com.bridgelabz;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class JSONProcessor {

    public static void processJSON() {

        try {

            ObjectMapper mapper = new ObjectMapper();

            InputStream input = JSONProcessor.class
                    .getClassLoader()
                    .getResourceAsStream("ipl.json");
            if(input == null){
                throw new RuntimeException("ipl.json is mot found");
            }


            List<IPLMatch> matches =
                    mapper.readValue(input, new TypeReference<List<IPLMatch>>() {});

//                    File file = new File("src/main/resources/ipl.json");
//            List<IPLMatch> matches =
//                    mapper.readValue(file, new TypeReference<List<IPLMatch>>() {});

            for (IPLMatch match : matches) {

                match.team1 = maskTeam(match.team1);
                match.team2 = maskTeam(match.team2);
                match.winner = maskTeam(match.winner);

                match.player_of_match = "REDACTED";
            }

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File("censored_ipl.json"), matches);

            System.out.println("JSON file processed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String maskTeam(String team) {

        if (team.contains(" ")) {
            return team.split(" ")[0] + " ***";
        }

        return "***";
    }
}