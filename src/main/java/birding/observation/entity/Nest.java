package birding.observation.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "nest")
public class Nest {
    @Id
    @Column(name = "id", insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id number in 'observation' nest",
            example = "1")
    private Integer id;

    @Column
    @Schema(name = "eggs_quantity", example = "4")
    private int eggsQuantity;

    @Column
    @Schema(name = "chicks_quantity", example = "4")
    private int chicksNumber;

    @Column(name = "description")
    @Schema(description = "description of the nest",
            example = "A nest on the ground near tree")
    private String description;

    @OneToOne(optional = false)
    @JoinColumn(name = "biotope_id")
    @Schema(description = "ID of table 'biotope'",
            example = "?")
    private Biotope biotope;

    @Column(name = "created_at")
    @Schema(description = "Date and time of the record was created",
            example = "2022-10-03 10:20:11.114")
    private Timestamp createdAt;

    @Column(name = "modified_at")
    @Schema(description = "Date and time of the record was created",
            example = "2022-10-03 10:20:11.114")
    private Timestamp modifiedAt;


    public Nest(){}

    public Nest(Integer id, int eggsQuantity, int chicksNumber, String description, Biotope biotope, Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.eggsQuantity = eggsQuantity;
        this.chicksNumber = chicksNumber;
        this.description = description;
        this.biotope = biotope;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEggsQuantity() {
        return eggsQuantity;
    }

    public void setEggsQuantity(int eggsQuantity) {
        this.eggsQuantity = eggsQuantity;
    }

    public int getChicksNumber() {
        return chicksNumber;
    }

    public void setChicksNumber(int chicksNumber) {
        this.chicksNumber = chicksNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Biotope getBiotope() {
        return biotope;
    }

    public void setBiotope(Biotope biotope) {
        this.biotope = biotope;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Nest{" +
                "id=" + id +
                ", eggsQuantity=" + eggsQuantity +
                ", chicksNumber=" + chicksNumber +
                ", description='" + description + '\'' +
                ", biotope=" + biotope +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
