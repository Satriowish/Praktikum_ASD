package P5.Pangkat;

public class Pangkat26 {
    public int nilai, pangkat;

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            int hasil = pangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return (hasil * hasil * a);
            } else {
                return (hasil * hasil);
            }
        }
    }
}
