// Lớp MovablePoint triển khai giao diện Movable
public abstract class MovablePoint extends Movable {
    // biến x để lưu trữ tọa độ x của điểm
    private int x;
    private int y;

    // phương thức khởi tạo để gán giá trị cho x và y
    public MovablePoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    // phương thức để lấy giá trị của x
    public int getX(){
        return x;
    }
    // phương thức để thiết lập giá trị cho x
    public void setX(int x){
        this.x = x;
    }
    // phương thức để lấy giá trị của y
    public int getY(){
        return y;
    }
    // phương thức để thiết lập giá trị cho y
    public void setY(int y){
        this.y = y;
    }
    // cách triển khai cho các phương thức trừu tượng của giao diện Movable
    @Override
    public void moveUp(){
    // khi moveUp() được gọi, tức là y++
        int y;
        
    }
    @Override
    public void moveDown(){
    // khi moveDown() được gọi, tức là y--
        int y;

    }
    @Override
    public void moveLeft(){
    // khi moveLeft() được gọi, tức là x--
        x--;
    }
    @Override
    public void moveRight(){
    // khi moveRight() được gọi, tức là x++
        x++;
    }

    public abstract void modeUp();

    public abstract void modeDown();

    public abstract void modeLeft();

    public abstract void modeRight();
}
