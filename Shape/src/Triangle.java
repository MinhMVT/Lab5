// Lớp con Hình tam giác kế thừa từ lớp Hình dạng
class Triangle extends Shape {
    // Các thuộc tính của hình tam giác: độ dài cạnh đáy và chiều cao
    private double base;
    private double height;
    // Màu sắc của hình tam giác
    private String color;
    // Hàm tạo của lớp Hình tam giác
    public Triangle(double base,double height,String color){
        this.base = base;
        this.height = height;
        this.color = color;
    }
    // Phương thức để lấy màu sắc của hình tam giác
    public String getColor(){
        return this.color;
    }
    // Phương thức để tính diện tích của hình tam giác
    public double getArea(){
        return this.base * this.height / 2.0;
    }
    // Phương thức để biểu diễn hình tam giác dưới dạng chuỗi
    public String totring(){
        return "Hinh dang tam giac  co do giay day"+ this.base +",chieu cao"+this.height +",mau sac"+this.color;
    }
}

