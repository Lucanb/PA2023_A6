package org.example.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artists")
@NamedQueries({
        @NamedQuery(name = "Artists.findAll", query = "select a from Artists a where a.name = :name")
})
public class Artists extends AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name="genre")
    private String genre;
    public Artists(String name,String country,String genre,Integer id)
    {
        this.name=name;
        this.country=country;
        this.genre=genre;
        this.id=id;
    }
    public Artists(String name)
    {
        this.name=name;
        this.country="Romania";
        this.genre="Rock";
        this.id=1;
    }

    public Artists() {
        this.name = "Luca";
        this.country = "Romania";
        this.genre = "Rock";
        this.id = 10234;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}