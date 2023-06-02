package br.com.senacsp.planejadorViagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senacsp.planejadorViagem.model.Hospedagem;
import br.com.senacsp.planejadorViagem.repository.HospedagemRepository;

@Controller
public class HospedagemController {

    @Autowired
    HospedagemRepository repository;

    @GetMapping("/hospeadagem")
    public String hospedagem() {
        return hospedagem();
    }  
    
    @PostMapping("/hospedagem") 
        public String cadastrar(Hospedagem hospedagem) {
            repository.save(hospedagem); 
            return "redirect:/hospedagem/cadastrar";

        }
    }





