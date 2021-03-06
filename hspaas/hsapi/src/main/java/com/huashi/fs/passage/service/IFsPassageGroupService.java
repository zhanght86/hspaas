//*********************************************************************
//系统名称：DBRDR
//Copyright(C)2000-2016 NARI Information and Communication Technology 
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：杨猛 $权重：100%#
//版本                                 日期                             作者               变更记录
//DBRDR-V1.000         2016年8月25日       杨猛　     新建
//*********************************************************************
package com.huashi.fs.passage.service;

import java.util.List;

import com.huashi.common.vo.BossPaginationVo;
import com.huashi.fs.passage.domain.FluxPassageGroup;

/**
 * @author ym
 * @created_at 2016年8月25日下午5:22:42
 */
public interface IFsPassageGroupService {

	
	boolean create(FluxPassageGroup group);
	
	boolean update(FluxPassageGroup group);
	
	boolean deleteById(int id);
	
	BossPaginationVo<FluxPassageGroup> findPage(int pageNum,String keyword);
	
	FluxPassageGroup findById(int id);
	
	List<FluxPassageGroup> findAll();
}
