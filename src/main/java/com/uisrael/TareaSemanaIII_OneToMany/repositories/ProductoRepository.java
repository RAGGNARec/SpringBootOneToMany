package com.uisrael.TareaSemanaIII_OneToMany.repositories;

import com.uisrael.TareaSemanaIII_OneToMany.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
