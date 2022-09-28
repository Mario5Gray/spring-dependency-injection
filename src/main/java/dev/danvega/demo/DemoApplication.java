package dev.danvega.demo;

import dev.danvega.demo.listeners.WebServerStartedListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(DemoApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.listeners(new WebServerStartedListener())
				.run(args);
	}

	@EventListener
	public void startingEvent(ApplicationStartedEvent event) {
		log.info("Main Application Started");
		// do something with event
	}

}
