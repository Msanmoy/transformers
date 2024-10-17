package org.iesvdm.transformer;

public interface MultipleJoiner<T, U, R>{
    public R apply(T obj1,U obj2);
}
