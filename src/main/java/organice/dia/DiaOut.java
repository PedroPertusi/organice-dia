package organice.dia;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record DiaOut (
    String dia, 
    String data_criacao,
    String dia_da_semana,
    String descricao
) {
    
}
