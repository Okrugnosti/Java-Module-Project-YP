public class PrintRur {

    int lastCharacter = 0;
    String str;

    public String printRur(double chisl_o){


        int chislo = (int)chisl_o;

        //System.out.println(chislo);

        //последняя цифра
        //1 21 31 рубль
        //2 3 4 22-24 рубля
        //5 6 7 8 9 10 11 95-99 рублей



            lastCharacter = chislo % 10;

            switch (chislo){

                case 1:
                    str = "рубль";
                    break;

                case 2:
                case 3:
                case 4:
                    str = "рубля";
                    break;

                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    str = "рублей";
                    break;
            }

        return str;
    }
}
