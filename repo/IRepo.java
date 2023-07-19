package repo;

import java.util.List;

public interface IRepo <T> {

    List <T> getAll();
    T getById(int id);
    int create(T item);
    int update(T item);
    void delete (int item);
}
