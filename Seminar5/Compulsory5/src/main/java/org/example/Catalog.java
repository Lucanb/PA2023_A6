package org.example;
import java.util.List;
import java.util.ArrayList;
public class Catalog {
    private List<Document> documents;

    public Catalog() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) throws InvalidCatalogException {
        if (documents.contains(document)) {
            throw new InvalidCatalogException("Duplicate entry in catalog");
        }
        documents.add(document);
    }

    public Document findDocumentById(String id) throws DocumentNotFoundException {
        for (Document document : documents) {
            if (document.getId().equals(id)) {
                return document;
            }
        }
        throw new DocumentNotFoundException("Document not found in catalog");
    }

    @Override
    public String toString() {
        return "Catalog [documents=" + documents + "]";
    }
}
