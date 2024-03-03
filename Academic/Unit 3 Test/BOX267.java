class Box {
double width;
double height;
double depth;

Box() {
width = -1;
height = -1;
depth = -1;
}

Box(double length) {
this.width = length;
this.height = length;
this.depth = length;
}

Box(double width, double height, double depth) {
this.width = width;
this.height = height;
this.depth = depth;
}

public double volume() {
return width * height * depth;
}

public static void main(String args[]) {
switch (args.length) {
case 0:
Box b1 = new Box();
System.out.println("Volume of Box: " + b1.volume());
break;
case 1:
double l = Double.parseDouble(args[0]);
Box b2 = new Box(l);
System.out.println("Volume of Box(" + l + "): " + b2.volume());
break;
case 3:
double w = Double.parseDouble(args[0]);
double h = Double.parseDouble(args[1]);
double d = Double.parseDouble(args[2]);
Box b3 = new Box(w, h, d);
System.out.println("Volume of Box(" + w + ", " + h + ", " + d + "): " + b3.volume());
break;
}
}
}
