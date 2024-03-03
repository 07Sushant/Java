package A11264;

class Student {
int id;
String name;

public void setData(int id, String name) {
this.id = id;
this.name = name;
}

public void displayData() {
System.out.println("Id: " + id);
System.out.println("Name: " + name);
}
}

class Marks extends Student {
float javaMarks;
float cMarks;
float cppMarks;

public void setMarks(float javaMarks, float cMarks, float cppMarks) {
this.javaMarks = javaMarks;
this.cMarks = cMarks;
this.cppMarks = cppMarks;
}

public void displayMarks() {
System.out.println("Java marks: " + javaMarks);
System.out.println("C marks: " + cMarks);
System.out.println("Cpp marks: " + cppMarks);
}
}

class Result extends Marks {
float total;
float avg;

public void compute() {
this.total = this.javaMarks + this.cMarks + this.cppMarks;
this.avg = this.total / 3;
}

public void showResult() {
System.out.println("Total: " + total);
System.out.println("Avg: " + avg);
}
}

class MultilevelInheritanceDemo {
public static void main(String[] args) {
int id = Integer.parseInt(args[0]);
String name = args[1];
float javaMarks = Float.parseFloat(args[2]);
float cMarks = Float.parseFloat(args[3]);
float cppMarks = Float.parseFloat(args[4]);

Result r = new Result();
r.setData(id, name);
r.setMarks(javaMarks, cMarks, cppMarks);
r.compute();
r.displayData();
r.displayMarks();
r.showResult();
}
}
