package com.sagiri.blog.entity;

import lombok.Data;
@Data
public class Project {

  private long projectId;
  private String projectName;
  private String projectUrl;
  private String projectSynopsis;
  private String projectSource;
}
