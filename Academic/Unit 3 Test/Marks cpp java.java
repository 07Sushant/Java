class Marks {
int id;
float javaMarks;
float cMarks;
float cppMarks;

public void setMarks(int id, float javaMarks, float cMarks, float cppMarks) {
this.id = id;
this.javaMarks = javaMarks;
this.cMarks = cMarks;
this.cppMarks = cppMarks;
}

public void displayMarks() {
System.out.println("Id: " + id);
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

class SingleInheritanceDemo {
public static void main(String[] args) {
int id = Integer.parseInt(args[0]);
float javaMarks = Float.parseFloat(args[1]);
float cMarks = Float.parseFloat(args[2]);
float cppMarks = Float.parseFloat(args[3]);

Result r = new Result();
r.setMarks(id, javaMarks, cMarks, cppMarks);
r.compute();
r.displayMarks();
r.showResult();
}
}





