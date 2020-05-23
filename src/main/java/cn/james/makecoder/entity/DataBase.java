package cn.james.makecoder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataBase {
    private static String mysqlUrl = "jdbc:mysql://[ip]:[port]/[db]!useUnicode=true&amp;characterEncoding=UTF8";
    private static String oracleUrl = "jdbc:oracle:thin:@[ip]:[port]:[db]";

    private String dbType;
    private String userName;
    private String passWord;

    private String driver;
    private String url;

    private String ip;
    private String port;
    private String db;

    public DataBase(String dbType) {
        this.dbType = dbType;
        this.ip="127.0.0.1";
        this.port="3306";
        this.db="";
    }

    public DataBase(String dbType, String db) {
        this.dbType = dbType;
        this.ip="127.0.0.1";
        this.port="3306";
        this.db=db;
    }

    public DataBase(String dbType, String ip, String port, String db) {
        this.dbType = dbType;
        if ("MYSQL".endsWith(dbType.toUpperCase())){
            this.driver="com.mysql.cj.jdbc.Driver";
            this.url=mysqlUrl.replace("[ip]",ip).replace("[port]",port).replace("[db]",db);
        }else{
            this.driver="oracle.jdbc.driver.OracleDriver";
            this.url=oracleUrl.replace("[ip]",ip).replace("[port]",port).replace("[db]",db);
        }
    }
}
