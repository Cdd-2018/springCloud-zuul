package com.chendongdong.zuul.ErrorUtils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.aspectj.apache.bcel.classfile.Code;

@Getter
@Setter
@ToString
public class error {
    private Integer code;
    private String message;

    public error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
