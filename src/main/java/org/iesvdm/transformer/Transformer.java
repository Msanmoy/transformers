package org.iesvdm.transformer;

//This interface defines a simple generic type.
//This method transform a generic type to another type.

public interface Transformer<T>
{
    public T transform(T obj);
}

