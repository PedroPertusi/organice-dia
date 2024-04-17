package organice.dia;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record DiaIn (
    String dia, 
    String descricao

) {
    
}
