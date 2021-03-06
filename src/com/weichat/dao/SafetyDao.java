package com.weichat.dao;

import com.weichat.model.Anquanshengchan;

/**
 * 安全生产接口
 * 
 * 
 * 项目名称：WeiChat 类名称：SafetyDao.java 类描述：TODO 创建人：李帅康 创建时间：下午4:17:06 修改人：李帅康 修改时间：
 * 下午4:17:06 修改备注：
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
public interface SafetyDao extends BaseDao<Anquanshengchan, Double> {
	Anquanshengchan findAnquanshengchanById(Double id);
	
	Boolean updateAnquanshengchan(Anquanshengchan anquanshengchan);
	
	Boolean checkAnquanshengchan(Double id);
	
	Boolean addAnquanshengchan(Anquanshengchan anquanshengchan);
}
