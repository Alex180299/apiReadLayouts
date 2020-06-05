package com.read.api.service;

import com.read.app.model.Filter;
import com.read.app.repository.FiltersRepository;
import com.read.app.repository.FiltersRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiltersServiceImp implements com.read.app.service.FiltersService
{

    FiltersRepository filtersRepository = new FiltersRepositoryImp();

    @Override
    public List<Filter> findAll() {
        return filtersRepository.findAll();
    }

    @Override
    public Filter findById(Long id) {
        return filtersRepository.findById(id);
    }

    @Override
    public String save(Filter filter) {
        return filtersRepository.save(filter);
    }

    @Override
    public String update(Filter filter) {
        return filtersRepository.update(filter);
    }

    @Override
    public String delete(Long id) {
        return filtersRepository.delete(id);
    }
}
