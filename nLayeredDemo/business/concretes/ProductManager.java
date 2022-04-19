package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
   private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService =loggerService;
    }//bu şekilde yazdığımızda hiçbir zaman Hibernate e bağımlı kalmamış olacağız
    //Hibernate'in referansını tutup veya onun yerine herhangi bir paketi de enjekte edilebilir.

    @Override
    public void add(Product product) {
        //iş kodları yazılır.
        if(product.getCategoryId() == 2){
            System.out.println("bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);//bu komut ile hiçbir şekilde Hibernate'e bağımlılığımız yok.
       this.loggerService.logToSystem("Ürün Eklendi" +product.getName());
        /*HibernateProductDao dao = new HibernateProductDao();
        dao.add(product); eğer bu kod yazılırsa kod çalışır yalnız alternatif bir sistem
        dahil edilemez olur.*/
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
