package com.zaloni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zaloni.entity.ToDo;

@Repository
public interface ToDoDao extends JpaRepository<ToDo, Integer> {

}
