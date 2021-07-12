package one.digitalinnovation.personapi.enums;

import lombok.Getter;

@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    PhoneType(String string) {
        this.description = string;
    }

    private final String description;
}
