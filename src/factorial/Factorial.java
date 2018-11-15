package factorial;

public class Factorial {

    public static void main(String[] args) {

        int x;
        int y;

        x = 8;

        int i;
        if (x == 0) {
            y = 1;
        } else {
            y = 1;
            for (i = x; i >= 1; i--) {
                y = y * i;
            }
        }

        System.out.println(y);

    }

}
