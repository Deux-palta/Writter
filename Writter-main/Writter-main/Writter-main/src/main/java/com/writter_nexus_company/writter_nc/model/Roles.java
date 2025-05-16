package com.writter_nexus_company.writter_nc.model;

@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class roles {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @joinColumn(name="rol_id", nullable=false)
    private Rol rol;
}
