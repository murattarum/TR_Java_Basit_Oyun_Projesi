
package basit_oyun;

public class Dialog {
    
    Karakter krk = new Karakter();
    Diger diger = new Diger();
    
    void giris(String c, String i) throws InterruptedException{
        System.out.println("Uzak bir diyarda ailesi ile birlikte küçük bir çiftlik evinde yaşayan genç bir "+c+" vardı.");
        diger.iyiuykular(1000);
        System.out.println("Günlerini tarlada ailesine destek olmak için geçirirdi.\n"
                + "Bir gün...");
        diger.iyiuykular(1000);
        System.out.println("Dağın tekrardan karanlığa büründüğü görüldü. Karanlık güç ebedi uykusundan uyanmıştı.");
        diger.iyiuykular(1000);
        System.out.println("Kötü haber hiç gecikmeden "+i+" ve ailesine ulaşmıştı. Karanlığın ordusu goblinler köylerine saldırmak için üzerlerine doğru ilerliyorlardı."
                + "Sadece 1 saatleri kalmıştı.");
        diger.iyiuykular(1000);
        System.out.println(i+"'ın ailesi yaşlı oldukları için hareket kabiliyetleri yavaştı. Annesi Ayşe ve babası Rıza kendilerinden fedakarlık edip, bizi bırak "+c+"'ım.");
        diger.iyiuykular(1000);
        System.out.println("Babası zor günler için biriktirdiği altın kesesini "+i+"'e uzattı");
        diger.iyiuykular(1000);
        System.out.println(i+" göz yaşlarına hakim olamadı, hüngür hüngür ağlamaya başladı. "
                + "Olmaz, olamaz gidemem sizi bırakamam yapamam diye bağırmaya başladı.");
        diger.iyiuykular(1000);
        System.out.println("İşte tam o anda goblinler gözükmeye başladı. Babası "+i+"'i itti ve tırpanını alıp zaman kazanmaya çalıştı.\n"
                + "En azından deneyecekti, çünkü goblinler insanlara oranda daha güçlüydü.");          
        System.out.println("Babası goblinle karşı karşıya geldi lakin goblin tek hamlesiyle elindeki kılıcı yaşlı Rıza'nın göğüsüne sapladı.\n"+"Yaşlı Rıza oracıkta can vermişti.");
        diger.iyiuykular(1000);
        System.out.println("Annesi mağaraya koş diye bağırırken bir anda sırtından giren mızrak darbesiyle yere serildi.");
        diger.iyiuykular(1000);
        System.out.println(i+" hüngür hüngür ağlıyarak mağaraya doğru koştu.\n\n");
    }
    
    void magara1(String c) throws InterruptedException{
        System.out.println("Çiftlikte ki goblinlerden kaçan " + c +", bir mağaraya sığınır lakin başına geleceklerden bir habersizdir.");
        diger.iyiuykular(1000);
        System.out.println("Mağaranın karanlığında ilerlemeye devam ederken aniden karşısına bir alt sınıf goblin çıkar.");
        System.out.println("!!! Alt sınıf goblinler ırklarının en güçsüzleridir ve boylarıda küçüktür.");
        diger.iyiuykular(1000);
        System.out.println("Ne yapması gerektiğini düşünür, ya kaçacaktı ya da savaşacaktı.");
        diger.iyiuykular(500);
        System.out.println("Saldırmak için 1'e, kaçmak için 2'ye bas.");
    }
    
}
