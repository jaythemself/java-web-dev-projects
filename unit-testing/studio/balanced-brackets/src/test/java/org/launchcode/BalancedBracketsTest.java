package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    // POSITIVE TEST CASES

    // TODO: Refactor example test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    // TODO: Test balanced brackets in front of other characters -- "[]LaunchCode"
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    // TODO: Test balanced brackets around other characters -- "[LaunchCode]"
    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    // TODO: Test balanced brackets within other characters -- "Launch[Code]"
    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code}";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    // TODO: Test multiple consecutive pairs of balanced brackets -- "[][][]"
    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    // TODO: Test multiple nested balanced brackets -- "[[[]]]"
    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three sets of nested brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }


    // NEGATIVE TEST CASES

    // TODO: Test single opening bracket -- "["

    // TODO: Test single closing bracket -- "]"

    // TODO: Test reversed brackets -- "]["

    // TODO: Test single bracket with other characters -- "[LaunchCode"
}