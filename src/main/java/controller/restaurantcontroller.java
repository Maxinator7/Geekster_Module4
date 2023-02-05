package controller;

import jakarta.annotation.Nullable;
import model.Restaurantmodel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurants")
public class restaurantcontroller {

  @GetMapping("/restaurant")
   public Restaurantmodel getrestaurant(@Nullable @RequestParam("id") String id,
                                        @Nullable @RequestParam("name") String name,
                                        @Nullable @RequestParam("type") String type){
      Restaurantmodel obj = new Restaurantmodel() ;

      if(null != id){

          obj.setRestaurantid(Integer.parseInt(id));
      }else {
          obj.setRestaurantid(1);
      }
       obj.setAddress("Calangute,Goa");
      obj.setContactno("798754654");
      obj.setType("Veg & NonVeg");
       return obj;

   }


   @PostMapping("/restaurant")
  public String addrestaurant(@RequestBody Restaurantmodel obj){


      return "added" ;
    }
}
