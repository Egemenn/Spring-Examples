package com.haydikodlayalim.dto;

import lombok.Data;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class KisiDto {

    private long id;
    @NotNull
    private String ad;
    private String soyad;
    private List<String> adresleri;
}
