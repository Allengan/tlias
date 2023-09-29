package com.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * TODO 部门
 *
 * @author Aaron.
 * @date 2023/9/23 19:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer id; // 部门id
    private String name; // 部门名称
    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
}
