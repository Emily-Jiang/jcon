package com.example.jcon.graphql.db;

@SuppressWarnings("serial")
public class DuplicateSuperHeroException extends Exception {

    public DuplicateSuperHeroException(String message) {
        super(message);
    }
}
