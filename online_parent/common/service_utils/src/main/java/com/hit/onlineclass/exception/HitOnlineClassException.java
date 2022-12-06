package com.hit.onlineclass.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HitOnlineClassException extends RuntimeException {
    private Integer code;
    private String msg;
}
