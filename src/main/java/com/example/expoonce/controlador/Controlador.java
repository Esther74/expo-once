/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.expoonce.controlador;

import com.example.expoonce.modelo.Foto;
import com.example.expoonce.repositorio.FotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author soporte
 */

@Controller
@RequestMapping(path="/fotos")

public class Controlador {
    
    @Autowired
    private FotoRepositorio fotoRepositorio;
   
    @PostMapping(path="add")
    public @ResponseBody String addNewFoto(@RequestParam String nombre, @RequestParam String ruta){
        Foto foto = new Foto();
        foto.setNombre(nombre);
        foto.setRuta(ruta);
        fotoRepositorio.save(foto);
        return "Se guardo la foto";
    }
    
    //http://localhost:8080/fotos/add
    //curl localhost:8080/fotos/add -d nombre=arbol -d ruta=rutaarbol
    //post http://localhost:8080/fotos/add?nombre=arbol&ruta=ruta de arbol
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Foto> getAllFotos(){
        // This returns a JSON or XML with the users
        return fotoRepositorio.findAll();
        //get http://localhost:8080/fotos/all
        
        //[{"id":1,"nombre":"arbol","ruta":"ruta de arbol"}]
    }
    
}
