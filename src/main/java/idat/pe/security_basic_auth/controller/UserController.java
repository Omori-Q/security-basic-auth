package idat.pe.security_basic_auth.controller;

import idat.pe.security_basic_auth.model.User;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/Home")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("!Bienvenido, Estas Autenticado¡ Si eres admin podras ver la lista de Usarios con /list/users");
    }
    @GetMapping("/list/users")
    public User getAllUsers(){
        return new User(1l,"carlos","12345","ADMIN");
    }



}
