import Entidades.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Patrícia", 21);
        pessoas.add(pessoa1);
        Pessoa pessoa2 = new Pessoa("Sérgio", 60);
        pessoas.add(pessoa2);
        Pessoa pessoa3 = new Pessoa("Júlia", 8);
        pessoas.add(pessoa3);

        for (Pessoa pessoa: pessoas) {
            pessoa.verificarMaiorIdade(pessoas);
        }


    }
}