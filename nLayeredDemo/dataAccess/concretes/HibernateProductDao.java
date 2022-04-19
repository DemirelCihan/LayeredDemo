package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;
//bu import ile parametrede belirtilen koleksiyona ait ögeler içeren bir
//liste oluşturur.Ögeler iterator'un belirlediği sıra ile dizilidirler.

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi\t" +product.getName());

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
    //veri tabanı ile iletişim kurulan katman

}
