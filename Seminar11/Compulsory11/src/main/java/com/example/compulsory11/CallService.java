package com.example.compulsory11;

import com.stripe.model.Product;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.logging.Logger;

//@RestController
public class CallService {
  /*
    final Logger log = LoggerFactory.getLogger(CallService.class);
    final String uri = "http://localhost:8080/products";
    @GetMapping("/call")
    public List<Product> getProducts() {
        log.info("Start");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                uri, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Product>>(){});
        List<Product> result = response.getBody();
        result.forEach(p -> log.info(p.toString()));
        log.info("Stop");
        return result;
    }
    @GetMapping(value = "/flux",
            produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product> getProductsNonBlocking() {
        log.info("Start");
        Flux<Product> productFlux = WebClient.create()
                .get()
                .uri(uri)
                .retrieve()
                .bodyToFlux(Product.class);
        productFlux.subscribe(p -> log.info(p.toString()));
        log.info("Stop");
        return productFlux;
    }
*/
}
