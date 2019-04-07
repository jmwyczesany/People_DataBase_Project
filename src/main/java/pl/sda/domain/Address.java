package pl.sda.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Embeddable
@Table(name = "address")
public class Address {


    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "zipCode", length = 10, nullable = false)
    private String zipCode;
    @Column(name = "street", length = 50, nullable = false)
    private String street;
    @Column (name = "homeNumber", nullable = false)
    private int homeNumber;

}
