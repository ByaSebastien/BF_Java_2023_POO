package be.bstorm.demos.genericite;

import be.bstorm.demos.basicClass.Person;
import be.bstorm.demos.constructeursRecap.models.Animal;
import be.bstorm.demos.demoStatic.Movie;
import be.bstorm.demos.enums.Book;

public interface BaseRepository<TEntity, TId> {


    void add(TEntity entity);

    TEntity get(TId id);
}
