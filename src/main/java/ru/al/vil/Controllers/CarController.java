package ru.al.vil.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.al.vil.Interfaces.CarInterface;

@RestController
@RequestMapping("/a")

public class CarController  {

    @Autowired
    CarInterface carInterface;

    @GetMapping
    Integer car(){
        return carInterface.cet(10,4);
    }

//    qrwegrhfgn
    //trtghj




    @PutMapping
    String car2(){
        return carInterface.put("Cаня","Вилькель");

    }


    @PostMapping
    Integer car3(){
        return carInterface.post(5,7);

    }

    @DeleteMapping
    String car4(){
        return carInterface.del();
    }



}
