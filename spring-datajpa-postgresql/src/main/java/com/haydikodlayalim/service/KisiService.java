package com.haydikodlayalim.service;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Kisi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);

    void delete(Long id);

    KisiDto getAll(KisiDto kisDto);

    Page<Kisi> getAll(Pageable pageable);
}
