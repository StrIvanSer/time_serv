package com.example.time_serv;

import com.example.time_serv.times.TimeProviderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
// Если бин находится вне package main класса то необходимо добавить сканирование определенных пакетов
@ComponentScan(basePackages = "com.example")
// Подключение кастомных свойств
@PropertySource("classpath:custom.properties")
@EnableConfigurationProperties(TimeProviderProperties.class)
public class TimeServApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServApplication.class, args);
	}

}
