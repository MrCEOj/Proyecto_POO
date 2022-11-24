package main.options;

public class Persona {
    public String nome;
    public int edad;
    public double altura;
    
    public Persona(String nome, int edad, double altura){
        this.nome = nome;
        this.edad = edad;
        this.altura = altura;
    }
    
    public String getnom(){
        return this.nome;
    }
    
    public int getage(){
        return this.edad;
    }
    
    public double geth(){
        return this.altura;
    }
}
