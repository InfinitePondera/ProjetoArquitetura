package com.xd.ProjetoGraphQLArquitetura.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Evento {
    private String id;
    private String nome;
    private String detalhes;

    private static List<Evento> eventos = Arrays.asList(
            new Evento("event1", "Festa de aniversário", "Festa de aniversário para comemorar 521 anos de vida do nosso fundador Sheik Jalim Habbei"),
            new Evento("event2", "JIA", "Festa orientada a universitários realizada em Londrina, com shows e outras atrações"),
            new Evento("event3", "Show de Rock", "Show da banda Soundgarden a ser realizada na Pedreira Paulo Leminski em Curitiba/PR")
    );

    public static Evento getById(String id) {
        return eventos.stream().filter(evento -> evento.getId().equals(id)).findFirst().orElse(null);
    };

    public static List<Evento> getAll() {
        return eventos;
    }
}
