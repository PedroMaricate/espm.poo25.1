package espm.data;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Table(name = "data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(fluent = true)
public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registro_id", nullable = false)
    private Long registroId;

    @Column(nullable = false)
    private String sensor;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(name = "id_sensor", nullable = false)
    private Short idSensor;

    @Column(nullable = false)
    private Integer delta;

    @Column(nullable = false)
    private Short bateria;

    @Column
    private Short ocupado;

    @Column
    private Float h2s;

    @Column
    private Float umidade;

    @Column
    private Float nh3;

    @Column
    private Float temperatura;

    // Construtor a partir do domínio
    public DataModel(Data d) {
        this.id = d.id();
        this.registroId = d.registroId();
        this.sensor = d.sensor();
        this.data = d.data();
        this.idSensor = d.idSensor();
        this.delta = d.delta();
        this.bateria = d.bateria();
        this.ocupado = d.ocupado();
        this.h2s = d.h2s();
        this.umidade = d.umidade();
        this.nh3 = d.nh3();
        this.temperatura = d.temperatura();
    }

    // Conversão de volta para o domínio
    public Data to() {
        return Data.builder()
            .id(id)
            .registroId(registroId)
            .sensor(sensor)
            .data(data)
            .idSensor(idSensor)
            .delta(delta)
            .bateria(bateria)
            .ocupado(ocupado)
            .h2s(h2s)
            .umidade(umidade)
            .nh3(nh3)
            .temperatura(temperatura)
            .build();
    }
}
