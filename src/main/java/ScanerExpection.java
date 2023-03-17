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

            double price = Double.parseDouble(line);

            try {

                if (price >0 ) {
                    return price;}
                else {System.out.println("Ошибка: введите числовое НЕ отрицательное значение");}

            } catch (NumberFormatException e){
                System.out.println("Ошибка: введите числовое значение");
            }
        }
    }




}
