/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto12.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
/**
 *
 * @author Aluno
 */
public class TesteBanco {
    public static void main(String[] args) {
        //configurando e estabelecendo conexão com o banco
        BasicDataSource dataSource = new BasicDataSource();
        //driver do banco classe
        dataSource.setDriverClassName("org.h2.Driver");
        //url do banco
        dataSource.setUrl("jdbc:h2:file:./meubanco");
        
        dataSource.setUsername("sa");
        dataSource.setPassword(""); 
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        
        System.out.println("Todos os registros");
        System.out.println(jdbcTemplate.queryForList("select * from pais"));
        
        System.out.println("Alguns registros");
System.out.println(jdbcTemplate.queryForList("select * from pais where id>2"));
//list do java.util
List<Pais> ListaPaises = jdbcTemplate.query("select * from pais", new BeanPropertyRowMapper(Pais.class));

for(Pais pais : ListaPaises) {
    System.out.println("Id:"+pais.getId());
     System.out.println("Nome:"+pais.getNome());
}

        System.out.println("Quantas linhas a consulta tem?"+ListaPaises.size());
        
        Integer idConsulta=2;
        List<Pais> Consulta1 = jdbcTemplate.query("select * from pais where id =?", new BeanPropertyRowMapper(Pais.class),idConsulta);
        System.out.println("Resultado da consulta");
for(Pais pais : Consulta1) {
    System.out.println("Id:"+pais.getId());
     System.out.println("Nome:"+pais.getNome());
}
        Integer idLogin=1;
        List<Usuario>Verificar=jdbcTemplate.query("select * from usuario where id=?", new BeanPropertyRowMapper(Usuario.class),idLogin);
        System.out.println("Resultado da consulta");
        
        for(Usuario usuario : Verificar) {
            System.out.println("Id"+usuario.getId());
            System.out.println("Login"+usuario.getLogin());
              System.out.println("Senha"+usuario.getSenha());
              System.out.println("Nome"+usuario.getNome());
        }
    }
    
    
}
