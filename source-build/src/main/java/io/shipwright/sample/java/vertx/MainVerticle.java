package io.shipwright.sample.java.vertx;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello World!"))
        .listen(8080);
  }
}
