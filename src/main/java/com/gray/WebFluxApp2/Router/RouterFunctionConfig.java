package com.gray.WebFluxApp2.Router;

import com.gray.WebFluxApp2.handler.SampleHandleFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/28/2021
 * Time: 7:02 PM
 * WebFluxApp2
 */

@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> route(SampleHandleFunction handleFunction) {
        return RouterFunctions
                .route(RequestPredicates
                        .GET("/functional/flux")
                        .and(RequestPredicates
                                .accept(MediaType.APPLICATION_JSON)), handleFunction::flux)
                .andRoute(RequestPredicates
                        .GET("/functional/mono")
                        .and(RequestPredicates
                                .accept(MediaType.APPLICATION_JSON)),handleFunction::mono);
    }


}
