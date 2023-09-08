// Lớp MovablePoint triển khai giao diện Movable
public class MovablePoint extends Movable {
    // biến x để lưu trữ tọa độ x của điểm
    private int x;
    // phương thức khởi tạo để gán giá trị cho x
    public MovablePoint(int x){
        this.x = x;
    }
    // phương thức để lấy giá trị của x
    public int getX(){
        return x;
    }
    // phương thức để thiết lập giá trị cho x
    public void setX(int x){
        this.x = x;
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
}
