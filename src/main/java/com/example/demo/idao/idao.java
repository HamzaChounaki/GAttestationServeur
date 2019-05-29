package com.example.demo.idao;

import java.util.List;

public interface idao <T>{

	 void create(T o);
	 void delete(T o);
	 void update(T o);
	 public List<T> findAll();
	 public T findById(int id);
}
