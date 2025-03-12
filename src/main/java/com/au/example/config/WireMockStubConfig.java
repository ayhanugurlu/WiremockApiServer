//package com.au.example.config;
//
//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.client.WireMock;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class WireMockStubConfig {
//
//  @Bean
//  public CommandLineRunner setupMockEndpoints(WireMockServer wireMockServer) {
//    return args -> {
//      wireMockServer.stubFor(WireMock.get("/api/mock-data")
//          .willReturn(WireMock.aResponse()
//              .withHeader("Content-Type", "application/json")
//              .withStatus(200)
//              .withBody("{ \"message\": \"Hello from WireMock!\" }")
//          ));
//    };
//  }
//}
