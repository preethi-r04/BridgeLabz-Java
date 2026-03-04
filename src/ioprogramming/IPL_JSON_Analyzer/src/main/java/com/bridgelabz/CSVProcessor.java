package com.bridgelabz;

import java.io.*;

public class CSVProcessor {

    public static void processCSV() {

        try {

            InputStream input = CSVProcessor.class
                    .getClassLoader()
                    .getResourceAsStream("ipl.csv");

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            BufferedWriter writer = new BufferedWriter(new FileWriter("censored_ipl.csv"));

            String line;
            boolean header = true;

            while ((line = reader.readLine()) != null) {

                if (header) {
                    writer.write(line);
                    writer.newLine();
                    header = false;
                    continue;
                }

                String[] data = line.split(",");

                data[1] = maskTeam(data[1]);
                data[2] = maskTeam(data[2]);
                data[5] = maskTeam(data[5]);

                data[6] = "REDACTED";

                writer.write(String.join(",", data));
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("CSV file processed.");

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