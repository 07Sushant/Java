interface Shapes {
    void circle();
    void triangle();
}

abstract class ShapeAbstract {
    abstract void circle();
    abstract void triangle();
}

public class Abstract_anno {
    public static void main(String[] args) {
        
        // Implementing the Shapes interface using anonymous class
        Shapes shapeInterface = new Shapes() {
            @Override
            public void circle() {
                System.out.println("This is circle from interface");
            }

            @Override
            public void triangle() {
                System.out.println("This is triangle from interface");
            }
        };
        
        // Calling methods from interface implementation
        shapeInterface.circle();
        shapeInterface.triangle();
        
        // Implementing the ShapeAbstract class using anonymous class
        ShapeAbstract shapeAbstract = new ShapeAbstract() {
            @Override
            void circle() {
                System.out.println("This is circle from abstract class");
            }

            @Override
            void triangle() {
                System.out.println("This is triangle from abstract class");
            }
        };
        
        // Calling methods from abstract class implementation
        shapeAbstract.circle();
        shapeAbstract.triangle();
    }
}
