package com.read.api.controller;

import com.read.api.service.LayoutServiceImp;
import com.read.app.model.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
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
    public Field getInFieldById(@PathVariable @NotNull @Positive Long id)
    {
        return layoutServiceImp.findInFieldById(id);
    }

    @GetMapping("/out/field/{id}")
    public Field getOutFieldById(@PathVariable @NotNull @Positive Long id)
    {
        return layoutServiceImp.findOutFieldById(id);
    }

    @PostMapping("/in/field")
    public String saveInField(@RequestBody @Valid Field field)
    {
        return "{ " + layoutServiceImp.saveInField(field) + " }";
    }

    @PostMapping("/out/field")
    public String saveOutField(@RequestBody @Valid Field field)
    {
        return "{ " + layoutServiceImp.saveOutField(field) + " }";
    }

    @DeleteMapping("/in/field/{id}")
    public String deleteInField(@PathVariable @NotNull @Positive Long id)
    {
        return "{ " + layoutServiceImp.deleteInField(id) + " }";
    }

    @DeleteMapping("/out/field/{id}")
    public String deleteOutField(@PathVariable @NotNull @Positive Long id)
    {
        return "{ " + layoutServiceImp.deleteOutField(id) + " }";
    }

    @PutMapping("/in/field")
    public String updateInField(@RequestBody @Valid Field field)
    {
        return "{ " + layoutServiceImp.updateInField(field) + " }";
    }

    @PutMapping("/out/field")
    public String updateOutField(@RequestBody @Valid Field field)
    {
        return "{ " + layoutServiceImp.updateOutField(field) + " }";
    }

}
