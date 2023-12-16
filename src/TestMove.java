public class TestMove {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("Initial Point: " + point);

        point.move();
        System.out.println("After Move: " + point);

        point.setSpeed(2.0f, 3.0f);
        point.move();
        System.out.println("After Set Speed and Move: " + point);
    }
}
