package com.example.putextra001;

public class Content {
    private String name;
    private AwesomeEnum type;

    public Content(String name, AwesomeEnum toast) {
        this.name = name;
        this.type = toast;
    }

    public String getName(int adapterPosition) {
        return name;
    }

    public AwesomeEnum getType() {
        return type;
    }
}
