//package com.melo.SSM.controller;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.melo.SSM.bean.Employee;
//import com.melo.SSM.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/employee")
//public class EmployeeController {
//
//    @Autowired
//    EmployeeService employeeService;
//
//    /**
//     * 查询员工数据(非json)
//     * @return
//     */
//    @RequestMapping("/emps")
//    public String getEmps(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
//
//        PageHelper.startPage(pn,1);
//        List<Employee> employees=employeeService.getAll();
//        //使用PageInfo包装
//        PageInfo pageInfo = new PageInfo(employees,1);
//        model.addAttribute("pageInfo",pageInfo);
//        model.addAttribute("s","si");
//        System.out.println(pageInfo.getList());
//        return "list";
//    }
//
//    //返回json
//    @ResponseBody
//    @RequestMapping("/uu")
//    public PageInfo getEmpsWithJson(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
//        PageHelper.startPage(pn,1);
//        List<Employee> employees=employeeService.getAll();
//        //使用PageInfo包装
//        PageInfo pageInfo = new PageInfo(employees,1);
//        return pageInfo;
//    }
//
//    //返回msg
//    @ResponseBody
//    @RequestMapping("/msg")
//    public PageInfo getEmpsWithMsg(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
//        PageHelper.startPage(pn,1);
//        List<Employee> employees=employeeService.getAll();
//        //使用PageInfo包装
//        PageInfo pageInfo = new PageInfo(employees,1);
//        return pageInfo;
//    }
//
//
//}
