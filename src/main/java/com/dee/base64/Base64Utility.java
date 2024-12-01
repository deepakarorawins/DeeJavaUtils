package com.dee.base64;

import java.util.Base64;

public class Base64Utility {

    // Encodes a string into Base64
    public String encode(String plainText) {
        if (plainText == null || plainText.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }
        return Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    // Decodes a Base64 string back to plain text
    public String decode(String base64Text) {
        if (base64Text == null || base64Text.isEmpty()) {
            throw new IllegalArgumentException("Base64 input cannot be null or empty");
        }
        return new String(Base64.getDecoder().decode(base64Text));
    }
}
