package birding.observation.entity.temp;

import birding.observation.entity.Observation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @Column(name = "id", insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id number in 'observation' table",
            example = "1")
    private Integer id;

    @Column(name = "place_name", nullable = false)
    @Schema(description = "Название местности",
            example = "Hrodna")
    private String placeName;

    @OneToOne(optional = false, mappedBy = "place")
    private Observation observation;

    public Place() {
    }

    public Place(Integer id, String placeName, Observation observation) {
        this.id = id;
        this.placeName = placeName;
        this.observation = observation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }
}