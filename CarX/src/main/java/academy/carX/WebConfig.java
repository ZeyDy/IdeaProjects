package academy.carX;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Čia nurodomas URL modelis
                        .allowedOrigins("http://localhost:3000") // Čia nurodomos leistinos kilmės
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Čia nurodomi leidžiami metodai
                        .allowedHeaders("*") // Leidžiamos visos antraštės
                        .allowCredentials(true); // Leidžiami autentifikacijos duomenys (cookies, HTTP authentication)
            }
        };
    }
}
