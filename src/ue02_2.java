import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        Out.println("Jahr");
        int year = In.readInt();

        Out.println("Monat (Wert)");
        int month = In.readInt();

        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                Out.println("Tage");
                Out.println(days);
                break;

            case 4, 6, 9, 11:
                days = 30;
                Out.println("Tage");
                Out.println(days);
                break;

            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                Out.println("FEHLER!");
        }
    }

}
