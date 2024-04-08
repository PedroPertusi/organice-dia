package organice.dia;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record DiaIn (
    Date dia, 
    String descricao

) {
    
}
