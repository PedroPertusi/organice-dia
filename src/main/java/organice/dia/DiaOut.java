package organice.dia;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record DiaOut (
    Date dia, 
    Date data_criacao,
    String dia_da_semana,
    List<Lembrete> lembretes,
    String descricao
) {
    
}
