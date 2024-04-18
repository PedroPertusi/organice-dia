package organice.dia;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import organice.lembrete.LembreteDateIn;
import organice.lembrete.LembreteOut;


@FeignClient(name = "organice-dia")
public interface DiaController {

    // Rota de leitura 
    @GetMapping("/dia/{id_dia}")
    ResponseEntity<DiaOut> read(@PathVariable(required = true) String id_dia);

    // Rota de leitura de lembretes
    @PostMapping("/dia/lembretes")
    ResponseEntity<List<LembreteOut>> read_lembretes(
        @RequestHeader(required = true, name = "id-user") String UserId,    
        @RequestBody LembreteDateIn data);

    // Rota de criação
    @PostMapping("/dia")
    ResponseEntity<DiaOut> create(
        @RequestHeader(required = true, name = "id-user") String idUser,      
        @RequestBody DiaIn diaIn);

    // Rota de atualização
    @PutMapping("/dia/{id_dia}")
    ResponseEntity<DiaOut> update(@PathVariable(required = true) String id_dia, @RequestBody DiaIn diaIn);

    // Rota de exclusão
    @DeleteMapping("/dia/{id_dia}")
    ResponseEntity<Void> delete(@PathVariable(required = true) String id_dia);


} 
