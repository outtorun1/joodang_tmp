package com.joodang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class Auditconfig {
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }
}
