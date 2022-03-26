package org.example.github;

public enum DataLoginTest {

    POSITIVE ("nekhaevna2212@gmail.com","MIStati2212"),
    INVALID_PASSWORD ("nekhaevna2212@gmail.com", "3r4g45gt"),
    INVALID_LOGIN("   ","MIStati2212");

    String login;
    String password;

    DataLoginTest(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
