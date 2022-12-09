package com.xd.ProjetoGraphQLArquitetura.Controller;

import com.xd.ProjetoGraphQLArquitetura.Domain.Evento;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EventoController {

    @QueryMapping
    public Evento eventoById(@Argument String id) {
        return Evento.getById(id);
    }


}
