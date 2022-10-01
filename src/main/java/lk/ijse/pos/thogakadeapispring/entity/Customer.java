package lk.ijse.pos.thogakadeapispring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//auto boxing
    @NonNull
    private String name;
    @NonNull
    private String address;
    @Column(name = "salary")
    private double salary;
}
