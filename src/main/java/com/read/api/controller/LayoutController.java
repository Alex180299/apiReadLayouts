package com.read.api.controller;

import com.read.api.service.LayoutServiceImp;
import com.read.app.model.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/layout")
public class LayoutController
{

    @Autowired
    LayoutServiceImp layoutServiceImp;

    @GetMapping("/in/fields")
    public List<Field> getLayoutInFields()
    {
        return layoutServiceImp.findLayoutInFields();
    }

    @GetMapping("/out/fields")
    public List<Field> getLayoutOutFields()
    {
        return layoutServiceImp.findLayoutOutFields();
    }

    @GetMapping("/in/field/{id}")
    public Field getInFieldById(@PathVariable Long id)
    {
        return layoutServiceImp.findInFieldById(id);
    }

    @GetMapping("/out/field/{id}")
    public Field getOutFieldById(@PathVariable Long id)
    {
        return layoutServiceImp.findOutFieldById(id);
    }

    @PostMapping("/in/field")
    public String saveInField(@RequestBody Field field)
    {
        return "{ " + layoutServiceImp.saveInField(field) + " }";
    }

    @PostMapping("/out/field")
    public String saveOutField(@RequestBody Field field)
    {
        return "{ " + layoutServiceImp.saveOutField(field) + " }";
    }

    @DeleteMapping("/in/field/{id}")
    public String deleteInField(@PathVariable Long id)
    {
        return "{ " + layoutServiceImp.deleteInField(id) + " }";
    }

    @DeleteMapping("/out/field/{id}")
    public String deleteOutField(@PathVariable Long id)
    {
        return "{ " + layoutServiceImp.deleteOutField(id) + " }";
    }

    @PutMapping("/in/field")
    public String updateInField(@RequestBody Field field)
    {
        return "{ " + layoutServiceImp.updateInField(field) + " }";
    }

    @PutMapping("/out/field")
    public String updateOutField(@RequestBody Field field)
    {
        return "{ " + layoutServiceImp.updateOutField(field) + " }";
    }

}
