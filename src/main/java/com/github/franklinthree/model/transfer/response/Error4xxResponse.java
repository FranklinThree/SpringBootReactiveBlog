package com.github.franklinthree.model.transfer.response;

import com.github.franklinthree.model.transfer.ErrorInfo;
import lombok.*;

/**
 * 用户注册响应-400
 *
 * @author FranklinThree
 * @date 2023/07/06
 * @className PostUserRegister400Response
 * @see
 * @since 1.0.0
 */
@Setter
@Getter
@ToString
public class Error4xxResponse extends ErrorInfo {
    public Error4xxResponse(Integer errorCode, String errorInfo, Object given,Object expected) {
        this.setCode(errorCode);
        this.setDescription(errorInfo);
        this.setGiven(given.toString());
        this.setExpected(expected.toString());
    }
    public Error4xxResponse(Integer errorCode, String errorInfo) {
        this.setCode(errorCode);
        this.setDescription(errorInfo);
        this.setGiven("");
        this.setExpected("");
    }
}
