package com.au.example.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WireMockConfig {

  private final WireMockServer wireMockServer;

  @Value("${wiremock.port:8085}")
  private int wireMockPort;

  public WireMockConfig() {
    this.wireMockServer = new WireMockServer(
        WireMockConfiguration.wireMockConfig()
            .port(9090)
            .usingFilesUnderClasspath("wiremock")
    );
    this.wireMockServer.start();
  }

  @Bean
  public WireMockServer wireMockServer() {
    return wireMockServer;
  }

  @PreDestroy
  public void stopWireMockServer() {
    wireMockServer.stop();
  }



}
