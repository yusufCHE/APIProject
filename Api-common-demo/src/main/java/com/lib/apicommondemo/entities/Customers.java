package com.lib.apicommondemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
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
