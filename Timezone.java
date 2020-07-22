package com.latam.moss.domain;

import lombok.Data;
import java.util.Date;

@Data
public class TimeZoneDto {

    private Long id;
    private String cddsCdgIata;
    private Date dfhrFchInicio;
    private Date dfhrFchHraInicio;
    private Date dfhrFchHraInicioGmt;
    private Date dfhrFchTermino;
    private Date dfhrFchHraTermino;
    private Date dfhrFchHraTerminoGmt;
    private int dfhrHra;
    private int dfhrMinutos;

}