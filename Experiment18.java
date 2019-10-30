class Bird {
    public void eat() {
        System.out.println("All birds eat");
    }
}

class Peacock extends Bird {
    public void eat() {
        System.out.println("Peacock eats grains");
    }
}

class Parrot extends Bird {
    public void eat() {
        System.out.println("Parrot eats flesh");
    }
}

public class Experiment18 {
    public static void main(String args[]) {
        Bird bird = new Bird();
        bird.eat();
        Peacock peacock = new Peacock();
        bird = peacock;
        bird.eat();
        Parrot parrot = new Parrot();
        bird = parrot;
        bird.eat();
    }
}

