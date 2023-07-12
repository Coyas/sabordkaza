package cv.sabordkasa.swagger;

import cv.sabordkasa.constants.Constants;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "API para Receitas", description = "receitas caseiras e outras")
        },
        info = @Info(
                title = "Servico Sabor D'Kaza  - API",
                description = "lista de receitas",
                version = "0.0.1",
                contact = @Contact(
                        name = " Support sabordkaza",
                        url = "https://sabordkaza.cv",
                        email = "support@sabordkaza.cv"
                ),
                license = @License(
                        name = "Licença CLoud",
                        url = "https://sabordkaza.cv"
                )
        )
)
public class SwaggerConfig extends Application {
}
