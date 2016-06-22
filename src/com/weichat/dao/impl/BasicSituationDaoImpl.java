package com.weichat.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.weichat.dao.BasicSituationDao;
import com.weichat.model.Infomation;
import com.weichat.util.RandomUtils;

/**
 * 企业基本情况接口的实现类
 * 
 * 
 * 项目名称：WeiChat 类名称：BasicSituationDaoImpl.java 类描述：TODO 创建人：王晶 创建时间：2016年6月22日
 * 下午3:11:10 修改人：王晶 修改时间：2016年6月22日 下午3:11:10 修改备注：
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Repository("basicSituationDaoImpl")
public class BasicSituationDaoImpl extends BaseDaoImpl implements
		BasicSituationDao {
	private static Logger LOGGER = LoggerFactory
			.getLogger(BasicSituationDaoImpl.class);

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Boolean addBasicSituationOfEnterprise(Infomation information) {
		try {
			information.setId(RandomUtils.createIdentitySerialByUUID());
			hibernateTemplate.save(information);
		} catch (DataAccessException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage());
			return false;
		}
		return true;
	}
}
