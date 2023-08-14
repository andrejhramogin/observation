package birding.observation.entity.temp;

import birding.observation.entity.Observation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id number in 'observation' user",
            example = "1")
    private Integer id;

    @Column(name = "type", nullable = false)
    @Schema(description = "Type of user",
            example = "admin")
    private String userType;

    @OneToOne(optional = false, mappedBy = "user")
    private Observation observation;
}
