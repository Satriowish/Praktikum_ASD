package P3.LatihanP3;

public class Mahasiswa26 {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    void hitungRataIpk(Mahasiswa26[] mhsArray) {
        double totalIpk = 0;
        for (int i = 0; i < mhsArray.length; i++) {
            totalIpk += mhsArray[i].ipk;
        }
        double rataIpk = totalIpk / mhsArray.length;
        System.out.println("Rata-rata IPK: " + rataIpk);
    }

    void tampilDataIpkTerbesar(Mahasiswa26[] mhsArray) {
        double maxIpk = mhsArray[0].ipk;
        int indexMaxIpk = 0;
        for (int i = 1; i < mhsArray.length; i++) {
            if (mhsArray[i].ipk > maxIpk) {
                maxIpk = mhsArray[i].ipk;
                indexMaxIpk = i;
            }
        }
        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama : " + mhsArray[indexMaxIpk].nama);
        System.out.println("NIM : " + mhsArray[indexMaxIpk].nim);
        System.out.println("Jenis Kelamin : " + mhsArray[indexMaxIpk].jenisKelamin);
        System.out.println("Nilai IPK : " + mhsArray[indexMaxIpk].ipk);
    }
}
