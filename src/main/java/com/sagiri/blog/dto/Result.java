package com.sagiri.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用的返回结果封装类。
 * @param <T> 响应数据的类型
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {

    /**
     * 状态码：0 表示成功，1 表示失败。
     */
    private Integer code;

    /**
     * 提示信息，用于返回操作结果的描述。
     */
    private String message;

    /**
     * 响应数据，类型为泛型 T。
     */
    private T data;

    /**
     * 创建一个成功的 Result 对象，并包含数据。
     * @param data 响应数据
     * @param <E> 数据的类型
     * @return 包含成功状态码和数据的 Result 对象
     */
    public static <E> Result<E> success(E data) {
        return new Result<>(0, "操作成功", data);
    }

    /**
     * 创建一个成功的 Result 对象，不包含数据。
     * @return 包含成功状态码的 Result 对象
     */
    public static Result<Void> success() {
        return new Result<>(0, "操作成功", null);
    }

    /**
     * 创建一个失败的 Result 对象，并包含错误信息。
     * @param message 错误信息
     * @return 包含失败状态码和错误信息的 Result 对象
     */
    public static Result<Void> error(String message) {
        return new Result<>(1, message, null);
    }
}
