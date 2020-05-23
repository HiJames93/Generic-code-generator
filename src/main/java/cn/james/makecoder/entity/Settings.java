package cn.james.makecoder.entity;

import org.apache.commons.lang3.StringUtils;

public class Settings {
    private String project="example";
    private String pPackage="com.example.demo";
    private String projectComment;
    private String author;
    private String path1="com";
    private String path2="example";
    private String path3="demo";
    private String pathAll;

    public Settings(String project, String pPackage, String projectComment, String author) {
        if (StringUtils.isNotBlank(project)){
            this.project = project;
        }
        if (StringUtils.isNotBlank(pPackage)){
            this.pPackage = pPackage;
        }
        this.projectComment = projectComment;
        this.author = author;
        String[] paths = pPackage.split("\\.");
        path1 = paths[0];
        path2 = paths.length>1?paths[1]:path2;
        path3 = paths.length>2?paths[2]:path3;
        pathAll = pPackage.replaceAll(".","/");
    }
}
