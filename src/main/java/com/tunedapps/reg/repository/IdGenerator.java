package com.tunedapps.reg.repository;

public interface IdGenerator<T> {

    T generateNewId();
}
