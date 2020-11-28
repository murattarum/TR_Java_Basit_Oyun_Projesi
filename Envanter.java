
package basit_oyun;


public class Envanter {
    
    Karakter krk = new Karakter();
    Diger diger = new Diger();
    
    int yemek = 1;
    boolean mesale = false;
    boolean sopa = false;
    boolean kılıc = false;
    boolean yay = false;
    int ok = 0;
    
    void yemekyeme(int c,int m) throws InterruptedException{
 
        if(yemek > 0){
            if(c < m){
                
                c += 10; 
                krk.can = c; 
                
                if(c > m){
                    c = 100;
                }
                System.out.println("Hmm enfes bir turta, can değeriniz arttı: " + c);
                diger.iyiuykular(1000);
            }
            else{
                System.out.println("Canınız dolu, yemek yenildi fakat can miktarınız artmadı.");
                diger.iyiuykular(1000);
            }
            yemek--;
        }
        else{
            System.out.println("Envanterde yemek bulunmuyor.");
            diger.iyiuykular(1000);
        }
        krk.can = c;   
    }
    
    void yerebırak(int b){
        switch(b){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
