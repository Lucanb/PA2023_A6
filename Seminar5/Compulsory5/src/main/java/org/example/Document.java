package org.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location;
    private Map<String, String> tags;

    public Document(String id, String name, String location) throws InvalidDocumentException {
        if (id == null || name == null) {
            throw new InvalidDocumentException("Invalid document");
        }
        this.id = id;
        this.name = name;
        this.location = location;
        this.tags = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addTag(String name, String value) {
        tags.put(name, value);
    }

    public Map<String, String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Document [id=" + id + ", name=" + name + ", location=" + location + ", tags=" + tags + "]";
    }
}
