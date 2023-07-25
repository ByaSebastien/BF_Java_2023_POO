package be.bstorm.demos.interfaces;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Crud crud = new CsvCrudImpl();
        CrudFille crudFille = new CsvCrudImpl();

        crud.delete(3);
        crudFille.readAll();
    }
}
