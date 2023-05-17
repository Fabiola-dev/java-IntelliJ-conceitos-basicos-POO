package Entidades;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pessoa;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public void compararIdades() {
        if (this.idade < 18) {
            System.out.println(this.nome + " é menor de idade");
        } else {
            System.out.println(this.nome + " é maior de idade");
        }
    }

    public void verificarMaiorIdade(ArrayList<Pessoa> pessoa) {
        if (this.idade < 18) {
            System.out.println(this.nome + " é menor de idade");
        } else {
            System.out.println(this.nome + " é maior de idade");
        }
    }

}
