package q11274;

class SuperClass {
int value1, value2;

SuperClass(int value1, int value2) {
this.value1 = value1;
this.value2 = value2;
}

void show() {
System.out.println("This is super class show() method");
System.out.println("value1: " + value1);
}
}

class Subclass extends SuperClass {
int value3, value4;

Subclass(int value1, int value2, int value3, int value4) {
super(value1, value2);
this.value3 = value3;
this.value4 = value4;
}

void show() {
System.out.println("This is sub class show() method");
super.show();
System.out.println("value2 from super class: " + super.value2);
System.out.println("value3: " + this.value3);
System.out.println("value4: " + this.value4);
}
}

public class AccessUsingsuper {
public static void main(String[] args) {
Subclass obj = new Subclass(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
obj.show();
}
}
