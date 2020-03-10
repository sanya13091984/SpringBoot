package ru.al.vil.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.al.vil.Interfaces.CarInterface;

@RestController
@RequestMapping("/x")

public class CarController {



  @Autowired
  CarInterface carInterface;

  @GetMapping
  String mart(){
      return carInterface.get("любимая ", "с 8 марта ");
  }



    @PutMapping
  Integer car1(){

      return carInterface.put(10,10);

  }@PostMapping
  String car2(){
      return carInterface.post("С праздником","весны жена");

  }@DeleteMapping
  String Car3(){
      return carInterface.del();
  }

}
