package co.proyectos.gestortareas.gestorrestaurantes.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Restaurante implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int id;
    private String nombre;
    private String descripcion;




}
