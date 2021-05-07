package com.cts.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.bean.Skills;

public interface SkillRepository extends JpaRepository<Skills, Long> {

}
