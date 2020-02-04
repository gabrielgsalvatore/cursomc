package com.example.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

    public static String decodeParam(String s){
        try {
            URLDecoder.decode(s, "UTF-8");
            return s;
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    public static List<Integer> decodeIntList(String s){

        return Arrays.asList(s.split(",",0)).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());

    }
}
