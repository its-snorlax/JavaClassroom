abstract class Shape {
    abstract int numberOfSides();
}

class Trapezoid extends Shape {
    int numberOfSides() {
        return 3;
    }
}

class Rectangle extends Shape {
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {
    int numberOfSides() {
        return 3;
    }
}

class Hexagon extends Shape {
    int numberOfSides() {
        return 6;
    }
}

class Experiment17 {
    public static void main(String[] args) {
        System.out.println("Rectangle - " + new Rectangle().numberOfSides());
        System.out.println("Hexagon - " + new Hexagon().numberOfSides());
        System.out.println("Triangle - " + new Triangle().numberOfSides());
        System.out.println("Trapezoid - " + new Trapezoid().numberOfSides());
    }
}