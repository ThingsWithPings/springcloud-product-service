package things.with.pings.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import things.with.pings.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
}
