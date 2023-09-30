package com.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * TODO 类描述
 *
 * @author Aaron.
 * @date 2023/9/30 16:55
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperateLog {
   private Integer id;
   private Integer operateUser;
   private LocalDateTime operateTime;
   private String className;
   private String methodName;
   private String methodParams;
   private String returnValue;
   private long costTime;

}
