public class star {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            System.out.print("* ");
        }
    }
}
