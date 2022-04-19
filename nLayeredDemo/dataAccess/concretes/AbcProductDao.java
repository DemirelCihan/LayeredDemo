package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {
    /*sisteme Hibernate yerine yeni bir çalışma sistemi eklendi ve artık
    * bu sistem ile çalışılmak isteniliyor.SOLID prensiblerine göre sisteme yeni bir kod eklendiği
    * zaman yazılı olan hiçbir kod bloklarında değişiklik yapılmadan sisteme entegre olmalıdır.
    * AbcProductDao sınıfı oluşturuldu ve sistemden herhangi bir eksiltme veya farklı sınıflardan düzeltme yapılmadan
    * yeni ekleme işlemi tamamlandı*/
    @Override
    public void add(Product product) {
        System.out.println("Abc ile eklendi\t" +product.getName());
    }

    @Override
    public void upload(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
