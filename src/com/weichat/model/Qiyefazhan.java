package com.weichat.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��ҵ��չʵ����
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Entity
@Table(name = "qiyefazhan", catalog = "new")
public class Qiyefazhan implements java.io.Serializable {

	private static final long serialVersionUID = 3020668219783258269L;
	private Double id;
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

	public Qiyefazhan(String investment, String chanzhi, String shuishou,
			String shangTime, String xiaTime, String touTime,
			String jiushuQiye, String renYuan, String zhuyaoPro) {
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false, precision = 22, scale = 0)
	public Double getId() {
		return this.id;
	}

	public void setId(Double id) {
		this.id = id;
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