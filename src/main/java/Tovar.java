public class Tovar {

    String tovar;
    double tovarSumm;

    public Tovar() {
        this.tovar = "";
        this.tovarSumm = 0;
    }

    public void setTovarName(String tovar) {
        this.tovar = this.tovar + tovar;
    }

    public void setTovarSumm(double tovarSumm) {
        this.tovarSumm = this.tovarSumm + tovarSumm;
    }

    public String getTovarName() {
        return tovar;
    }

    public double getTovarSumm() {
        return tovarSumm;
    }
}
