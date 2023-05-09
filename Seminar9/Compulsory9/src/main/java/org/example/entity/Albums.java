package org.example.entity;
import javax.persistence.*;
import java.io.Serializable;
    @Entity
    @Table(name = "albums")

    @NamedQueries({
            @NamedQuery(name = "Albums.findAll", query = "select a from Albums a where a.name = :name")
})
    public class Albums extends AbstractEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Albums() {
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
            return "Albums{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

