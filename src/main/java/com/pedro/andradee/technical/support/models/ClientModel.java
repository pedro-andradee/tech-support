package com.pedro.andradee.technical.support.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class ClientModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 11)
    private String cpf;

    @OneToMany(targetEntity = ScheduleModel.class, mappedBy = "client")
    private List<ScheduleModel> schedules;

    public ClientModel() {
    }

    public ClientModel(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ScheduleModel> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleModel> schedules) {
        this.schedules = schedules;
    }
}
