// Lớp TestShape để kiểm tra các lớp Hình chữ nhật và Hình tam giác
public class TestShape {
    // Tạo một đối tượng hình chữ nhật có chiều dài là 10, chiều rộng là 5 và màu sắc là xanh lá cây
    public static void main(String[] args){
// Tạo một đối tượng hình tam giác có độ dài cạnh đáy là 8, chiều cao là 6 và màu sắc là đỏ
        // In ra thông tin và diện tích của hình chữ nhật
        Rectangle rect = new Rectangle(10,5,"blue");
// In ra thông tin và diện tích của hình tam giác
        Triangle tri = new Triangle(8,6,"green");

        System.out.println(rect.toString());
        System.out.println("dien tich cua hinh chu nhat la:"+ tri.getArea());

        System.out.println(tri.toString());
        System.out.println("dien tich cua hinh tam giac la:"+ tri.getArea());
    }
}
