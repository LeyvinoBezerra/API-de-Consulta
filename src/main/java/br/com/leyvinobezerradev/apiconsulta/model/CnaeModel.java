package br.com.leyvinobezerradev.apiconsulta.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CnaeModel implements Serializable {

    private Long codigo;
    private String descricao;
}
