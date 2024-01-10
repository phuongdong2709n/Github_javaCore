package demo;

public class bai5 {
    public static void main(String[] args) {
        int height = 6;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (i == height || j == height - i + 1 || j == height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
