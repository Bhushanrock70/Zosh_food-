package com.zosh.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ContactInformation {

    private String email;

    private String mobile;

    private String twitter;

    private String Instagram;
}
