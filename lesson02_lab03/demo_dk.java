package demo;

public class demo_dk {
    public static void main(String[] args) {
        int n=1;
//        while (n<=5){
//            System.out.println("kq 1: " +(n*10));
//            n++; // là cộng sau rồi ms in kết quả
//            // ++n là cộng trước lên 1 giá trị xong rồi ms in kết quả
//        }

//        do {
//            System.out.println("kq 2: " +(n*10));
//            n++;
//        }while(n<=5);

        int sum=0;
        for (int i=1;i<10;i++){
            sum+=i;
        }
        System.out.println("kq: " +sum);
    }
}
