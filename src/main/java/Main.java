import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("Привет, отлично пообедали в ресторане! \n" +
                "Уточните, на скольких человек необходимо разделить счёт?");

        //создание базовых классов
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        Tovar tovar = new Tovar();
        int count_company = 0;
        String string;
        //double chislo;

        //общий управляющий цикл
        while (true) {

            count_company = scanner.nextInt();

            if (count_company <= 1) {
                System.out.println("Спасибо, что воспользовались нашим рестораном.\n" +
                        "Вижу, что вы пришли не один. Введите точное кол-во вашей компании, для разделения счета");

            } else {

                //запоминаем кол-во посетителей в калькулятор
                calc.setCount_company(count_company);

                //цикл запуска заполнения товаров
                while (true) {

                    System.out.println("Введите название товара и в следующей строке цену.\n " +
                            "Для завершения введите 'Завершить'");

                    string = scanner.next();

                    //вызов калькулятора для расчетов и финального вывода результатов
                    if(string.equalsIgnoreCase("завершить")){

                        System.out.println("Ваш список товаров:\n" + tovar.getTovarName());
                        System.out.println("Итого: " + tovar.getTovarSumm() + " руб.\n");

                        //расчет стоимости на человека
                        //System.out.println("Стоимость на человека: "); // + calc.calcCompany(tovar.getTovarSumm()));
                        System.out.println("Стоимость на человека: " + String.format("%.2f", calc.calcCompany(tovar.getTovarSumm())) + " руб.");

                        System.out.println("\nПриходите еще!");

                        break;

                    } else {
                        tovar.setTovarName(string + "\n");
                        //chislo =
                        tovar.setTovarSumm(scanner.nextDouble());
                    }

                }

                break;
            }
        }
    }
}
