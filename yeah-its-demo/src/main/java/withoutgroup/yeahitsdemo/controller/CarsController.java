package withoutgroup.yeahitsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import withoutgroup.yeahitsdemo.model.Cars;
import withoutgroup.yeahitsdemo.services.CarsService;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    CarsService carsService;
    //add or create
    @PostMapping(value = "/addCar")
    public Cars createNewCar(@RequestBody Cars cars){
        return carsService.createCar(cars);
    }
    //get one
    @GetMapping(value = "/getone/{id}")
    public Cars getOneCar(@PathVariable String carId){
        return carsService.getOneCar(carId);
    }
    //get all
    @GetMapping("/getAll")
    public List<Cars> getAll(){
        return carsService.getAll();
    }

    //update
    @PutMapping("/update")
    public Cars update(@RequestBody Cars cars){
        return  carsService.update(cars);
    }

    //delete
    @DeleteMapping("/deletthecar")
    public String deleteTheCar(@RequestBody Cars cars){
        return  carsService.deleteCar(cars);

    }

}
