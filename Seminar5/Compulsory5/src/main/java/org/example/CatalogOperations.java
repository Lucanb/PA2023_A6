package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CatalogOperations {
        public void saveCatalogToJsonFile(Catalog catalog, String filePath) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            String a = catalog.toString();
         //   mapper.writeValue(new File(filePath), a);
         //  mapper.writeValue(new File(filePath),catalog);
            System.out.println("Success !");
        }

        public Catalog loadCatalogFromJsonFile(String filePath) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(filePath), Catalog.class);
        }
    public String loadCatalogFromJsonFile(Catalog a) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return a.toString();
    }
    }
