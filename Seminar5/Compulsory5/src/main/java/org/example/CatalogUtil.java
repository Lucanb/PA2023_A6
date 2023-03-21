package org.example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CatalogUtil{
        public static void saveCatalogToJsonFile(Catalog catalog, String filePath) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
         //   String a = catalog.toString();
         //   mapper.writeValue(new File(filePath), a);
            mapper.writeValue(new File(filePath),catalog);
            System.out.println("Save Success!");
        }

        public static Catalog loadCatalogFromJsonFile(String filePath) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            return mapper.readValue(new File(filePath), Catalog.class);
        }


        public String loadCatalogFromJsonFile(Catalog a) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        return a.toString();
    }
}
