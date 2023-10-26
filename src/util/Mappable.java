package util;

public interface Mappable<T, E> {
    T input(E e);
    E output(T t);
}