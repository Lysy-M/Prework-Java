package pl.coderslab.cflowcontrol;

public class Main08 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}