package com.example.formAPI.api.form;

import java.util.ArrayList;
import java.util.List;

import com.example.formAPI.domain.FormSAP;
import com.example.formAPI.domain.dto.RetornoSapDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/form")
public class FormController {


    @PostMapping
    public RetornoSapDto post(@RequestBody FormSAP form) {

        RetornoSapDto retorno = new RetornoSapDto();
        List<String> lista1 = new ArrayList<String>();
        lista1.add("Item 1");
        lista1.add("Item 2");
        retorno.setResponse("Retorno OK");
        retorno.setLista(lista1);

         return retorno; //ResponseEntity.ok(retorno);
    }

}