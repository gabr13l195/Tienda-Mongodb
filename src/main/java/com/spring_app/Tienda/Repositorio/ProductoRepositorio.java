package com.spring_app.Tienda.Repositorio;


import com.spring_app.Tienda.Entidad.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends MongoRepository<Producto, String> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);


}
