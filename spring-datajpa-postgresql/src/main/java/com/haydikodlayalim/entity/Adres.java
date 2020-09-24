package com.haydikodlayalim.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "kisi adres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter//id'ler eşitse bu iki nesne aynı nesnedir
@ToString
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(length = 500, name = "adres")
    private String adres;

    @Enumerated
    private AdresTip adresTip;

    @Column(name = "aktif")
    private Boolean aktif;
    enum AdresTip {
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }

}
