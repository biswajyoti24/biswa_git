package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

public class conf {
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter implements com.example.practice.SecurityConfig {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/api/**").permitAll() // Allow unrestricted access to /api endpoints
                    .anyRequest().authenticated()
                    .and()
                    .csrf().disable(); // Disable CSRF protection (for demonstration, not recommended in production)
        }
    }

}
