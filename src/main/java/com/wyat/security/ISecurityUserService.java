package com.wyat.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
