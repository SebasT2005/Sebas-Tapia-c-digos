public class TrinomioCuadradoPerfecto {

    public static void main(String[] args) {
        double a = 1;
        double b = 6;
        double c = 9;

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("El trinomio tiene una raíz doble en x = " + x);
        } else if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("El trinomio tiene dos raíces reales en x1 = " + x1 + " y x2 = " + x2);
        } else {
            System.out.println("El trinomio no tiene raíces reales");
        }
    }
}
