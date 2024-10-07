package com.caleb.PKCE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PkService {

    private final String[] codeVerifierAndChallenge;

    @Autowired
    public PkService(String[] codeVerifierAndChallenge) {
        this.codeVerifierAndChallenge = codeVerifierAndChallenge;
    }

    public void printCodeVerifierAndChallenge() {
        System.out.println("Code Verifier: " + codeVerifierAndChallenge[0]);
        System.out.println("Code Challenge: " + codeVerifierAndChallenge[1]);
    }
}

