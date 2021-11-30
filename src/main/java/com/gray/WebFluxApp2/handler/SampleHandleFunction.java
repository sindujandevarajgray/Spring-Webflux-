package com.gray.WebFluxApp2.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 6:54 PM
 * WebFluxApp2
 */
@Component
public class SampleHandleFunction {

    public Mono<ServerResponse> flux(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Flux.just(1,2,3,4).log(),Integer.class);
    }
    public Mono<ServerResponse> mono(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just("Pasindu").log(),String.class);
    }


}
