import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

        Out.println("x-Koordinate");
        double x = In.readDouble();

        Out.println("y-Koordinate");
        double y = In.readDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance >= 4 && x <= 4 && y <= 4) {
            Out.println("innerhalb der grünen Fläche");
        } else {
            Out.println("außerhalb der grünen Fläche");
        }
    }

}
