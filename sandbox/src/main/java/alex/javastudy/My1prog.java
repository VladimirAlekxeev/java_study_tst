package alex.javastudy;

public class My1prog {
    public static void main(String[] args) {
        zdorovo("World");
        zdorovo("user");
        zdorovo("Vova");
        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

        double a = 4, b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b));
    }

    public static void zdorovo(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
    // метод вычисления площади квадрата
    public static double area( double len) {
        return len * len;
    }
    //метод вычисления площади прямоугольника
    public static  double area(double a, double b){
        return a * b;
    }



}

