package com.weichat.mobile;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weichat.model.Infomation;
import com.weichat.service.BasicSituationService;

/**
 * 企业基本情况Controller
 * 
 * 
 * 项目名称：WeiChat 类名称：BasicSituationController.java 类描述：TODO 创建人：王晶
 * 创建时间：2016年6月22日 下午3:05:43 修改人：王晶 修改时间：2016年6月22日 下午3:05:43 修改备注：
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Controller("basicSituationControllerMobile")
@RequestMapping(value = "/basicSituationMobile")
public class BasicSituationController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(AddIndexController.class);

	@Resource(name = "basicSituationServiceImpl")
	private BasicSituationService basicSituationService;

	/**
	 * 添加企业基本情况.
	 * 
	 * @param modelMap
	 * @param infomation
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void add(HttpServletRequest request, HttpServletResponse response,
			ModelMap modelMap, @ModelAttribute Infomation infomation)
			throws IOException {
		StringBuffer sbResult = new StringBuffer();
		String mcoid=(String)request.getSession().getAttribute("mcoid");
		infomation.setMcoid(mcoid);//设置mcoid
		if (basicSituationService
				.addBasicSituationOfEnterpriseService(infomation) != -1.0) {
			request.getSession().setAttribute("enterpriseId",
					infomation.getId());
			sbResult.append("<script>alert('恭喜！数据已成功录入。'); parent.location.href='../company/mobilelist.jhtml';</script>");
		} else {
			sbResult.append("<script>alert('非常抱歉，录入数据失败！请重试您的操作。'); history.go(-1);</script>");
		}

		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(sbResult.toString());
	}
}
