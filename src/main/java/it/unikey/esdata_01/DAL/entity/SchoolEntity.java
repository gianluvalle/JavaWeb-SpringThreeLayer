package it.unikey.esdata_01.DAL.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity(name = "Schools")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotNull
    private String fieldOfStudy;

    @Column(nullable = false)
    @NotNull
    private String name;

    @Column(nullable = false)
    @NotNull
    private String address;

    @Column(nullable = false)
    @NotNull
    private String city;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ClassEntity> classes;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolEntity that = (SchoolEntity) o;
        return Objects.equals(id, that.id) && fieldOfStudy.equals(that.fieldOfStudy) && name.equals(that.name) && address.equals(that.address) && city.equals(that.city) && Objects.equals(classes, that.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldOfStudy, name, address, city, classes);
    }
}

