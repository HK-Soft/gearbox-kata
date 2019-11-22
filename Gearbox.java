package electrics.industries;

public class Gearbox {

    private int s = 0;
    private int e = 0;

    public void doit(int i) {
        e = i;
        if (s == 0) {
            s++;
            return;
        }
        if (i > 2000) {
            s++;
        } else if (i < 500) {
            s--;
        }
        if (s > 6) {
            s--;
        } else if (s < 1) {
            s++;
        }

    }

}