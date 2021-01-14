package withoutgroup.yeahitsdemo.services;

import com.mongodb.client.result.DeleteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import withoutgroup.yeahitsdemo.model.Cars;
import withoutgroup.yeahitsdemo.repository.CarsRepository;

import java.util.List;

@Service
public class CarsService {
    @Autowired
    CarsRepository carsRepository;
    //create
    public Cars createCar(Cars cars){
        return carsRepository.createNewCar(cars);
    }
    //Get one
    public Cars getOneCar(String carId){
        return carsRepository.getOneCar(carId);
    }
    //get all
    public List<Cars> getAll(){
        return carsRepository.getAllCars();
    }
    //update
    public Cars update(Cars cars){
        return carsRepository.updateCars(cars);
    }
    //delete
    public String deleteCar(Cars cars){
        DeleteResult deleteResult = carsRepository.deleteCar(cars);
        if (deleteResult == null){
            return "there is no any car";
        }

        return "Car successfully deleted";
    }

}
