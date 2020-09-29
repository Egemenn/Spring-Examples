package com.haydikodlayalim.dto;

import lombok.Data;

import java.util.List;

@Data
public class KisiDto {

    private long id;
    private String ad;
    private String soyad;
    private List<String> adresleri;
}
