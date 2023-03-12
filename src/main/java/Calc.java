public class Calc {

    //Tovar tw = new Tovar();

    int count_company;

    public void setCount_company(int count_company) {
        this.count_company = count_company;
    }

    public double calcCompany(double summ){

        return summ / count_company;
    }

}
