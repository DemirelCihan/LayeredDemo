package nLayeredDemo.jLogger;

public class JLoggerManager {
    /*bu sınıf bir simülasyon örneğidir.Örnek gereği bu sınıf farklı bir yerde ve bizim projemize
    * dahil değil.Ama biz bu package'i kullanmak istiyoruz.Çözüm yolu için bu sınıfın implement edeceği bir interface
    * yazmamız bizim için doğru bir yol değildir.'new' lemek te aynı şekilde doğru bir yol değildir. */
    public void log(String message){
        System.out.println("J logger ile loglandı");
    }
}
