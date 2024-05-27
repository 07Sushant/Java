import java.util.TreeSet;

class MyClass implements Comparable<MyClass> {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.value, other.value);
    }
}

public class comparator {
    public static void main(String[] args) {
        TreeSet<MyClass> myTreeSet = new TreeSet<>();

        myTreeSet.add(new MyClass(6));
        myTreeSet.add(new MyClass(7));
        myTreeSet.add(new MyClass(8));

        System.out.println("Elements in TreeSet:");
        for (MyClass obj : myTreeSet) {
            System.out.println(obj.getValue());
        }
    }
}
