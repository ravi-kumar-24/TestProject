package com.entity;


public enum Scopes {


    PROFILE_PHOTO_ADMIN("profile-photo-admin"),
    PROFILE_PHOTO_READ("profile-photo-read"),
    PROFILE_PHOTO_WRITE("profile-photo-write"),
    PROFILE_PHOTO_DELETE("profile-photo-delete");

    String scope;

    Scopes(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }
}
