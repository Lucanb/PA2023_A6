package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InvalidDocumentException, DocumentNotFoundException, InvalidCatalogException, IOException {
        Document document1 = new Document("1", "Document 1", "path/to/document1");
        document1.addTag("author", "John Doe");
        document1.addTag("year", "2021");

        Document document2 = new Document("2", "Document 2", "path/to/document2");
        document2.addTag("author", "Jane Smith");
        document2.addTag("year", "2022");

        Catalog catalog = new Catalog();
        catalog.addDocument(document1);
        catalog.addDocument(document2);

        System.out.println(catalog);

        CatalogUtil catalogOperationsOperations = new CatalogUtil();
        catalogOperationsOperations.saveCatalogToJsonFile(catalog, "E:\\Personal\\School\\Anul II (2022-2023)\\Sem II\\Programare Avansata\\Seminar\\PA2023_A6\\Seminar5\\Compulsory5\\catalog.json");

       // Catalog loadedCatalog = catalogOperationsOperations.loadCatalogFromJsonFile("E:\Personal\School\Anul II (2022-2023)\Sem II\Programare Avansata\Seminar\PA2023_A6\Seminar5\Compulsory5\catalog.json");

        String loadedCatalog = catalogOperationsOperations.loadCatalogFromJsonFile(catalog);
        System.out.println(loadedCatalog);

        Document document3 = new Document("3", "Document 3", "path/to/document3");
        catalog.addDocument(document3);

        Document retrievedDocument = catalog.findDocumentById("2");
        System.out.println(retrievedDocument);
    }
}