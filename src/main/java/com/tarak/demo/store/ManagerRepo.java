package com.tarak.demo.store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {
}
