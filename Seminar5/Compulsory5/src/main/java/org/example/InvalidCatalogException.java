package org.example;

public class InvalidCatalogException extends Exception {
    public InvalidCatalogException(String ex) {
         super("Invalid catalog file.");
    }
}