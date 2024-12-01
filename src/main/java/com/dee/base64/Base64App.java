package com.dee.base64;

public class Base64App {
    public static void main(String[] args) {
        IBase64Service base64Service = new Base64ServiceImpl();

        // Example input
        String plainText = "Hello, Base64!";

        // Encrypting
        String encodedText = base64Service.encrypt(plainText);
        System.out.println("Encoded Text: " + encodedText);

        // Decrypting
        String decodedText = base64Service.decrypt(encodedText);
        System.out.println("Decoded Text: " + decodedText);
    }
}
