package cv.sabordkasa.resources.v1;

import cv.sabordkasa.constants.Constants;
import cv.sabordkasa.models.DataBean;
import cv.sabordkasa.models.PayloadResponse;
import cv.sabordkasa.repositories.ReceitaRepository;
import cv.sabordkasa.utils.Utils;
import jakarta.inject.Inject;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReceitaResource {

    @Inject
    ReceitaRepository receitaRepository;


    @GET
    @Tag(name = "end point")
    @Operation(summary = "summary", description = "description")
    @Path("/receitas")
    public PayloadResponse getStudents(){
        return Utils.payloadResponse(
                DataBean
                        .builder()
                        .code(0)
                        .payload(receitaRepository.findAllReceitas())
                        .build());
    }

}
