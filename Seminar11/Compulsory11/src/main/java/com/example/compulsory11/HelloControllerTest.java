package com.example.compulsory11;

import org.apache.tomcat.util.descriptor.web.FragmentJarScannerCallback;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.http.ResponseEntity.status;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

@SpringBootTest
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON));
      ////  .andExpect(status().isOk())
       // .andExpect(content().string(equalTo("\"Greetings from Spring Boot!\"")));
    }
}
