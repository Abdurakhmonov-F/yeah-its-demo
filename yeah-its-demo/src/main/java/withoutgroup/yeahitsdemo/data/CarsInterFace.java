package withoutgroup.yeahitsdemo.data;

import com.mongodb.client.result.DeleteResult;
import withoutgroup.yeahitsdemo.model.Cars;

import java.util.List;

public interface CarsInterFace {
    //create
    Cars createNewCar(Cars cars);
    //Get
    Cars getOneCar(String carId);

    List<Cars> getAllCars();
    //update
    Cars updateCars(Cars cars);
    DeleteResult deleteCar(Cars cars);
}
