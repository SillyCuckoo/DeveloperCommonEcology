package cn.yhm.developer.ecology.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 结果抽象响应类
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-10-17 07:23:46
 */
@Setter
@Getter
public abstract class ResultResponse<T> implements EcologyResponse {

    /**
     * 结果
     */
    @JsonProperty(value = "result")
    private T result;
}
