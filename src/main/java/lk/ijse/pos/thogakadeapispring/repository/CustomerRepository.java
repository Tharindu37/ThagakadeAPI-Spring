package lk.ijse.pos.thogakadeapispring.repository;

import lk.ijse.pos.thogakadeapispring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
