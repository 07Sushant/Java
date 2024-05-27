public class instance_local_variables {
    static int c = 30;
    float b = 0.6f;

    void fun() {
        float a = 0.7f;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        instance_local_variables obj = new instance_local_variables();
        obj.fun();
    }
}
