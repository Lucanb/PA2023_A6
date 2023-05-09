package org.example.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "genres")
@NamedQueries({
        @NamedQuery(name = "Genres.findAll", query = "select a from Genres a where a.name = :name")
})
public class Genres extends  AbstractEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Genres() {
        this.id = id;
        this.name = name;
    }
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
