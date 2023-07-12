package cv.sabordkasa.repositories;

import cv.sabordkasa.models.DataBean;
import cv.sabordkasa.models.Receitas;
import cv.sabordkasa.models.PayloadResponse;
import cv.sabordkasa.utils.Utils;
import io.quarkus.hibernate.orm.panache.PanacheRepository;



import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ReceitaRepository implements PanacheRepository<Receitas> {
    public Receitas findByTitle(String title){
        return find("title", title).firstResult();
    }

    public List<Receitas> findAllReceitas() {
        return listAll();
    }
    public PayloadResponse save(Receitas receita) {
        persist(receita);
        if(isPersistent(receita)) {
            return Utils.payloadResponse(DataBean.builder()
                    .code(0)
                    .message("Receita Persisted with Success")
                    .payload(receita)
                    .build());
        }else {
            return Utils.payloadResponse(DataBean.builder()
                    .code(1)
                    .message("Receita not persisted")
                    .error(true)
                    .build());
        }
    }
}