package birding.observation.entity;


import birding.observation.entity.temp.Place;
import birding.observation.entity.temp.Species;
import birding.observation.entity.temp.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "observation")
public class Observation {

    @Id
    @Column(name = "id", insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id number in 'observation' table",
            example = "1")
    private Integer id;

    @Column(name = "date", nullable = false)
    @Schema(description = "date of observation",
            example = "2023-08-14")
    private Date date;

    @Column(name = "quantity", nullable = false)
    @Schema(description = "number of birds",
            example = "5")
    private int quantity;

    @Column(name = "description")
    @Schema(description = "description of the observation",
            example = "A couple on the nest site")
    private String description;

    @OneToOne(optional = false)
    @JoinColumn(name = "place_id", nullable = false)
    @Schema(description = "ID of table 'place'", example = "3")
    private Place place;

    @OneToOne(optional = true)
    @JoinColumn(name = "nest_id")
    @Schema(description = "ID of table 'nest'", example = "1")
    private Nest nest;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @Schema(description = "ID of table 'user'", example = "2")
    private User user;

    @OneToOne(optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    @Schema(description = "ID of table 'species'", example = "2")
    private Species species;

    @Column(name = "created_at")
    @Schema(description = "Date and time of the record was created",
            example = "2022-10-03 10:20:11.114")
    private Timestamp createdAt;

    @Column(name = "modified_at")
    @Schema(description = "Date and time of the record was created",
            example = "2022-10-03 10:20:11.114")
    private Timestamp modifiedAt;

    public Observation(){}

    public Observation(Integer id, Date date, int quantity, String description,
                       Place place, Nest nest, User user, Species species,
                       Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.date = date;
        this.quantity = quantity;
        this.description = description;
        this.place = place;
        this.nest = nest;
        this.user = user;
        this.species = species;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Nest getNest() {
        return nest;
    }

    public void setNest(Nest nest) {
        this.nest = nest;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
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
        return "Observation{" +
                "id=" + id +
                ", date=" + date +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", place=" + place +
                ", nest=" + nest +
                ", user=" + user +
                ", species=" + species +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}