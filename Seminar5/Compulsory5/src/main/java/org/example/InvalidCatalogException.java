package org.example;

public class InvalidCatalogException extends Exception {
    public InvalidCatalogException(Exception ex) {
        super("Document not found", ex);
    }
    public InvalidCatalogException(String ex) {
         super("Invalid catalog file.");
    }
}