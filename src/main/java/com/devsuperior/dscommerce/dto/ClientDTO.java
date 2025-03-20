package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClientDTO {

    private Long id;
    private String name;

    public ClientDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public ClientDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public ClientDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
