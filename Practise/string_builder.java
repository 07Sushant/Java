public class string_builder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Sushant Kumar");
        String b ="Sushant Kumar";
        sc.ensureCapacity(23);
        System.out.println(sc.length());
        System.out.println(sc.capacity());
        sc.reverse();
        // sc.toUpperCase();
        sc.delete(3, 9); // Adjusted indexes based on the reversed string
        sc.insert(5, "HELL");
        System.out.println(sc);
        String c = sc.substring(3, 9); // Adjusted indexes based on the reversed string
        System.out.println(sc);
        sc.replace(2, 7, "COOL");
        System.out.println(sc);
    }
}
