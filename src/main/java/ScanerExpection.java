import java.util.Scanner;

public class ScanerExpection {

    public int readInt(Scanner s, String massege) {
        System.out.println(massege);
        while (true){
            String line = s.nextLine();

            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e){
                System.out.println("Ошибка: введите числовое ЦЕЛОЕ значение");
            }
        }
    }


    public double readDobl(Scanner ss) {

        while (true){
            String line = ss.nextLine();

            try {
                return Double.parseDouble(line);

            } catch (NumberFormatException e){
                System.out.println("Ошибка: введите числовое значение");
            }
        }
    }




}
