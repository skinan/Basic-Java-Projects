package foodshops;

import java.util.HashMap;
import java.util.Map;


public class FoodsPriceList {
    public static int FoodMenu(FoodNames foodNames){

        Map<FoodNames, Integer> foodList = new HashMap<FoodNames, Integer>();

        foodList.put(FoodNames.Burger, 50);
        foodList.put(FoodNames.Sandwich, 100);
        foodList.put(FoodNames.Pizza, 250);
        foodList.put(FoodNames.ChickenFry, 60);
        foodList.put(FoodNames.FishFinger, 100);
        foodList.put(FoodNames.SubSandwich, 75);
        foodList.put(FoodNames.Doughnuts, 85);
        foodList.put(FoodNames.BeefBiriyani, 150);
        foodList.put(FoodNames.ChickenBiriyani, 120);
        foodList.put(FoodNames.ChickenChili, 75);
        foodList.put(FoodNames.ChickenFriedRice, 145);
        foodList.put(FoodNames.ChickenSoup, 110);
        foodList.put(FoodNames.ThaiSoup, 80);
        foodList.put(FoodNames.PrawnFries, 220);
        foodList.put(FoodNames.EggFriedRice, 95);
        foodList.put(FoodNames.HyderabadiBiryani,180);
        foodList.put(FoodNames.KashmiriPulao, 200);
        return foodList.get(foodNames);



    }
}
