package com.courseproj.kep.company.controller;

import com.courseproj.kep.access.rest.RestBase;
import com.courseproj.kep.company.domain.CompanyEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by volke on 24.04.2016.
 */
@RestController
@RequestMapping(value = "/company")
public class CompanyController extends RestBase<CompanyEntity> implements ICompanyController {



    @RequestMapping("/test")
    @ResponseBody
    public String testRequest() {

        return "test";
    }

    @Override
    public ResponseEntity<Set<CompanyEntity>> getOne(@PathVariable String name) {
        return null;
    }
}
