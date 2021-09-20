package br.com.tech4me.provamusica.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4me.provamusica.model.Musica;
import br.com.tech4me.provamusica.service.MusicaService;
import br.com.tech4me.provamusica.shared.MusicaDTO;

@RestController
@RequestMapping ("/api/tech4music")
public class MusicaController {
    @Autowired
    private MusicaService servico;
//------------------------------------------------------------------------------------------------//
    @GetMapping
    public ResponseEntity<List<MusicaDTO>> listagem(){
        return new ResponseEntity<>(servico.listar(), HttpStatus.OK);
    }  
//------------------------------------------------------------------------------------------------//
    @PostMapping
    public ResponseEntity<MusicaDTO> registrarMusica(@RequestBody Musica musica){
        return new ResponseEntity<>(servico.cadastrar(musica), HttpStatus.CREATED);
    }
//------------------------------------------------------------------------------------------------//

}
