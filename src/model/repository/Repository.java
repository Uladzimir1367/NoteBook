package model.repository;



public interface Repository<T> {
    void create(T t);
    T read(long id);
    void update(long id, T t);
    boolean delete(Long id);

}