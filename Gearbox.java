package electrics.industries;

public class Gearbox {

    private int s = 0;
    private int e = 0;

    public void doit(int i) {
        setE(i);
        if ((s == 0) || (i > 2000 && s < 6)) {
            s++;
        } else if (i < 500 && s > 1) {
            s--;
        }

    }

    private void setE(int e) {
        this.e = e;
    }

}