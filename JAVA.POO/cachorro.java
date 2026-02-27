package com.sgp.modelos;  // Declaração do pacote

public class Cachorro {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Cachorro
    private String raca;  // Atributo privado, acessível somente dentro da classe Cachorro
    private int idade;    // Atributo privado, acessível somente dentro da classe Cachorro

    // Construtor que recebe nome, raça e idade como parâmetros
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Construtor sobrecarregado que não recebe parâmetros
    // Inicializa com valores padrão: nome="Rex", raca="Vira-lata" e idade=1
    public Cachorro() {
        this.nome = "Rex";
        this.raca = "Vira-lata";
        this.idade = 1;
    }

    // Método que exibe uma mensagem com as informações do cachorro
    public void apresentar() {
        System.out.println("Este é o cachorro " + nome + 
                           ", da raça " + raca + 
                           ", com " + idade + " ano(s) de idade.");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome do cachorro
    public String getNome() {
        return nome;
    }

    // Retorna a raça do cachorro
    public String getRaca() {
        return raca;
    }

    // Retorna a idade do cachorro
    public int getIdade() {
        return idade;
    }

    // Define um novo nome para o cachorro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova raça para o cachorro
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Define uma nova idade para o cachorro
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
    }
}