package com.itcast.service.impl;

import com.itcast.mapper.DeptMapper;
import com.itcast.mapper.EmpMapper;
import com.itcast.pojo.Dept;
import com.itcast.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * TODO 部门服务层接口
 *
 * @author Aaron.
 * @date 2023/9/23 20:01
 */
@Slf4j
@Service
public class DeptService implements IDeptService {
    @Resource//注入到ioc
    private DeptMapper deptMapper;
    @Resource
    private EmpMapper empMapper;
    /**
     * 查询部门的所有信息
     * @return
     */
    @Override
    public List<Dept> selectAllDept() {
        List<Dept> deptList = deptMapper.selectAllDept();
        return deptList;
    }

    /**
     * 根据id删除部门和该部门下的所有员工
     * @param id
     */
    @Override
    @Transactional(rollbackFor = Exception.class) //出现任何异常都会rollback
    public void deleteDeptById(Integer id) {
        log.info("删除部门id {}",id);
        deptMapper.deleteDeptById(id);
        log.info("要删除的员工部门id {}",id);
        //根据deptId删除员工
        empMapper.deleteEmpByDeptId(id);

    }

    /**
     * 添加部门
     * @param dept
     */
    @Override
    public void insertDept(Dept dept) {
        log.info("添加部门名称",dept.getName());
        dept.setCreateTime(LocalDateTime.now()); //设置添加时间
        dept.setUpdateTime(LocalDateTime.now()); //设置更新时间
        deptMapper.insertDept(dept);

    }

    /**
     * 根据id查询部门
     * @param id
     * @return
     */

    @Override
    public Dept selectById(Integer id) {
        log.info("查询部门id为{}",id);
       Dept dept = deptMapper.selectById(id);
        return dept;
    }

    @Override
    public void updateDept(Dept dept) {
        log.info("根据id修改部门",dept.getId());
        dept.setUpdateTime(LocalDateTime.now());//设置更新时间
        deptMapper.updateDept(dept);
    }
}
