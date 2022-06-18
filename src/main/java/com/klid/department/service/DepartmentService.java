package com.klid.department.service;

import com.klid.department.entity.Department;
import com.klid.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Ivan Kaptue
 */
@Slf4j
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department save(Department department) {
        log.info("DepartmentService save department {}", department);
        return departmentRepository.save(department);
    }

    public Department findById(Long id) {
        log.info("DepartmentService findById department {}", id);
        return departmentRepository.findById(id).orElseThrow();
    }
}
