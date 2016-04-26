package com.courseproj.kep.company.service;

import com.courseproj.kep.company.domain.CompaniesEntity;

import java.util.Set;

/**
 * Created by volke on 17.04.2016.
 */
public interface ICompanyService {
    Set<CompaniesEntity> getByName(String name);
}
