package com.example.chargingcontrol;

public class loginUsuario {
    String email;
    String senha;
    String telefone;


    loginUsuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    loginUsuario(String telefone){
        this.telefone = telefone;
    }

    void verificarUsuario(){

    }
}
