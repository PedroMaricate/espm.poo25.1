package espm.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Accessors(fluent = true)
public class Data {

    private Long id;               // BIGSERIAL
    private Long registroId;       // BIGINT
    private String sensor;         // TEXT
    private LocalDateTime data;    // TIMESTAMP
    private Short idSensor;        // SMALLINT
    private Integer delta;         // INTEGER
    private Short bateria;         // SMALLINT
    private Short ocupado;         // SMALLINT - pode ser null
    private Float h2s;             // REAL - pode ser null
    private Float umidade;         // REAL - pode ser null
    private Float nh3;             // REAL - pode ser null
    private Float temperatura;     // REAL - pode ser null
}
