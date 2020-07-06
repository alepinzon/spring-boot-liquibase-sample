package com.example;

import com.mindscapehq.raygun4java.core.RaygunClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
        } catch (Exception exception) {
            final String raygunApiKey = System.getenv("RAYGUN_API_KEY");
            new RaygunClient(raygunApiKey).send(exception);

            throw exception;
        }
    }

}
