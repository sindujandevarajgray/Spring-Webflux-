package com.gray.WebFluxApp2.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 4:42 PM
 * webfluxdemo
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FluxAndMonoController {

    @RequestMapping("/flux")
    public Flux<Integer> writeFlux() {
        return Flux.just(1, 2, 3, 4).log();
    }

    @GetMapping(value = "/fluxstream", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Integer> writeFluxStream() {
        return Flux.just(1, 2, 3, 4)
                .delayElements(Duration.ofSeconds(1))
                .log();
    }


    @RequestMapping("/mono")
    public Mono<String> writeMono() {
        return Mono.just("Pasindu").log();
    }

    @GetMapping(value = "/monostream", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Mono<String> writeMonoStream() {
        return Mono.just("Pasindu")
                .delayElement(Duration.ofSeconds(1))
                .log();
    }
}
