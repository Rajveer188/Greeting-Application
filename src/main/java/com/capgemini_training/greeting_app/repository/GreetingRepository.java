package com.capgemini_training.greeting_app.repository;

import com.capgemini_training.greeting_app.model.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.DocFlavor;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, String> {
}
