package CoreProgramming.ClassObject.Level1;
class CircleArea{
    private double radius ;
    public CircleArea(double radius){
        this.radius=radius;
    }

    public void areaCircle(){
        double area = 3.14*(radius*radius);
        System.out.println("Area of Circle: "+area);

    }

}
public class Circle {
    public static void main(String[] args) {
        CircleArea c1 = new CircleArea(5);
        c1.areaCircle();

        
    }
    
}
