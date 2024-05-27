public class nested {
    public static void main(String[] args) {
        outer.nested objnested = new outer.nested();
        objnested.display();
        
    }
}

class outer
{
    static class nested{
        void display()
        {
            System.out.println("Nesting");
        }
    }
}