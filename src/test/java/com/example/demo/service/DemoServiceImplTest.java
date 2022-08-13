package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoServiceImplTest {

    @Test
    public void testFindPermutations() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String word = "God";
        DemoServiceImpl demoService = new DemoServiceImpl();
        var response = demoService.findPermutations(text, word);
        assertEquals("dog",response.getPermutations().get(0));
        assertEquals(1,response.getAmount());
    }

    @Test
    public void testFindPermutations2() {
        String text = "That welding arc almost hit the car";
        String word = "car";
        DemoServiceImpl demoService = new DemoServiceImpl();
        var response = demoService.findPermutations(text, word);
        assertEquals("arc",response.getPermutations().get(0));
        assertEquals("car",response.getPermutations().get(1));
        assertEquals(2,response.getAmount());
    }
}