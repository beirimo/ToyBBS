package jay.toy.config;

import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	
//	@Override
	public void addCorsMapping(CorsRegistry registry) {
		{
			registry.addMapping("/**")
				.allowedOrigins("http://localhost:8080")
				.allowedMethods(
					HttpMethod.GET.name(),
					HttpMethod.POST.name(),
					HttpMethod.PATCH.name(),
					HttpMethod.DELETE.name());				
				
		}
	}

}
