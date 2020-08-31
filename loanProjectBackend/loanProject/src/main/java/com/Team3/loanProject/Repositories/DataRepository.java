package com.Team3.loanProject.Repositories;

import com.Team3.loanProject.Entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Integer> {
}
