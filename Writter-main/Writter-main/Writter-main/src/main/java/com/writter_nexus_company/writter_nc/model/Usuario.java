package com.writter_nexus_company.writter_nc.model;

import jakarta.persistence.Entity;

@Entity
@Table(name="usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(unique=false, nullable=false, length=20)
    private String contraseña;

    @Column(unique=true, nullable=false, length=30)
    private String email;

    @column(unique=false, nullable=false, length=15)
    private String nombre;
}
