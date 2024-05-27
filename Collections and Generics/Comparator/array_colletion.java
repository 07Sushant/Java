import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static class MyComparator implements java.util.Comparator<MyClass> {
        @Override
        public int compare(MyClass o1, MyClass o2) {
            return Integer.compare(o1.value, o2.value);
        }
    }
}
public class array_colletion {
    public static void main(String[] args) {
        List<MyClass> myList = new ArrayList<>();
        myList.add(new MyClass(6));
        myList.add(new MyClass(7));
        myList.add(new MyClass(8));

        Collections.sort(myList, new MyClass.MyComparator());

        System.out.println("Elements in sorted list:");
        for (MyClass obj : myList) {
            System.out.println(obj.getValue());
        }
    }
}
