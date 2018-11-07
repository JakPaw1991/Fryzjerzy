package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AppService {

    @Id
    @GeneratedValue
    private Long id;
    private String serviceName;
    private Long servicePrice;
    private Long serviceTime;

    public AppService() {
        super();
    }

    public AppService(String serviceName, Long servicePrice, Long serviceTime) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.serviceTime = serviceTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Long getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Long serviceTime) {
        this.serviceTime = serviceTime;
    }
}
