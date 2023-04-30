package alisveris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Dukkan {
    Scanner scan = new Scanner(System.in);
    Reyon reyon;
    Market market= new Market();

    public void start() {

        boolean flag;
        do {
            System.out.println("Hosgeldiniz. Hangi reyondan alisveris yapmak istersiniz. \n 1)Manav \n 2)Sarkuteri \n 3)Market");
            int reyonSayi = scan.nextInt();
            flag = false;
            switch (reyonSayi) {
                case 1:
                case 2:
                case 3:
                    showReyon(reyonSayi);
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
                    flag = true;
            }
        } while (flag);
    }

    public void showReyon(int selection){

        switch (selection){
            case 1: reyon = new Manav();
                break;
            case 2: reyon = new Sarkuteri();
                break;
            case 3: reyon= new Market();
        }
        for (Urun w : reyon.getUrunler()) {
            System.out.printf("%d - %s - %f \n", w.getUrunNo(), w.getUrunIsim(), w.getUrunFiyat());
        }
    }

    public void urunAl(){

        System.out.println("Almak istediginiz urunun numarasini giriniz");
        int urunNo = scan.nextInt();

        List<Urun> sepet = new ArrayList<>();
        for (Urun w :reyon.getUrunler()) {
            if (urunNo == w.getUrunNo()){
                sepet.add(w);
            }

        }

        System.out.println(sepet.get(0).getUrunIsim());

    }
    // Github'da eklendi.
    intelije geldi mi




}//class
