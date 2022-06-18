package com.pedro.andradee.technical.support.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TechnicalSupportModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;

    @ManyToMany(targetEntity = EquipmentModel.class, mappedBy = "technicalSupports")
    private List<EquipmentModel> equipment;

    public TechnicalSupportModel() {
    }

    public TechnicalSupportModel(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EquipmentModel> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentModel> equipment) {
        this.equipment = equipment;
    }
}
