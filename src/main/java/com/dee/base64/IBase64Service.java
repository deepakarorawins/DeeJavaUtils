package com.dee.base64;

public interface IBase64Service {
    String encrypt(String plainText);
    String decrypt(String base64Text);
}
