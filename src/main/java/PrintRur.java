public class PrintRur {

    int lastCharacter = 0;
    String str;

    public String printRur2(double chisl_o) {

        int chisl = (int) Math.floor(chisl_o);
        //System.out.println(chisl + "__");

        int ostatoc = (chisl) % 100 / 10;
        //System.out.println(ostatoc + "___");

        if (ostatoc == 1) {
            return "рублей";
        }

        switch (chisl % 10) {
            case 1:
                return "рубль";

            case 2:
            case 3:
            case 4:
                return "рубля";

            default:
                return "рублей";

        }
    }

    //скрытый метод для тестирования окончаний "Руб."
    public void testPrintRur() {

        double i = 0;

        for (i = 0; i < 120; i = i + 0.1) {

            //System.out.println(i + "_");
            printRur2(i);

            System.out.println(String.format("%.2f ", i) + printRur2(i));

        }
    }
}
