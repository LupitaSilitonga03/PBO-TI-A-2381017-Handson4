public class ContohMethod {
    public static int hitungluasPersegi(int sisi) {
       return sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 10;
        int luas = hitungluasPersegi(sisi);
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}
