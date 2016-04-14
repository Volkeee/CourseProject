package com.courseproj.kep.access.jpa;

import java.util.List;

/**
 * Created by ВІТЯНЯ on 11.04.2016.
 */
public interface IAccessDAO<S> {

    S update(S s);

    void delete(Long id);

    S getOne(Long id);

    List<S> getAll();

    S save(S s);
}
