package com.sgp.util;

public class Validacoes {

    // Validação de Nome e Raça (não nulo, não vazio e sem números)
    public static boolean textoValido(String texto) {
        return !(texto == null || 
                 texto.trim().isEmpty() || 
                 texto.matches(".*\\d+.*"));
    }

    public static String mensagemErroTexto(String campo, String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "Erro: O campo " + campo + " não pode estar vazio.";
        } else if (valor.matches(".*\\d+.*")) {
            return "Erro: O campo " + campo + " não pode conter números.";
        }
        return "";
    }

    // Validação de Idade (Cachorros geralmente vivem entre 0 e 30 anos)
    public static boolean idadeValida(int idade) {
        return (idade >= 0 && idade <= 30);
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa.";
        } else if (idade > 30) {
            return "Erro: Idade inválida (máximo 30 anos).";
        }
        return "";
    }
}

