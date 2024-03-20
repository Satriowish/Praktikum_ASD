package P5.SumArray;

public class Perusahaan26 {
    int bulan;
    double[] keuntungan;

    public Perusahaan26(int bulan, double[] keuntungan) {
        this.bulan = bulan;
        this.keuntungan = keuntungan;
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < bulan; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    double totalDC() {
        return totalDC(0, bulan - 1);
    }

    private double totalDC(int l, int r) {
        if (l == r) {
            return keuntungan[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(l, mid);
            double rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
