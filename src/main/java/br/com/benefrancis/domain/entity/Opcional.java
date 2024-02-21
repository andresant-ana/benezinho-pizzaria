package br.com.benefrancis.domain.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_OPCIONAL")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Opcional {

    @Id
    // GeneratedValue define que o atributo 'id' será a chave primária da entidade
    // GenerationType.SEQUENCE define que o id será gerado em sequência
    // generator define o nome da sequência
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_OPCIONAL")
    @SequenceGenerator(name = "SQ_OPCIONAL", sequenceName = "SQ_OPCIONAL")
    private Long id;

    private String nome;

    private Double preco;



}
