public class P43
{
    private double s1;
    private double s2;
    private double s3;
    private double m1;
    private double m2;
    private double m3;
    public double[] side = new double[3];
    public double[] angle = new double[3];
    public P43(double l1, double M1, double l2, double M2, double l3,double M3) {
        s1=l1; 
        s2=l2; 
        s3=l3; 
        m1=M1; 
        m2=M2; 
        m3=M3;
        }
    public double[] sideLength()
    {
        double v1 = s1-s2;
        double p1 = m1 - m2;
        double s1 = Math.sqrt( v1*v1 + p1*p1 ); double v2 = s1-s3;
        double p2 = m1 - m3;
        double s2 = Math.sqrt( v2*v2 + p2*p2 ); double v3 = s3-s2;
        double p3 = m3 - m2;
        double s3 = Math.sqrt( v3*v3 + p3*p3 ); side[0] =s1;
        side[1] =s2;
        side[2] =s3;
        return side;
    }
    public double[] angles()
    {
        double ang1 = Math.acos((side[0]*side[0] + side[1]*side[1] - side[2]*side[2])/(2.0*side[0]*side[1]));
        double ang2 = Math.acos((side[2]*side[2] + side[1]*side[1] - side[0]*side[0])/(2.0*side[2]*side[1]));
        double ang3 = Math.acos((side[0]*side[0] + side[2]*side[2] - side[1]*side[1])/(2.0*side[0]*side[2]));
        angle[0] = ang1; angle[1] = ang2; angle[2] = ang3; return angle;
    }
    public double perimeter()
    {
             double perim = side[0] + side[1] + side[2]; return perim;
    }
    public double area()
    {
            double p2 = (side[0] + side[1] + side[2])/2;
            double area = Math.sqrt(p2*(p2-side[0])*(p2-side[1])*(p2-side[2]));
            return area;
    }
    
    public static void main(String[] args)
    {
        P43 t = new P43(0.0,0.0,5.0,0.0,3.2,2.4); double[] sides = t.sideLength(); 
        System.out.println("Side Length 1: " + sides[0]); 
        System.out.println("Side Length 2: " + sides[1]); 
        System.out.println("Side Length 3: " + sides[2]); double perim = t.perimeter(); 
        System.out.println("Perimeter: " + perim); double area = t.area(); 
        System.out.println("Area: " + area);
        double[] angles = t.angles(); 
        System.out.println("Angle 1: " + angles[0]); 
        System.out.println("Angle 2: " + angles[1]); 
        System.out.println("Angle 3: " + angles[2]);
    }
}
