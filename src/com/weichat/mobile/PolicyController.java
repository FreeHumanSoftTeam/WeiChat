package com.weichat.mobile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.weichat.model.Youhuizhengce;
import com.weichat.service.PolicyService;
import com.weichat.util.DateTimeUtils;

/**
 * 
 * 政策Controller
 * 
 * 
 * 项目名称：WeiChat 类名称：PolicyController.java 类描述：TODO 创建人：李帅康 创建时间：上午12:34:21
 * 修改人：王晶 修改时间：下午16:03:01 修改备注：
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Controller("policyControllerMobile")
@RequestMapping(value = "/policymobile")
public class PolicyController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(PolicyController.class);

	@Resource(name = "policyServiceImpl")
	private PolicyService policyService;

	/**
	 * 添加部分主页跳转.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/frame", method = RequestMethod.GET)
	public String addIndex(ModelMap modelMap) {
		LOGGER.info("跳转到frame页面成功！"
				+ DateTimeUtils
						.getNowDateOfStringFormatUsingDateTimeTemplateOne());
		return "/add/common/frame";
	}

	/**
	 * 优惠政策页面跳转.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/policy", method = RequestMethod.GET)
	public String policy(ModelMap modelMap) {
		return "/add/enterprise_basic_situation/policy";
	}
	
	/**
	 * 手机端优惠政策详情
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/policyshow", method = RequestMethod.GET)
	public String policyMobileShow(HttpServletRequest request, ModelMap modelMap) {
		Double id = Double.parseDouble(request.getParameter("id"));
		modelMap.addAttribute("policy", policyService.findYouhuisById(id));
		modelMap.addAttribute("id", id);
		return "/mobile/update/enterprise_update_situation/policy";
	}
	

	/**
	 * 添加优惠政策情况.
	 * 
	 * @param modelMap
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addPolicy", method = RequestMethod.POST)
	public void addPolicy(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,
			@ModelAttribute Youhuizhengce youhuizhengce) throws IOException {
		StringBuffer sbResult = new StringBuffer();

		if (policyService.addNewPolicyService(
				youhuizhengce,youhuizhengce.getInfomation().getId())) {
			sbResult.append("<script>alert('恭喜！数据已成功录入。'); parent.location.href='../company/mobilelist.jhtml';</script>");
		} else {
			sbResult.append("<script>alert('非常抱歉，录入数据失败！请重试您的操作。'); history.go(-1);</script>");
		}

		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(sbResult.toString());
	}
	/**
	 * 删除优惠政策条目
	 * @param request
	 * @param response
	 * @param modelMap
	 * @param youhuizhengce
	 * @throws IOException
	 */
	@RequestMapping(value = "/delPolicy", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> delPolicy(String enterpriseSituationId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (policyService.delPolicy(Double.parseDouble(enterpriseSituationId))) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "failed");
		}
		return resultMap;
	}
	/**
	 * 手机端修改优惠政策情况
	 * 
	 * @param response
	 * @param Youhuizhengce
	 * @throws IOException
	 */
	@RequestMapping(value = "/policyupdate", method = RequestMethod.POST)
	public void updateAnquanshengchan(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute Youhuizhengce youhuizhengce) throws IOException {
		LOGGER.info("手机端优惠政策情况修改!"
				+ DateTimeUtils
						.getNowDateOfStringFormatUsingDateTimeTemplateOne());
		StringBuffer sbResult = new StringBuffer();
		// 判断企业安全是否存在
		if (policyService.checkYouhuizhengce(youhuizhengce.getInfomation().getId())) {// 存在
			if (policyService.updateYouhuizhengce(youhuizhengce)) {
				sbResult.append("<script>alert('恭喜！数据已成功修改。'); parent.location.href='../company/mobilelist.jhtml';</script>");
			} else {
				sbResult.append("<script>alert('非常抱歉，修改数据失败！请重试您的操作。'); parent.location.href='../company/mobilelist.jhtml'</script>");
			}
		} else {// 不存在
			if (policyService.addNewPolicyService(youhuizhengce, youhuizhengce.getInfomation().getId())){
				sbResult.append("<script>alert('恭喜！数据已成功录入。'); parent.location.href='../company/mobilelist.jhtml';</script>");
			} else {
				sbResult.append("<script>alert('非常抱歉，录入数据失败！请重试您的操作。'); parent.location.href='../company/mobilelist.jhtml'</script>");
			}
		}
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write(sbResult.toString());
	}

	
}