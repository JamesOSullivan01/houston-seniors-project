package com.senior.houstonseniorlivingportal.service;

import com.senior.houstonseniorlivingportal.Entity.Form;
import com.senior.houstonseniorlivingportal.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService{
    @Autowired
    private FormRepository formRepository;

    @Override
    public Form newForm(Form form) {
        Form entity = new Form();
        Long formId = form.getFormId();
        return formRepository.save(form);
    }
}
