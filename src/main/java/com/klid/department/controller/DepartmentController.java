package com.klid.department.controller;

import com.klid.department.entity.Department;
import com.klid.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ivan Kaptue
 */
@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> save(@RequestBody Department department) {
        log.info("DepartmentController save department {}", department);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.save(department));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findById(@PathVariable Long id) {
        log.info("DepartmentController findById department {}", id);
        return ResponseEntity.ok(departmentService.findById(id));
    }
}
