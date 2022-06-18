package com.pedro.andradee.technical.support.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class ScheduleModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false)
    private String protocol;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private Long equipmentId;
    @Column(nullable = false)
    private Long techSupportId;

    @ManyToOne(targetEntity = ClientModel.class)
    @JoinColumn(name = "client_id")
    private ClientModel client;

    public ScheduleModel() {
    }

    public ScheduleModel(String cpf, String protocol, LocalDate date, Long equipmentId, Long techSupportId) {
        this.cpf = cpf;
        this.protocol = protocol;
        this.date = date;
        this.equipmentId = equipmentId;
        this.techSupportId = techSupportId;
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getTechSupportId() {
        return techSupportId;
    }

    public void setTechSupportId(Long techSupportId) {
        this.techSupportId = techSupportId;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }
}
