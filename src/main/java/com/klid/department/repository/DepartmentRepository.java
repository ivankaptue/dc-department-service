package com.klid.department.repository;

import com.klid.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ivan Kaptue
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
