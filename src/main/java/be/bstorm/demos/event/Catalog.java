package be.bstorm.demos.event;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<NotifyNewCarSubscriber<Car>> myEvent;
    private List<Car> cars;


    public Catalog(){
        cars = new ArrayList<>();
        myEvent = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        cars.add(car);
        raiseMyEvent(car);
    }

    public void addSubscriber(NotifyNewCarSubscriber<Car> subscriber){

        myEvent.add(subscriber);
    }

    public void raiseMyEvent(Car car){

        for(NotifyNewCarSubscriber<Car> method : myEvent){

            method.execute(car);
        }
    }
}
