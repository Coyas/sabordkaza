package cv.sabordkasa.swagger;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import cv.sabordkasa.utils.Constants;

@OpenAPIDefinition(
        tags = {
                @Tag(name = Constants.SWAGGER_TAG_NAME,
                description = Constants.SWAGGER_TAG_DESCRIPTION)
        },
        info = @Info(
                title = Constants.SWAGGER_INFO_TITLE,
                description = Constants.SWAGGER_INFO_DESCRIPTION,
                version = Constants.SWAGGER_INFO_VERSION,
                contact = @Contact(
                        name = Constants.SWAGGER_INFO_CONTACT_NAME,
                        url = Constants.SWAGGER_INFO_CONTACT_URL,
                        email = Constants.SWAGGER_INFO_CONTACT_URL
                ),
                license = @License(
                        name = Constants.SWAGGER_LICENCE_NAME,
                        url = Constants.SWAGGER_LICENCE_URL
                )
        )
)
public class SwaggerConfig extends Application {
}
