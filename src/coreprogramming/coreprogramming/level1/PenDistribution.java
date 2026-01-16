public class PenDistribution {
    public static void main(String[] args) {
        int pen = 14;
        int stu = 3;
        int penperStud = (pen/stu);
        int remainingpen = (pen%stu);
        System.out.println("The Pen Per Student is "+penperStud+
        " and the remaining pen not distributed is "+remainingpen);
    }
    
}
