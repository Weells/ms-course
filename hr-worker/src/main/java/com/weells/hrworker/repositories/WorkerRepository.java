package com.weells.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weells.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
