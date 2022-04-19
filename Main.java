import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
/*bu class sadece test ortamıdır*/
        //BİR PROJEDE ENTITY'LER HARİÇ BİR 'new'lenme varsa ileride bir problem oluşacaktır.
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,1,"elma",12,50);
        productService.add(product);
    }
}
