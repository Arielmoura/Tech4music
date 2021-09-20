package br.com.tech4me.provamusica.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.com.tech4me.provamusica.model.Musica;
import br.com.tech4me.provamusica.shared.MusicaDTO;

@Service
public interface MusicaService {
    
    MusicaDTO cadastrar(Musica musica);
    List<MusicaDTO> listar();
}
