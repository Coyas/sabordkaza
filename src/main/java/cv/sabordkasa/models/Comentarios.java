package cv.sabordkasa.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

// anotaçoes de lombok
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

// daqui para baixo sao do Jakarta

@Entity // isso aqui "talvez" nao pertence a lombok mas sim ao framework Java Persistence API (JPA)
@Table(name = "comentarios")  // se o name nao for especificado sera usado o nome da classe como tabela de BD
public class Comentarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Nonnull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String author;
    private String comments;

}
