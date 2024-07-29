package com.sagiri.blog.entity;

import lombok.Data;

/**
 * 表示common表中的一条记录
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 */
@Data
public class Common {

  /**
   * 问题的唯一标识符
   */
  private Integer id;

  /**
   * 问题描述
   */
  private String problem;

  /**
   * 问题的答案
   */
  private String answer;
}
