package com.example.apicommondemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Customers {
    @Id
    private String BankCode;
    private String ClientCode;
    private String FirstName;
    private String FamilySituation;
    private String LastName;
    private String Gender;
}
