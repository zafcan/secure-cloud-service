package org.zbm.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class GatewayConfig {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		// @formatter:off
		return builder.routes()
				.route("acente-rs", r -> r.path("/rs/**")
						.uri("lb://acente-rs"))
				.route("acente-ws", r -> r.path("/ws/**")
						.uri("lb://acente-ws"))
				.build();
		// @formatter:on

	}

}
