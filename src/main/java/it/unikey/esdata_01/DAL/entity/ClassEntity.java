package it.unikey.esdata_01.DAL.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity(name = "Class")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotNull
    private String section;

    @Column(nullable = false)
    @NotNull
    private Integer number;

    @Column(nullable = false)
    @NotNull
    private Integer studentNumber;

    @Column(nullable = false)
    @NotNull
    private Integer hour;

    @OneToMany(mappedBy = "classes", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<StudentEntity> students;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private SchoolEntity school;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassEntity that = (ClassEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
