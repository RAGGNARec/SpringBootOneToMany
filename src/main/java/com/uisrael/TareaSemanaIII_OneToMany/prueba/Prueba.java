package com.uisrael.TareaSemanaIII_OneToMany.prueba;

import com.uisrael.TareaSemanaIII_OneToMany.entities.Categoria;
import com.uisrael.TareaSemanaIII_OneToMany.entities.Producto;
import com.uisrael.TareaSemanaIII_OneToMany.repositories.CategoriaRepository;
import com.uisrael.TareaSemanaIII_OneToMany.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Prueba implements CommandLineRunner {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public void run(String... args)throws Exception{
        Categoria categoria = new Categoria();
        categoria.setNombre("Tecnologia");
        //ingresamos el primer producto
        Producto producto1 = new Producto();
        producto1.setNombre("Computadora AMD");
        //ingresamos el segundo producto
        Producto producto2 = new Producto();
        producto2.setNombre("Laptop Azus");
        //onetoMany
        categoria.getProductos().add(producto1);
        categoria.getProductos().add(producto2);
        //Guardamos esas variables de almacenamiento
        categoriaRepository.save(categoria);
        //Imprimir en pantalla
        Optional<Categoria> categoriaGuardado = categoriaRepository.findById(categoria.getId());
        categoriaGuardado.ifPresent(a ->{
            System.out.println("Producto leido por ID" + a.getNombre());
            a.setNombre("Tecnologia");
            categoriaRepository.save(a);
            System.out.println("Autor actualizado" + a.getNombre());
        });
        List<Categoria> categorias = categoriaRepository.findAll();
        System.out.println("Lista de ctaegorias: ");
        for (Categoria a:categorias){
            System.out.println("-"+ a.getNombre());
        }
        //categoriaRepository.delete(categoria);
        //System.out.println("Categoria eliminada");
    }
}
