package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    /*bu bir adaptasyon sınıfıdır.*/
   @Override
    public void logToSystem(String message) {
       JLoggerManager manager =new JLoggerManager();
       manager.log(message);
/*bu kodlar ile aslında biz dış servislerin JLogger'ını kullanmış oluyoruz */

    }
    /*yazdığımız bu kodlar ile dış ortamdan bir veriyi kendi verilerimize adapte etmiş olduk.*/

}
