package br.com.tech4me.tech4pizzaria.shared;

import java.util.List;

import br.com.tech4me.tech4pizzaria.model.Tamanho;

public record PizzaCompletoDto (String id,
    String sabor,
    List<String> ingredientes,
    Tamanho tamanho,
    Double valor) {
    
}
