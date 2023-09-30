package com.itcast.controller;

import com.itcast.annotation.Log;
import com.itcast.pojo.Emp;
import com.itcast.pojo.PageBean;
import com.itcast.pojo.Result;
import com.itcast.service.IEmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;

/**
 * TODO 员工控制层
 *
 * @author Aaron.
 * @date 2023/9/23 22:07
 */
@Slf4j
@RestController
public class EmpController {
    @Resource
    private IEmpService iEmpService;

    /*    *
         *  原始方法分页查询员工信息
         * @param page 分页查询的页码
         * @param pageSize 每页查询的记录数
         * @return data ： PageBean

        @GetMapping("/emps")
        public Result selectAllEmp(@RequestParam(defaultValue = "1") Integer page
                , @RequestParam(defaultValue = "10") Integer pageSize) {
            log.info("分页查询参数 {},{}",page,pageSize);
           PageBean pageBean =  iEmpService.selectAllEmp(page,pageSize);
           return Result.success(pageBean);
        }
        */

    /**
     * 使用插件Pagehelper分页查询
     *
     * @param page
     * @param pageSize
     * @return data ：pageBean
     */
    //@GetMapping("/emps")
    public Result selectAllEmp(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("分页查询参数 {},{}", page, pageSize);
        PageBean pageBean = iEmpService.selectAllEmp(page, pageSize);
        return Result.success(pageBean);
    }

    /**
     * 模糊查询
     *
     * @param name
     * @param gender
     * @param begin
     * @param end
     * @param page
     * @param pageSize
     * @return data : pageBean
     */
    @GetMapping("/emps")
    public Result fuzzyQuery(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer pageSize, String name, Integer gender, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("模糊分页查询,{},{},{},{},{},{}", name, gender, begin, end, page, pageSize);
        PageBean pageBean = iEmpService.fuzzyQuery(name, gender, begin, end, page, pageSize);
        return Result.success(pageBean);
    }

    /**
     * 根据id删除员工
     * @param ids
     * @return data:null
     */
    @Log
    @DeleteMapping("/emps/{ids}")
    public Result deleteEmpByIds(@PathVariable Integer[] ids){
        log.info("根据id删除员工{}",ids);
        iEmpService.deleteEmpByIds(ids);
        return Result.success();
    }

    /**
     *  添加员工
     * @param emp
     * @return data:null
     */
    @Log
    @PostMapping("/emps")
    public Result insertEmp(@RequestBody Emp emp){
        log.info("添加员工 {}" ,emp);
        iEmpService.insertEmp(emp);
       return Result.success();
    }

    /**
     * 根据id查询员工
     * @param id
     * @return data:emp
     */
    @GetMapping("/emps/{id}")
    public Result selectEmpById(@PathVariable Integer id){
        log.info("根据id查询{}",id);
        Emp emp = iEmpService.selectEmpById(id);
        return Result.success(emp);
    }

    /**
     * 修改员工信息
     * @param emp
     * @return data:null
     */
    @Log
    @PutMapping("/emps")
    public Result updateEmp(@RequestBody Emp emp){
        log.info("修改员工信息{}",emp);
        iEmpService.updateEmp(emp);
        return Result.success();
    }
}
