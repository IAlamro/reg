package com.tunedapps.reg.repository;

import com.tunedapps.reg.entites.EntityBase;

import java.util.List;

public interface Repository<T, R extends EntityBase> {

    R findById(T t);
    List<R> findAll();
    void delete(T t);
    R update(T t, R r);
    T create(R r);
    void setIdGenerator(IdGenerator<T> idGenerator);
}
