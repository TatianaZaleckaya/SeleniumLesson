package org.example.github;

public enum DataLoginTest {

    POSITIVE ("",""),
    INVALID_PASSWORD ("", "3r4g45gt"),
    INVALID_LOGIN("   ","");

    String login;
    String password;

    DataLoginTest(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
