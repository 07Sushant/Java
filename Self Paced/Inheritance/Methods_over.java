public class Methods_over {
    public static void main(String[] args) {
        calc clcs = new calc();
        System.out.println(clcs.sum(1,2));
    }
}

class calc {
    int sum(int a, int b)
    {
        return a+b;
    }
    float sum(float a, float b)
    {
        return a + b;
    }
}

