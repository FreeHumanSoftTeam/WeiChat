package com.weichat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 企业发展实体类
 * 
 * 
 * 项目名称：WeiChat 类名称：Qiyefazhan.java 类描述：TODO 创建人：王晶 创建时间：2016年6月22日 下午3:54:13
 * 修改人：王晶 修改时间：2016年6月22日 下午3:54:13 修改备注：
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Entity
@Table(name = "qiyefazhan", catalog = "new")
public class Qiyefazhan implements java.io.Serializable {
	private static final long serialVersionUID = 3756156090935771980L;

	private Double id;
	private Infomation infomation;
	private String investment;
	private String chanzhi;
	private String shuishou;
	private String shangTime;
	private String xiaTime;
	private String touTime;
	private String jiushuQiye;
	private String renYuan;
	private String zhuyaoPro;

	public Qiyefazhan() {
	}

	public Qiyefazhan(Infomation infomation, String investment, String chanzhi,
			String shuishou, String shangTime, String xiaTime, String touTime,
			String jiushuQiye, String renYuan, String zhuyaoPro) {
		this.infomation = infomation;
		this.investment = investment;
		this.chanzhi = chanzhi;
		this.shuishou = shuishou;
		this.shangTime = shangTime;
		this.xiaTime = xiaTime;
		this.touTime = touTime;
		this.jiushuQiye = jiushuQiye;
		this.renYuan = renYuan;
		this.zhuyaoPro = zhuyaoPro;
	}

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, precision = 22, scale = 0)
	public Double getId() {
		return this.id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "infomationid")
	public Infomation getInfomation() {
		return this.infomation;
	}

	public void setInfomation(Infomation infomation) {
		this.infomation = infomation;
	}

	@Column(name = "investment", length = 600)
	public String getInvestment() {
		return this.investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	@Column(name = "chanzhi", length = 600)
	public String getChanzhi() {
		return this.chanzhi;
	}

	public void setChanzhi(String chanzhi) {
		this.chanzhi = chanzhi;
	}

	@Column(name = "shuishou", length = 600)
	public String getShuishou() {
		return this.shuishou;
	}

	public void setShuishou(String shuishou) {
		this.shuishou = shuishou;
	}

	@Column(name = "shangTime", length = 600)
	public String getShangTime() {
		return this.shangTime;
	}

	public void setShangTime(String shangTime) {
		this.shangTime = shangTime;
	}

	@Column(name = "xiaTime", length = 600)
	public String getXiaTime() {
		return this.xiaTime;
	}

	public void setXiaTime(String xiaTime) {
		this.xiaTime = xiaTime;
	}

	@Column(name = "touTime", length = 600)
	public String getTouTime() {
		return this.touTime;
	}

	public void setTouTime(String touTime) {
		this.touTime = touTime;
	}

	@Column(name = "jiushuQiye", length = 600)
	public String getJiushuQiye() {
		return this.jiushuQiye;
	}

	public void setJiushuQiye(String jiushuQiye) {
		this.jiushuQiye = jiushuQiye;
	}

	@Column(name = "renYuan", length = 600)
	public String getRenYuan() {
		return this.renYuan;
	}

	public void setRenYuan(String renYuan) {
		this.renYuan = renYuan;
	}

	@Column(name = "zhuyaoPro", length = 600)
	public String getZhuyaoPro() {
		return this.zhuyaoPro;
	}

	public void setZhuyaoPro(String zhuyaoPro) {
		this.zhuyaoPro = zhuyaoPro;
	}

}