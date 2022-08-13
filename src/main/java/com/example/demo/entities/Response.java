package com.example.demo.entities;

import java.util.List;

public class Response {

    private Integer amount;
    private List<String> permutations;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<String> getPermutations() {
        return permutations;
    }

    public void setPermutations(List<String> permutations) {
        this.permutations = permutations;
    }
}
