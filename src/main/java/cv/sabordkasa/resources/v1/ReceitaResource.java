package cv.sabordkasa.resources.v1;

import cv.sabordkasa.constants.Constants;
import cv.sabordkasa.models.DataBean;
import cv.sabordkasa.models.PayloadResponse;
import cv.sabordkasa.models.Receitas;
import cv.sabordkasa.repositories.ReceitaRepository;
import cv.sabordkasa.utils.Utils;
import jakarta.inject.Inject;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.transaction.Transactional;


@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReceitaResource {

    @Inject
    ReceitaRepository receitaRepository;


    @GET
    @Tag(name = "Lista todos as receitas")
    @Operation(summary = "lista der citeeas registradas", description = "vai listar todas as receitas ate agora")
    @Path("/receitas")
    public PayloadResponse getReceitas(){
        return Utils.payloadResponse(
                DataBean
                        .builder()
                        .code(0)
                        .payload(receitaRepository.findAllReceitas())
                        .build());
    }

    @POST
    @Tag(name = "Permite criar uma receita")
    @Operation(summary = "envia os dados sobre a receita para o bd", description = "envia dados por um formulario para o banco de dados psql")
    @Path("/receitas")
    @Transactional
    public PayloadResponse insertReceitas(Receitas receitas) {
        return receitaRepository.save(receitas);
    }

}
