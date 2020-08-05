package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message="Name is required")
    @Size(min=5, max=15, message="Username must be between 5-15 characters")
    private String username;

    @Email
    private String email;

    @NotBlank
    @Min(6)
    private String password;

    @NotBlank
    @Min(6)
    private String verify;

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}
