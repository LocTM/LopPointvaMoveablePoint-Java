public class TestPoint {
    public static void main(String[] args) {

        Point point1 = new Point();
        System.out.println("Point 1: " + point1);


        Point point2 = new Point(3.5f, 4.5f);
        System.out.println("Point 2: " + point2);


        point1.setXY(1.0f, 2.0f);
        System.out.println("Point 1 after setXY: " + point1);


        float[] numb = point2.getXY();
        System.out.println("Point 2 coordinates (x, y): " + numb[0] + ", " + numb[1]);
    }
}