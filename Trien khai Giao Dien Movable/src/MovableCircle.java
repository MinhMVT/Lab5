// Lớp MovableCircle kế thừa từ lớp MovablePoint
public class MovableCircle extends MovablePoint {

    private int radius;

    private MovablePoint center;

    private int speed;

    public MovableCircle(int radius,int x,int y,int speed){
        super(x,y);
        this.radius = radius;
        this.center = new MovablePoint(x, y) {
            @Override
            public void modeUp() {

            }

            @Override
            public void modeDown() {

            }

            @Override
            public void modeLeft() {

            }

            @Override
            public void modeRight() {

            }
        };
        this.speed = speed;
    }
    // phương thức để thiết lập giá trị cho radius
    public int getRadius(){
        return radius;
    }
    // phương thức để lấy giá trị của center
    public void setRadius(int radius){
        this.radius = radius;
    }
    // phương thức để thiết lập giá trị cho center
    public MovablePoint getCenter(){
        return center;
    }
    // phương thức để lấy giá trị của speed
    public int getSpeed(){
        return speed;
    }
    // phương thức để thiết lập giá trị cho speed

    public void setSpeed(int speed){
        this.speed = speed;
    }
    // cách triển khai cho các phương thức của giao diện Movable bằng cách sử dụng đối tượng center

    @Override
    public void modeUp(){
        center.moveUp();// gọi phương thức moveUp() của đối tượng center
    }

    @Override
    public void modeDown(){
        center.moveDown();// gọi phương thức moveDown() của đối tượng center
    }


    @Override
    public void modeLeft(){
        center.moveLeft();// gọi phương thức moveLeft() của đối tượng center
    }


    @Override
    public void modeRight(){
        center.moveRight(); // gọi phương thức moveRight() của đối tượng center
    }
}
