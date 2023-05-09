package org.example.entity;

public class AbstractEntity {
    private Long id;
    private String name;

    public AbstractEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public AbstractEntity() {
        this.id = new Long(12314);
        this.name = "name";
    }
}
