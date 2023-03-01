
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sifre="123",kullaniciAdi="mertb";
        String gSifre,gKullaniciAdi;
        String devam,yeniSifre,testKullaniciAdi;

        Scanner oku=new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz : ");
        gKullaniciAdi=oku.nextLine();

        System.out.print("\nSifrenizi giriniz : ");
        gSifre=oku.nextLine();

        if(sifre.equals(gSifre) && kullaniciAdi.equals(gKullaniciAdi)){
            System.out.println("Hos Geldin "+ kullaniciAdi);
        }
        else {
            System.out.print("\nHatali giris yaptiniz sifrenizi degistirmek ister misiniz? (e ya da h)\n?");
            devam=oku.nextLine();

            if (devam.equals("e")){
                System.out.print("\nKullanici adinizi giriniz :");
                testKullaniciAdi=oku.nextLine();
                if (kullaniciAdi.equals(testKullaniciAdi)){
                System.out.print("\nSifre giriniz : ");
                yeniSifre=oku.nextLine();
                if (yeniSifre.equals(sifre)){
                    System.out.println("\nEski sifre yeni sifreyle ayni olamaz!");
                }
                else {
                    System.out.println("\nSifre olusturuldu.");
                    sifre=yeniSifre;
                    System.out.println("Yeni sifreniz = "+sifre);
                }
            }
            else{
                    System.out.println("Hatali kullanici Adi!");}
            }

            }
        }


    }
