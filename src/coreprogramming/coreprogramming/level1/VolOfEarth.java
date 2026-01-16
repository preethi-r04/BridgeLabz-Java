public class VolOfEarth {
    public static void main(String[] args) {
        int radiusOfEarth = 6378;
        double vol = (4/3)* Math.PI *(radiusOfEarth * radiusOfEarth * radiusOfEarth);
        double radiusMiles = radiusOfEarth/1.6;
        double volMiles = (4/3)* Math.PI *(radiusMiles * radiusMiles * radiusMiles);
        System.out.println("The volume of earth in cubic kilometers is "+vol+ " and cubic miles is "+volMiles);

    }
}
