package com.uisrael.TareaSemanaIII_OneToMany.repositories;

import com.uisrael.TareaSemanaIII_OneToMany.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
