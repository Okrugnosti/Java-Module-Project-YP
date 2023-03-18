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

        //скрытый метод для тестирования
        //pr.testPrintRur();


        //Модуль 1. Определить кол-во человек в компании
        System.out.println("Благодарим за выбор нашего ресторана! \n" +
                "Уточните, на сколько человек необходимо разделить счёт?");

        while (true) {

            count_company = se.readInt(scanner, "Значение должно быть >1");
            if (count_company <= 1) {
                System.out.println("Ошибка!");
            } else {
                break;
            }
        }

        //запоминаем кол-во посетителей в калькулятор
        calc.setCountCompany(count_company);


        //МОДУЛЬ 2. Запуск заполнения товаров
        while (true) {

            System.out.println("Введите название товара и в следующей строке цену.\n" +
                    "Для завершения введите 'Завершить'");

            string = scanner.nextLine();

            //вызов калькулятора для расчетов и финального вывода результатов
            if (string.equalsIgnoreCase("завершить")) {

                System.out.println("Ваш список товаров:\n" + tovar.getTovarName());
                System.out.println("Итого: " + tovar.getTovarSumm() + " руб.\n");

                //расчет стоимости на человека
                System.out.println("Стоимость на человека: " + String.format("%.2f", calc.calcCompany(tovar.getTovarSumm())) + " " +
                        //считаем окончание "руб."
                        pr.printRur2(calc.calcCompany(tovar.getTovarSumm())));

                System.out.println("\nПриходите еще!");

                break;

            } else {

                // ввод название товара
                tovar.setTovarName(string + "\n");
                // ввод стоимости товара
                tovar.setTovarSumm(se.readDobl(scanner));
            }
        }

    }

}
