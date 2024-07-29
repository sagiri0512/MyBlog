package com.sagiri.blog.entity;

import lombok.Data;

/**
 * 项目实体类，表示项目表中的一条记录
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 */
@Data
public class Project {

  /**
   * 项目的唯一标识符
   */
  private Integer projectId;

  /**
   * 项目的名称
   */
  private String projectName;

  /**
   * 项目的URL
   */
  private String projectUrl;

  /**
   * 项目的简介
   */
  private String projectSynopsis;

  /**
   * 项目的源码
   */
  private String projectSource;
}
