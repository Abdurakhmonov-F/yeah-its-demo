package withoutgroup.yeahitsdemo.repository;

import com.mongodb.client.result.DeleteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import withoutgroup.yeahitsdemo.data.CarsInterFace;
import withoutgroup.yeahitsdemo.model.Cars;

import java.util.List;
@Repository
public class CarsRepository implements CarsInterFace {

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public Cars createNewCar(Cars cars) {
      Cars c =  mongoTemplate.insert(cars, "cars");
        return c;
    }

    @Override
    public Cars getOneCar(String carId) {
        Cars c = mongoTemplate.findById(carId, Cars.class,"cars");
        return c;
    }

    @Override
    public List<Cars> getAllCars() {
       List<Cars> getAll = mongoTemplate.findAll(Cars.class, "cars");
        return getAll;
    }

    @Override
    public Cars updateCars(Cars cars) {
       Cars c = mongoTemplate.save(cars,"cars");
        return c;
    }

    @Override
    public DeleteResult deleteCar(Cars cars) {
        return mongoTemplate.remove(cars);
    }
}
