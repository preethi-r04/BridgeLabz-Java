package CoreProgramming.Strings.Level2;

public class StudentGrade {

    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int)(Math.random() * 90) + 10;
        return scores;
    }

    static double[][] calculate(int[][] scores) {
        double[][] res = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            res[i][0] = total;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return res;
    }

    static String[] grade(double[][] data) {
        String[] g = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double p = data[i][2];
            g[i] = p >= 90 ? "A" : p >= 75 ? "B" : p >= 60 ? "C" : "D";
        }
        return g;
    }

    static void display(int[][] scores, double[][] calc, String[] grade) {
        System.out.println("P\tC\tM\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + (int)calc[i][0] + "\t" + calc[i][1] + "\t" + calc[i][2] + "\t" + grade[i]);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] calc = calculate(scores);
        String[] grade = grade(calc);
        display(scores, calc, grade);
    }
}

