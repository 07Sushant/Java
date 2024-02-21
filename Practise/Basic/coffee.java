public class coffee {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Enter the complete details");
            return;
        }

        int cup = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int days = Integer.parseInt(args[2]);

        double cost = cup * rate * days;

        System.out.println("The total bill is: " + cost);
    }
}
