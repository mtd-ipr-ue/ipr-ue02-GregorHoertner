import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        Out.println("Zahl1");
        int number1 = In.readInt();

        Out.println("Zahl2");
        int number2 = In.readInt();

        Out.println("Zahl3");
        int number3 = In.readInt();

        int max = 0;

        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else {
            max = number3;
        }
        Out.println("Maximum");
        Out.println(max);
    }
}
