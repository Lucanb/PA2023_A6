package org.example;

public class DocumentNotFoundException extends Exception {
    public DocumentNotFoundException(Exception ex) {
        super("Document not found", ex);
    }

    public DocumentNotFoundException(String documentNotFoundInCatalog) {
        super("Document not found");
    }
}
