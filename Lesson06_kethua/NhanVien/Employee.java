package BaiTap.NhanVien;

public class Employee extends perSon {
    private int salary;
    private String position;

    public Employee(String name,int age,String address,int salary, String position) {
        super(name,age,address);
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

@Override
    public void hienThi(){
        super.hienThi();
        System.out.println("salary: " +salary);
        System.out.println("position: " +position);
    }
}
