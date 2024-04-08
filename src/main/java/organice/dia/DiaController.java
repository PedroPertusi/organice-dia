package organice.dia;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "organice-dia")
public interface DiaController {

    // Rota de leitura 
    @GetMapping("/dia/{id_dia}")
    ResponseEntity<DiaOut> read(@RequestHeader(required = true, name = "id_dia") String id_dia);

    // Rota de criação
    @PostMapping("/dia")
    ResponseEntity<DiaOut> create(@RequestBody DiaIn diaIn);

    // Rota de atualização
    @PutMapping("/dia/{id_dia}")
    ResponseEntity<DiaOut> update(@PathVariable("id_dia") String id_dia, @RequestBody DiaIn diaIn);

    // Rota de exclusão
    @DeleteMapping("/dia/{id_dia}")
    ResponseEntity<Void> delete(@PathVariable("id_dia") String id_dia);
} 
