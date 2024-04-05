package P7.MergeSortTest;

public class MergeSortMain26 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting26 msort = new MergeSorting26();
        System.out.println(" Data Awal ");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        msort.printArray(data);
    }
}
