package com.entity;

import java.util.Optional;

import static com.entity.Scopes.*;

public class TestLookup {


    public static void main(String[] args) {
        RegexLookup<String> configuration = new RegexLookup();
        configuration.putPattern("^RESOURCE.*", "() -> { /* some action*/}");
        configuration.putPattern("USER|ACCOUNT", "() -> { /* do action*/}");
        configuration.putPattern("PRODUCT", "() -> { /* do action */}");
    
        configuration.putPattern("/v1/profile-photos", PROFILE_PHOTO_WRITE.getScope());
        configuration.putPattern("/v1/profile-photos/*", PROFILE_PHOTO_READ.getScope());
        configuration.putPattern("/v1/profile-photos/*/content-moderation-scores", PROFILE_PHOTO_ADMIN.getScope());
        configuration.putPattern("/v1/customer-profile-photos", PROFILE_PHOTO_READ.getScope());
        configuration.putPattern("/v1/customer-profile-photo-history", PROFILE_PHOTO_READ.getScope());
        configuration.putPattern("/v1/profile-photos/^/relationships", PROFILE_PHOTO_WRITE.getScope());
        configuration.putPattern("/v1/profile-photos/relationships:delete", PROFILE_PHOTO_DELETE.getScope());
        configuration.putPattern("/v1/profile-photos/^:restrict", PROFILE_PHOTO_ADMIN.getScope());
        configuration.putPattern("/v1/profile-photos/^:un-restrict", PROFILE_PHOTO_ADMIN.getScope());
        configuration.putPattern("/v1/customer-blocked-network-photos", PROFILE_PHOTO_READ.getScope());
        configuration.putPattern("/v1/customer-blocked-network-photos/^", PROFILE_PHOTO_WRITE.getScope());
    //ToDo Above is post below delete with same url
        configuration.putPattern("/v1/customer-blocked-network-photos/^", PROFILE_PHOTO_DELETE.getScope());

        Optional<String> action = configuration.find("/v1/profile-photoas/*");

        System.out.println(action.isPresent());
    }
}