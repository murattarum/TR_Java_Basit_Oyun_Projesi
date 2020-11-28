
package basit_oyun;


public class Karakter {
    
    altGoblin altGoblin = new altGoblin();
    Diger diger = new Diger();
    
    int level;
    int tecrübe;
    int can = 50;
    int maxcan = 100;
    int kuvvet;
    String cinsiyet;
    String isim;
    boolean oldumu = false;
    
    void saldır(String a)throws InterruptedException{  
        
        switch(a){
            case "greatGoblin":
                break;
            case "ustGoblin":
                break;
            case "ortaGoblin":
                break;
            case "altGoblin":
                
                System.out.println("Savaşmak üzere olduğun düşmanın can değeri, " + altGoblin.goblinCan);
                diger.iyiuykular(1000);
                
                if(can >= 0){
                    
                    can -= (altGoblin.goblinKuvvet * 4);
                    
                    while(altGoblin.goblinCan > 0){
                        
                        System.out.println(isim + ", saldırıya geçtin.");
                        diger.iyiuykular(1000);
                        altGoblin.goblinCan -= (kuvvet * 4);
                        System.out.println("Düşmanın kalan can değeri, " + altGoblin.goblinCan);
                        diger.iyiuykular(1000);
                        
                        if(altGoblin.goblinCan <= 0)
                        {
                            System.out.println("Düşman öldü.");
                            oldumu = true;
                        }
                        
                        else{
                            System.out.println("Düşman ölmedi tekrar saldırıyorsun.");
                            diger.iyiuykular(1000);
                        }     
                    }
                }
                else{
                    System.out.println("Öldünüz.");
                }
                if(oldumu == true){
                    tecrübe +=500;
                    if(tecrübe == 1000){
                        tecrübe();
                    }
                    can +=5;
                    System.out.println("Kalan can miktarınız= "+can);
                    oldumu = false;
                }
                break;
        }
    }
    
    void tecrübe(){
        level++;
        kuvvet += 5;
        maxcan += 5;
        tecrübe = 0;
        System.out.println("Tebrikler seviyeniz yükseldi, "+level+" kuvvet puanınız arttı, "+kuvvet);
 
    }
    void dinlen(){
        if(can < maxcan){
            can += 15;
            if(can > maxcan)
                    can = 100;
            System.out.println("Dinlendiniz, bu durum sizin can değerinizi yükseltti= "+can);
        }
        
    } 
}


// Düşman karakterleri
// 4 tip belirlendi
// Boss lord of rings alıntısıdır :)

class greatGoblin{
    int goblinKuvvet = 15;
    int goblinCan = 100;
}
class ustGoblin{
    int goblinKuvvet = 10;
    int goblinCan = 45;
}
class ortaGoblin{
    int goblinKuvvet = 5;
    int goblinCan = 35;
}
class altGoblin{
    int goblinKuvvet = 2;
    int goblinCan = 25;
}
