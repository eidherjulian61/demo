package com.example.demo.service;

import com.example.demo.entities.Response;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.*;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public Response findPermutations(String text, String word) {
        List<String> permutationList = new ArrayList<>();
        var response = new Response();
        var amount = 0;
        var permutations = permutationFinder(word.toLowerCase());
        var splitText = text.toLowerCase().split(" ");
        for (String str: splitText) {
            var normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
            var result = normalized.replaceAll("[^A-Za-z]", "");
            if(permutations.indexOf(result)>=0) {
                permutationList.add(result);
                amount++;
            }
        }
        response.setPermutations(permutationList);
        response.setAmount(amount);
        return response;
    }

    private static List<String> permutationFinder(String str) {
        List<String> perm = new ArrayList<>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        List<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }
    private static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
}
