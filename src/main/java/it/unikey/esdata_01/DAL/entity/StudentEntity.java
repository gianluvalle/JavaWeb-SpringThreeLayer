package it.unikey.esdata_01.DAL.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.function.Predicate;

@Entity(name = "Students")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotNull
    private String name;

    @Column(nullable = false)
    @NotNull
    private String surname;

    @Column(nullable = false)
    @NotNull
    private Integer age;

    @Column(nullable = false)
    @NotNull
    private String fiscalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private ClassEntity classes;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentEntity that = (StudentEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}