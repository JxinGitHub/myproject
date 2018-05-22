package xyz.eazyfree.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import xyz.eazyfree.handler.CityHandler;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/16.11:27
 */
@Configuration
public class CityRouter {

    @Bean
    public RouterFunction<ServerResponse> routeCity(CityHandler cityHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                    .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::helloCity);

    }


}
