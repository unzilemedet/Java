package patika.dev;

import java.util.HashMap;

public class Frekans {
    public static void main(String[] args) {

    int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
    HashMap<Integer, Integer> frekanslar = new HashMap<Integer, Integer>();

    for (int eleman : dizi ){
        if (frekanslar.containsKey(eleman)){
            frekanslar.put(eleman,frekanslar.get(eleman) +1);
        }else {
            frekanslar.put(eleman, 1);
        }
    }
    for(int eleman : frekanslar.keySet()){
        System.out.println(eleman +" "+ "sayısı" +" "+ frekanslar.get(eleman)  + "  kere tekrar edildi. ");
    }

}
}
