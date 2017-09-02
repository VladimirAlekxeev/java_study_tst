package alex.javastudy;

public class My1prog {
    public My1prog() {
    }

    public static void main(String[] args) {
        zdorovo("World");
        zdorovo("user");
        zdorovo("Vova");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
    }

    public static void zdorovo(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

}

