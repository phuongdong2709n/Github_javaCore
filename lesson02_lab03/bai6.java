package demo;

public class bai6 {
    public static void main(String[] args) {
        int rong=4;
        int dai=12;
        for(int i=1;i<=rong;i++){
            for(int j=1;j<=dai;j++){
                if(i==1 || j==1 || i==rong || j==dai){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
