package withoutgroup.yeahitsdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import withoutgroup.yeahitsdemo.model.Cars;
import withoutgroup.yeahitsdemo.services.CarsService;


import java.util.List;

@RestController
public class CarsController {

   private static final Logger LOGGER = LoggerFactory.getLogger(CarsController.class);

    @Autowired
    CarsService carsService;



    //add or create
    @PostMapping(value = "/addCar")
    public Cars createNewCar(@RequestBody Cars cars){
        LOGGER.info("Car created");
        return carsService.createCar(cars);
    }
    //get one
    @GetMapping(value = "/getOne/{id}")
    public Cars getOneCar(@PathVariable String carId){
        LOGGER.info("get one method accessed");
        return carsService.getOneCar(carId);
    }
    //get all
    @GetMapping("/getAll")
    public List<Cars> getAll(){

LOGGER.info("get all method accessed");
        return carsService.getAll();
    }

    //update
    @PutMapping("/update")
    public Cars update(@RequestBody Cars cars){
        LOGGER.info("The car updated");
        return  carsService.update(cars);
    }

    //delete
    @DeleteMapping("/deletthecar")
    public String deleteTheCar(@RequestBody Cars cars){

    LOGGER.info("The car deleted");
        return  carsService.deleteCar(cars);

    }

}
