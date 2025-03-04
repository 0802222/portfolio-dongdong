package com.dongdong.portfolio.domain.repository

import com.dongdong.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>