package com.finan.orcamento.service;

import com.finan.orcamento.model.Casa;
import com.finan.orcamento.patternBuilder.InterfaceBuilderCasa;
import com.finan.orcamento.patternBuilder.implementsModelBuilder.Casa2Quartos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.finan.orcamento.repositories")
public class CasaBuildApplication {
    public static void main(String[] args){
        SpringApplication.run(CasaBuildApplication.class, args);
        InterfaceBuilderCasa builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa1 = builderCasa1.getCasa();

        System.out.println("Casa 1:");
        System.out.println("Quartos:"+ casa1.getQuartos());
        System.out.println("Banheiros:"+ casa1.getBanheiros());
        System.out.println("Churrasqueira:"+ casa1.isChurrasqueira());
    }
}
