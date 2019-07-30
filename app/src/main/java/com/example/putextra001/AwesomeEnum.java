package com.example.putextra001;



public enum AwesomeEnum {
    UNKNOWN(0),
    TOAST(1),
    MESSAGE(2),
    TAP(3);

    private final int id;

    AwesomeEnum(int code)
    {
        id = code;
    }

    public int getId()
    {
        return id;
    }

    public static AwesomeEnum fromId(int code)
    {
        AwesomeEnum[] list = AwesomeEnum.values();

        if (code >= 0 && code < list.length)
            return list[code];
        else
            return AwesomeEnum.UNKNOWN;
    }
}

