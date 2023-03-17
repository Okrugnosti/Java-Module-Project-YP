import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {


    //ЗАДАЧИ:
    //Приложение выводит сумму и стоимость товаров с обозначением валюты (рубль). Окончания в слове "рубль" зависят от целочисленной части.
    //Приложение умеет обрабатывать какие-то некорректные данные, например, неверное количество человек в счёте, ввод букв вместо цифр или отрицательную стоимость товара. В этом случае выводить сообщения об ошибках пользователю и заново запрашивать ввод данных.

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости

        //создание базовых классов
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        Tovar tovar = new Tovar();
        PrintRur pr = new PrintRur();
        ScanerExpection se = new ScanerExpection();

        int count_company = 0;
        String string;


        System.out.println("Привет, отлично пообедали в ресторане! \n" +
                "Уточните, на скольких человек необходимо разделить счёт?");

        //общий управляющий цикл
        while (true) {

            //count_company = scanner.nextInt();
            count_company = se.readInt(scanner, "Введите целое число");

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

                    string = scanner.nextLine();

                    //вызов калькулятора для расчетов и финального вывода результатов
                    if(string.equalsIgnoreCase("завершить")){

                        System.out.println("Ваш список товаров:\n" + tovar.getTovarName());
                        System.out.println("Итого: " + tovar.getTovarSumm() + " руб.\n");

                        //расчет стоимости на человека
                        //System.out.println("Стоимость на человека: "); // + calc.calcCompany(tovar.getTovarSumm()));
                        System.out.println("Стоимость на человека: " + String.format("%.2f", calc.calcCompany(tovar.getTovarSumm())) + " " +
                                //считаем окончание "руб."
                        pr.printRur(calc.calcCompany(tovar.getTovarSumm())));

                        System.out.println("\nПриходите еще!");

                        break;

                    } else {
                        tovar.setTovarName(string + "\n");

                        //tovar.setTovarSumm(scanner.nextDouble());
                        tovar.setTovarSumm(se.readDobl(scanner));
                    }
                }

                break;
            }
        }
    }
}
