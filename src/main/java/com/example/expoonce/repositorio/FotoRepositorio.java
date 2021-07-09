/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.expoonce.repositorio;

import com.example.expoonce.modelo.Foto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author soporte
 */
public interface FotoRepositorio extends CrudRepository<Foto, Integer>{
    

   /* @Override
    public Iterable<Foto> findAll();
   */  
}
