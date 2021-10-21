package com.example.demo.converter;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

//public class ClientConverter implements Converter<String, Client> {
//
//    @Autowired
//    private ClientRepository client;
//
//    @Override
//    public Client convert(String b){
//        return client.getById(Long.parseLong(b));
//    }
//}