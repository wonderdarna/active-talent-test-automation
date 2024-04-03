package org.enums;

import io.github.cdimascio.dotenv.Dotenv;

public enum EnvironmentVariable {

    USERNAME("user_name"),
    PASSWORD ("password"),
    BROWSER ("browser"),
    URL ("url");;

    private final String field;

    EnvironmentVariable (String field) {
        this.field = field;
    }


    public String getField() {
        return field;
    }


    public static String getValue (EnvironmentVariable variable) {
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(variable.field);
    }


}
