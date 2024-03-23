interface shapes{
    void circle();
    void triangle();
}


public class Circle {
    public static void main(String[] args) {
        
        shapes shape = new shapes() {
            @Override
            public void circle() {
                System.out.println("This is circle");
            }

            @Override
            public void triangle() {
                System.out.println("This is triangle");
            }
        };
        
        shape.circle();
        shape.triangle();
    }
}

