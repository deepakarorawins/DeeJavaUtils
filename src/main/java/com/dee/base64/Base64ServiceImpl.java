package com.dee.base64;

public class Base64ServiceImpl implements IBase64Service {
    private final Base64Utility base64Utility;

    public Base64ServiceImpl() {
        this.base64Utility = new Base64Utility();
    }

    @Override
    public String encrypt(String plainText) {
        return base64Utility.encode(plainText);
    }

    @Override
    public String decrypt(String base64Text) {
        return base64Utility.decode(base64Text);
    }
}
