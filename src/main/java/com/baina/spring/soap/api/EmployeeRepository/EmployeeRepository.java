package com.baina.spring.soap.api.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baina.spring.soap.api.entity.EmployeeDb;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDb,Integer> {

}
