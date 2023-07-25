package be.bstorm.demos.interfaces;

import be.bstorm.demos.demoStatic.Movie;

public interface CrudFille extends Crud{

    Movie getByTitle(String title);
}
