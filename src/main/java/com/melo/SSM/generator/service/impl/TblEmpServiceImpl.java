package com.melo.SSM.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.melo.SSM.bean.Employee;
import com.melo.SSM.generator.domain.TblEmp;
import com.melo.SSM.generator.service.TblEmpService;
import com.melo.SSM.generator.mapper.TblEmpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
*
*/
@Service
public class TblEmpServiceImpl extends ServiceImpl<TblEmpMapper, TblEmp>
implements TblEmpService{



}
