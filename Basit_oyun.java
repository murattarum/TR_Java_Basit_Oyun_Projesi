
package basit_oyun;

import java.util.Scanner;
import java.util.Random;

public class Basit_oyun {

    public static void main(String[] args) throws InterruptedException{
        
        Karakter krk = new Karakter();
        Envanter envanter = new Envanter();
        Diger diger = new Diger();
        Dialog dialog = new Dialog();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        
        boolean dogru = true;
        int secenek;
        int wsayac = 2;
        int a;
        
        krk.kuvvet = 5;
        krk.level = 1;
        krk.tecrübe = 0;
        
        System.out.println("Hoşgeldiniz, lütfen karakter bilgilerini giriniz.");
        System.out.println("Karakter ismini giriniz.");
        String krkisim = scan.nextLine();
        krk.isim = krkisim;
        System.out.println("Karakter cinsiyetini seçiniz, 1 = Erkek, 2 = Kız");
        secenek = scan.nextInt();
        if(secenek == 1)
          krk.cinsiyet = "oglan";
        if(secenek == 2)
          krk.cinsiyet = "kız";  
        
        dialog.giris(krk.cinsiyet,krk.isim);
        diger.iyiuykular(1000);
        System.out.println("Hikayeniz başlıyor...\nDevam etmek için 1 sayısını giriniz.");
        secenek = scan.nextInt();
        
        if(secenek != 1){
            krk.can -=5;
            System.out.println("Yanlış sayı, bu durum can değerinizi düşürecek :> can miktari,"+krk.can+"\n");
        }
        diger.iyiuykular(1000);
        
        // Saldır veya kaç
        
        dialog.magara1(krk.isim);
        
        while(wsayac >= 0){
            secenek = scan.nextInt();
            if(secenek == 1){
                krk.saldır("altGoblin");
                break;
            }
            if(secenek == 2){
                System.out.println("Tebrikler kaçmayı başardın.");
                break;
            }
            else{
                System.out.println("Lütfen belirtilen seçenekler doğrultusunda seçiminizi yapınız.");
                wsayac--;
            }
            if(wsayac == 0){
                a = random.nextInt(2);
                if(a == 1){
                    krk.saldır("altGoblinsadas");
                }
                else{
                    System.out.println("Tebrikler kaçmayı başardın.");
                }
                
            }
        }
         
        System.out.println("Dinlenmek için 1'e, yola devam etmek için 2'e basınız.");
 
        while(wsayac >= 0){

            secenek = scan.nextInt();

            if(secenek == 1){
                krk.dinlen();
                System.out.println("Bir kayanın dibine oturmuş midenin sesini dinlerken elini çantana atıyorsun, yemek: "+envanter.yemek);
                diger.iyiuykular(1000);
                System.out.println("Yemek ye: 1, yola devam et: herhangi bir tuş");
                secenek = scan.nextInt();
                if(secenek == 1)
                    envanter.yemekyeme(krk.can,krk.maxcan);
                    System.out.println("Kalan yemek miktarı, " + envanter.yemek);
                break;
            }
                
            else if(secenek == 2){
                krk.can -= 5;
                System.out.println("Yorgunluktan geberiyorsun, can= "+krk.can);
                break;
            }
            
            if(wsayac ==0)
                dogru=false;
            
            if(!dogru){
                
                a = random.nextInt(1);
                if(a == 1){
                    krk.dinlen();
                    break;
                }
                    
                else{
                    krk.can -= 5;
                    System.out.println("Yorgunluktan geberiyorsun, can= "+krk.can);
                    break;
                }
            }
            System.out.println("Geçersiz seçenek!!");
            wsayac--;
        }
        
    }
    
}
