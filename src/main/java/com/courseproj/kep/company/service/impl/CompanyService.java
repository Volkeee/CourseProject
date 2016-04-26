package com.courseproj.kep.company.service.impl;

import com.courseproj.kep.company.domain.CompaniesEntity;
import com.courseproj.kep.company.service.ICompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by volke on 17.04.2016.
 */
public class CompanyService implements ICompanyService {

    private final Logger log = LoggerFactory.getLogger(getClass());

//    public CompanyService()

    //    @Autowired
    @Override
    public Set<CompaniesEntity> getByName(String name) {
        log.info("Getting company by name '{}'", name);
        return
    }
}
