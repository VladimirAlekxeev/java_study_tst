package alex.javastudy;

public class My1prog {
    public static void main(String[] args) {
        zdorovo("World");
        zdorovo("user");
        zdorovo("Vova");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + area(s));

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + area(r));
    }

    public static void zdorovo(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
    // метод вычисления площади квадрата
    public static double area(Square s) {
        return s.l * s.l;
    }
    //метод вычисления площади прямоугольника
    public static  double area(Rectangle r){
        return r.a * r.b;
    }



}

