package com.senior.houstonseniorlivingportal.Controller;

import com.senior.houstonseniorlivingportal.Entity.Form;
import com.senior.houstonseniorlivingportal.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

    @Autowired
    private FormService formService;

    @PostMapping("/new-form")
    public Form SubmitNewForm(@RequestBody Form form){
        System.out.println("************************************" + form);
        return formService.newForm(form);
    }

}
