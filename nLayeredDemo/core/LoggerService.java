package nLayeredDemo.core;

public interface LoggerService {
    /*bu interface ile başka bir sisteme gereksinim duymadan yeni bir LoggerService interface i tanımlanır*/
    void logToSystem(String message);

}
