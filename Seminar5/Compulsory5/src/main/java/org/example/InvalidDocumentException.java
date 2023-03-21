package org.example;

public class InvalidDocumentException extends Exception{
    public InvalidDocumentException(Exception ex) {
        super("Invalid catalog file.", ex);
    }

    public InvalidDocumentException(String invalidDocument) {
        super("Invalid catalog file.");
    }
}
