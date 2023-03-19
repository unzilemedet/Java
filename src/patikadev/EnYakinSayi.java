package patikadev;

public class EnYakinSayi {
    public static void main(String[] args) {
    int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
    int girilenSayi = 5;

    int enKucuk = Integer.MIN_VALUE;
    int enBuyuk = Integer.MAX_VALUE;

        for (int i = 0; i < dizi.length; i++) {
        if (dizi[i] < girilenSayi && dizi[i] > enKucuk) {
            enKucuk = dizi[i];
        }
        if (dizi[i] > girilenSayi && dizi[i] < enBuyuk) {
            enBuyuk = dizi[i];
        }
    }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyuk);
}
}
