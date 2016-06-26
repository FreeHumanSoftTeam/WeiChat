package com.weichat.mobile;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weichat.service.UserService;

/**
 * ������ҳController
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Controller("addIndexControllerMobile")
@RequestMapping(value = "/addindexmobile")
public class AddIndexController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(AddIndexController.class);

	@Resource(name = "userServiceImpl")
	private UserService userService;

	/**
	 * ����ҵ�񲿷���ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/frame", method = RequestMethod.GET)
	public String addIndex(ModelMap modelMap) {
		return "/mobile/add/common/frame";
	}

	/**
	 * ��ҵ���������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/ebs", method = RequestMethod.GET)
	public String enterpriseBasicSituationIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/index";
	}

	/**
	 * �Ż����������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/policy", method = RequestMethod.GET)
	public String preferentialPolicyIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/policy";
	}

	/**
	 * ���������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/development", method = RequestMethod.GET)
	public String developmentIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/development";
	}

	/**
	 * ��ȫ������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/safety", method = RequestMethod.GET)
	public String safetyIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/safety";
	}

	/**
	 * ��ҵ��չ��ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/expand", method = RequestMethod.GET)
	public String expandIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/expand";
	}

	/**
	 * ��ҵ������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/server", method = RequestMethod.GET)
	public String serverIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/server";
	}

	/**
	 * ��ҵ������ҳ��ת.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/party", method = RequestMethod.GET)
	public String partyIndex(ModelMap modelMap) {
		return "/mobile/add/enterprise_basic_situation/party";
	}
}