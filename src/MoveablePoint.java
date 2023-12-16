public class MoveablePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed()
    {
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "),"
                + " Speed = (" + xSpeed + ", " + ySpeed + ")";

    }
    public void move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
    }


}
