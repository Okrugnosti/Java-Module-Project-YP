public class Calc {

    //Tovar tw = new Tovar();

    int countCompany;

    public void setCountCompany(int countCompany) {
        this.countCompany = countCompany;
    }

    public double calcCompany(double summ) {

        return summ / countCompany;
    }
}
