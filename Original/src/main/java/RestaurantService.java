import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    public Restaurant restaurant;
    restaurantNotFoundException restaurantNotFoundException = new restaurantNotFoundException("This restaurant is currently not available");

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        if(restaurantName.equals("Krishna's Bakery"))
            return restaurant;
        else
            throw restaurantNotFoundException;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
