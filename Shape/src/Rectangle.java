//Lớp con hình chữ nhật kế thừa từ lớp hình dạng
public class Rectangle extends Shape {
    //Các thuộc tính của hình chữ nhật:chiều dài và chiều rộng
    private double length;
    private double width;
    //Màu sắc của hình chữ nhật;
    private String color;

    //Hàm tạo của lớp hình chữ nhật
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    //Phương thức để lấy màu sắc của hình chữ nhật
    public String getColor() {
        return this.color;
    }

    //Phương thức để tính diện tích của hình chữ nhật
    public double getArea() {
        return this.length * this.width;
    }

    //Phương thức để biểu diễn hình chữ nhật dưới dạng chuỗi

    public String totring() {
        return "Hinh chu nhat co chieu dai" + this.length + ",Chieu rong" + this.width + ",Va mau sac" + this.color;
    }
}