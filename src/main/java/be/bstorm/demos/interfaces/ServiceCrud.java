package be.bstorm.demos.interfaces;

import be.bstorm.demos.demoStatic.Movie;

public class ServiceCrud {

    private final Crud crud;

    public ServiceCrud(Crud crud) {
        this.crud = crud;
    }

    public void add(Movie m){
        crud.delete(3);
        crud.create(m);
    }
}
