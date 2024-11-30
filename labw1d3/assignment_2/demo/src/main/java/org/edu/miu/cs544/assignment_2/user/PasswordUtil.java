package org.edu.miu.cs544.assignment_2.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String hashPassword(String password) {
        return encoder.encode(password);
    }

    public static boolean matchPassword(String password, String hashedPassword) {
        return encoder.matches(password, hashedPassword);
    }
}
