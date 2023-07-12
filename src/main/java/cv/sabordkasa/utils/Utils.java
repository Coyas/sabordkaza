package cv.sabordkasa.utils;


import cv.sabordkasa.models.DataBean;
import cv.sabordkasa.models.PayloadResponse;
import cv.sabordkasa.models.Status;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Utils {
    public static PayloadResponse payloadResponse(DataBean bean) {
        return PayloadResponse.builder()
                .status(Status.builder()
                        .code(bean.getCode())
                        .message(bean.getMessage())
                        .error(bean.isError())
                        .build())
                .payload(bean.getPayload())
                .build();
    }
}