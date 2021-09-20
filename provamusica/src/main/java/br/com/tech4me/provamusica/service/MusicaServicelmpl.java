package br.com.tech4me.provamusica.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tech4me.provamusica.model.Musica;
import br.com.tech4me.provamusica.repository.MusicaRepository;
import br.com.tech4me.provamusica.shared.MusicaDTO;

@Service
public class MusicaServicelmpl implements MusicaService {
    @Autowired
    private MusicaRepository repositorio;
    @Override
    public MusicaDTO cadastrar(Musica musica) {
        repositorio.save(musica);
        
        return new ModelMapper().map(musica, MusicaDTO.class);
    }
    @Override
    public List<MusicaDTO> listar() {
        List<Musica> music = repositorio.findAll();
        return music.stream()
        .map(m -> new ModelMapper().map(m, MusicaDTO.class))
        .collect(Collectors.toList());
    }
}
