package com.johnclaro.backend.other;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class OtherController {

    @GetMapping()
    public ResponseEntity<Object> index() throws URISyntaxException {
        URI frontend = new URI("https://johnclaro.vercel.app");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(frontend);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }

    @GetMapping({"/health"})
    @ResponseStatus(HttpStatus.OK)
    public String health() {
        return ":)";
    }
}
