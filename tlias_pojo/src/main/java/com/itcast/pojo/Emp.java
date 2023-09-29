package com.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * TODO 员工属性
 *
 * @author Aaron.
 * @date 2023/9/23 21:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
   private Integer id; //员工id
   private String username; // 用户名
   private String password; // 密码
   private String name; //姓名
   private Integer gender; // 性别
   private String image; // 头像
   private Integer job; //职位
   private LocalDate entrydate; // 入职时间
   private Integer deptId; //部门id
   private LocalDateTime createTime; //创建时间
   private LocalDateTime updateTime; //更新时间

}
