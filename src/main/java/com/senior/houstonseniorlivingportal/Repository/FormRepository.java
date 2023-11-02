package com.senior.houstonseniorlivingportal.Repository;

import com.senior.houstonseniorlivingportal.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form, Long> {
}
