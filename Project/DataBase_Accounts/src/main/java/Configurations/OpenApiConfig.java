package Configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Actions Deposits",
                version = "1.0",
                description = "My Application API"
        ),
        servers = {
                @Server(
                        description = "Local server",
                        url = "http://localhost:8081"
                )
        },
      tags={
                @Tag(name="Clients" , description="The people that have actions or debts at our company"),
                @Tag(name="Grafice" , description="The grafics of the actions and debts"),
                @Tag(name="Partners", description="The partners of our company"),
                @Tag(name="Receipts", description="The actions that our company has"),
                @Tag(name="Client", description="The people that have actions or debts at our company")
      })

@SecurityScheme(
        name= "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class OpenApiConfig {}

