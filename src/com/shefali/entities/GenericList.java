package com.shefali.entities;

public class GenericList<T> {
    private final T[] t = (T[])new Object[]{};
    private Integer count;

    public void add(T t){
        this.t[count++] = t;
    }

    public T get(Integer count){
        return this.t[count];
    }
}
