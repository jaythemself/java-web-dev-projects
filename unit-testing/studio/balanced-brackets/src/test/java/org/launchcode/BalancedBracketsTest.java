package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    // POSITIVE TEST CASES

    // TODO: Refactor example test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]", message));
    }

    // TODO: Test balanced brackets in front of other characters -- "[]LaunchCode"

    // TODO: Test balanced brackets around other characters -- "[LaunchCode]"

    // TODO: Test balanced brackets within other characters -- "Launch[Code]"

    // TODO: Test multiple consecutive pairs of balanced brackets -- "[][][]"

    // TODO: Test multiple nested balanced brackets -- "[[[]]]"



    // NEGATIVE TEST CASES

    // TODO: Test single opening bracket -- "["

    // TODO: Test single closing bracket -- "]"

    // TODO: Test reversed brackets -- "]["

    // TODO: Test single bracket with other characters -- "[LaunchCode"
}