package br.com.leandrorodrigues.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("user already exists!");
    }
}
