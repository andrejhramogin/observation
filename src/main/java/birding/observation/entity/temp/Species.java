package birding.observation.entity.temp;

import birding.observation.entity.Observation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "species")
public class Species {
    @Id
    @Column(name = "id", insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id number in 'observation' user",
            example = "1")
    private Integer id;

    @Column(name = "species_name", nullable = false)
    @Schema(description = "Name of the bird species",
            example = "Golden eagle")
    private String speciesName;

    @OneToOne(optional = false, mappedBy = "species")
    private Observation observation;
}
