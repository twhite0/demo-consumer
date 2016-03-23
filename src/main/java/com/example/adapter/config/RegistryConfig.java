package com.example.adapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.example.adapter.Adapter;
import com.example.adapter.RegistryAdapter;

@Configuration
@Profile("registry")
public class RegistryConfig {

	@Bean
	public Adapter adapter() {
		return new RegistryAdapter();
	}
}




