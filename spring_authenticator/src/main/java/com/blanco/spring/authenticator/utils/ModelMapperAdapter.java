package com.blanco.spring.authenticator.utils;



import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ModelMapperAdapter {
    private static ModelMapper mapper = new ModelMapper();


    public static <O, D> D parseObject(O origen, Class<D> destination){
        return mapper.map(origen,destination);
    }
    public static <O, D> List<D> parseListObjects(List<O> origen, Class<D> destination){
        List<D> destinationObjetcs = new ArrayList<D>();
        for(O o : origen){
            destinationObjetcs.add(mapper.map(o,destination));
        }

        return destinationObjetcs;
    }



}
