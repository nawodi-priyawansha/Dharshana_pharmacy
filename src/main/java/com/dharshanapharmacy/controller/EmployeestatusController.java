package com.dharshanapharmacy.controller;


import com.dharshanapharmacy.model.Employeestatus;
import com.dharshanapharmacy.repository.EmployeestatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/employeestatus")
@RestController()
public class EmployeestatusController {

    @Autowired
    private EmployeestatusRepository dao;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public List<Employeestatus> employeestatuses() {
        return dao.list();
    }


}
