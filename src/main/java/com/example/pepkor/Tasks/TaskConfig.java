package com.example.pepkor.Tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class TaskConfig {

    @Bean
    CommandLineRunner commandLineRunner(TaskRepository repository){
        return args -> {
            Task windows = new Task(
                    "window fitter",
                    "john",
                    "Doing",
                    "Parts",
                    LocalDate.of(2021,10,6)
            );
            Task doors = new Task(
                    "door fitter",
                    "Cindy",
                    "Todo",
                    "Parts",
                    LocalDate.of(2021,11,1)
            );
            Task wheels = new Task(
                    "wheel fitter",
                    "john",
                    "Done",
                    "Parts",
                    LocalDate.of(2021,9,15)
            );

            repository.saveAll(
                    List.of(windows,doors,wheels));
        };


    }

}
