package com.example.chargingcontrol;

public class loginUsuario {
    String email;
    String senha;
    String telefone;
    String[] motoristas = {"Cleilton", "Ubiratan", "Edson"};


    loginUsuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    loginUsuario(String telefone){
        this.telefone = telefone;
    }

    /*void verificarUsuario(){
        if (){
            System.out.println("Seja Bem Vindo");
        }else {
            System.out.println("Nao cadastrado no banco de dados");
        }
    }*/
}
