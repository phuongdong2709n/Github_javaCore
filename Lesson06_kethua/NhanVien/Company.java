package BaiTap.NhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    ArrayList<Employee> nhanvien=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public  void Nhap(){
        System.out.println("nhâp n nhan vien:");
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            System.out.println("nhan vien thu - " +(i+1) );
            Scanner sc=new Scanner(System.in);
            System.out.println("name:");
            String  name=sc.nextLine();
            System.out.println("age:");
            int age=Integer.parseInt(sc.nextLine());
            System.out.println("address:");
            String  address=sc.nextLine();
            System.out.println("salary:");
            int  salary=Integer.parseInt(sc.nextLine());
            System.out.println("position:");
            String position=sc.nextLine();
            Employee e=new Employee(name,age,address,salary,position);
            nhanvien.add(e);
        }
    }

    public void hienThi(){

        for (Employee nv : nhanvien){
            System.out.println("name:" +nv.getName());
            System.out.println("age:" +nv.getAge());
            System.out.println("address:" +nv.getAddress());
            System.out.println("salary:" +nv.getSalary());
            System.out.println("position:" +nv.getPosition());
            System.out.println("++++++++++++++++++++");
        }

    }

    public Employee SalaryMax(){
        //isEmpty Phương thức này trả về true nếu collection không chứa phần tử nào, và ngược lại trả về false
        if (nhanvien.isEmpty()) {
            return null;
        }
        return Collections.max(nhanvien, Comparator.comparingDouble(e -> Double.parseDouble(String.valueOf(e.getSalary()))));
    }

    public Employee TimNhanVien(String tim){
      return nhanvien.stream().filter(e -> e.getName().equals(e.getName())).findFirst().orElse(null);
    }

    public void SapXepLuong(){
        System.out.println("------------sắp xếp theo lương--------------");
        nhanvien.sort((o1, o2) -> (int) (o1.getSalary()- o2.getSalary()));
        System.out.println("---------------------------------");
    }

    public void SapXepTen(){
        System.out.println("------------sắp xếp theo tên--------------");
//        nhanvien.sort((o1, o2) -> (o1.getName().compareTo(o2.getName())));
        nhanvien.sort(Comparator.comparing(perSon::getName));
        System.out.println("---------------------------------");
    }
    public void thoat(){
        System.exit(0);
    }
    public static void main(String[] args) {
        Company cty=new Company();
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("--------LỰA CHỌN----------");
            System.out.println("1.nhập");
            System.out.println("2.hiển thị");
            System.out.println("3.Tìm nhân viên có lương cao nhất");
            System.out.println("4.Tìm nhân viên theo tên nhập vào");
            System.out.println("5.Sắp xếp lương nhân  viên");
            System.out.println("6.Sắp xếp tên nhân viên");
            System.out.println("7.thoát");
            int chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("Nhap n cong ty:");
                    int n=Integer.parseInt(sc.nextLine());
                    for (int i=0;i<n;i++){
                        System.out.println("công ty thứ - " +(i+1));
                        cty.Nhap();
                    }
                    break;
                case 2:
                    System.out.println("-----------hiển thị thông tin--------------");
                    cty.hienThi();
                    break;
                case 3:
                    System.out.println("nhân viên có lương cao nhất:" +cty.SalaryMax());
                    break;
                case 4:
                    System.out.println("nhân viên muốn tìm:"  );
                    String tim=sc.nextLine();
                    Employee v=cty.TimNhanVien(tim);
                    System.out.println("nhân viên có tên là " +tim +" : "+(v !=null ? v : "không tìm thấy"));
                   break;
                case 5:
                    cty.SapXepLuong();
                    cty.hienThi();
                    break;
                case 6:
                    cty.SapXepTen();
//                    System.out.println(cty.SapXepTen());
                    cty.hienThi();
                    break;
                case 7:

                default:
                    System.out.println("nhap từ 1->7");
                    break;
            }
        }

    }
}
