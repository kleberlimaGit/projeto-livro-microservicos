package com.curso.livro.springmicroservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.livro.springmicroservices.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
