package com.itcast.controller;


import com.itcast.pojo.Dept;
import com.itcast.pojo.Result;
import com.itcast.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * TODO 部门控制层
 *
 * @author Aaron.
 * @date 2023/9/23 19:49
 */
@Slf4j
@RestController
public class DeptController {
    @Resource//注入到ioc中
    private IDeptService iDeptService;

    /**
     * 查询部门的所有信息
     * @return data ：List<Dept>
     */
    @GetMapping ("/depts")
    public Result selectAllDept(){
        log.info("查询部门的所有信息");
        List<Dept> deptList = iDeptService.selectAllDept();
        return Result.success(deptList);
    }

    /**
     * 根据id删除部门
     * @param id 部门id
     * @return data ：null
     */
    @DeleteMapping("/depts/{id}")
    public Result deleteDeptById(@PathVariable Integer id){
        log.info("删除部门id为{}", id );
        iDeptService.deleteDeptById(id);
        return Result.success();
    }

    /**
     * 添加部门
     * @param dept
     * @return data ： null
     */
    @PostMapping("/depts")
    public Result insertDept(@RequestBody Dept dept){
        log.info("添加部门");
        iDeptService.insertDept(dept);
        return Result.success();
    }

    /**
     * 根据id查询部门
     * @param id
     * @return data ：Dept(对象)
     */
    @GetMapping("/depts/{id}")
    public Result selectById(@PathVariable Integer id){
        log.info("根据id查询部门", id);
       Dept dept =  iDeptService.selectById(id);
       return Result.success(dept);
    }

    /**
     * 修改部门
     * @param dept
     * @return data ：null
     */
    @PutMapping("/depts")
    public Result updateDept(@RequestBody Dept dept){
        log.info("修改部门");
        iDeptService.updateDept(dept);
        return Result.success();

    }

}
