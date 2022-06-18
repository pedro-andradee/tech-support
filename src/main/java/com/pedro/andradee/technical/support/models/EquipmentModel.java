package com.pedro.andradee.technical.support.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class EquipmentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String equipmentType;

    @ManyToMany(targetEntity = TechnicalSupportModel.class)
    @JoinTable(name = "equipment_techsupport",
            joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "technical_support_id"))
    private List<TechnicalSupportModel> technicalSupports;

    public EquipmentModel() {
    }

    public EquipmentModel(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public List<TechnicalSupportModel> getTechnicalSupports() {
        return technicalSupports;
    }

    public void setTechnicalSupports(List<TechnicalSupportModel> technicalSupports) {
        this.technicalSupports = technicalSupports;
    }
}
