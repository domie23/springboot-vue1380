package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YangzhiquyuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 养殖区域留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yangzhiquyu_liuyan")
public class YangzhiquyuLiuyanView extends YangzhiquyuLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 养殖区域
		/**
		* 区域名称
		*/

		@ColumnInfo(comment="区域名称",type="varchar(200)")
		private String yangzhiquyuName;
		/**
		* 养殖区域编号
		*/

		@ColumnInfo(comment="养殖区域编号",type="varchar(200)")
		private String yangzhiquyuUuidNumber;
		/**
		* 养殖区域照片
		*/

		@ColumnInfo(comment="养殖区域照片",type="varchar(200)")
		private String yangzhiquyuPhoto;
		/**
		* 养殖区域地点
		*/

		@ColumnInfo(comment="养殖区域地点",type="varchar(200)")
		private String yangzhiquyuAddress;
		/**
		* 养殖区域类型
		*/
		@ColumnInfo(comment="养殖区域类型",type="int(11)")
		private Integer yangzhiquyuTypes;
			/**
			* 养殖区域类型的值
			*/
			@ColumnInfo(comment="养殖区域类型的字典表值",type="varchar(200)")
			private String yangzhiquyuValue;
		/**
		* 养殖区域介绍
		*/

		@ColumnInfo(comment="养殖区域介绍",type="longtext")
		private String yangzhiquyuContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public YangzhiquyuLiuyanView() {

	}

	public YangzhiquyuLiuyanView(YangzhiquyuLiuyanEntity yangzhiquyuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yangzhiquyuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 养殖区域

		/**
		* 获取： 区域名称
		*/
		public String getYangzhiquyuName() {
			return yangzhiquyuName;
		}
		/**
		* 设置： 区域名称
		*/
		public void setYangzhiquyuName(String yangzhiquyuName) {
			this.yangzhiquyuName = yangzhiquyuName;
		}

		/**
		* 获取： 养殖区域编号
		*/
		public String getYangzhiquyuUuidNumber() {
			return yangzhiquyuUuidNumber;
		}
		/**
		* 设置： 养殖区域编号
		*/
		public void setYangzhiquyuUuidNumber(String yangzhiquyuUuidNumber) {
			this.yangzhiquyuUuidNumber = yangzhiquyuUuidNumber;
		}

		/**
		* 获取： 养殖区域照片
		*/
		public String getYangzhiquyuPhoto() {
			return yangzhiquyuPhoto;
		}
		/**
		* 设置： 养殖区域照片
		*/
		public void setYangzhiquyuPhoto(String yangzhiquyuPhoto) {
			this.yangzhiquyuPhoto = yangzhiquyuPhoto;
		}

		/**
		* 获取： 养殖区域地点
		*/
		public String getYangzhiquyuAddress() {
			return yangzhiquyuAddress;
		}
		/**
		* 设置： 养殖区域地点
		*/
		public void setYangzhiquyuAddress(String yangzhiquyuAddress) {
			this.yangzhiquyuAddress = yangzhiquyuAddress;
		}
		/**
		* 获取： 养殖区域类型
		*/
		public Integer getYangzhiquyuTypes() {
			return yangzhiquyuTypes;
		}
		/**
		* 设置： 养殖区域类型
		*/
		public void setYangzhiquyuTypes(Integer yangzhiquyuTypes) {
			this.yangzhiquyuTypes = yangzhiquyuTypes;
		}


			/**
			* 获取： 养殖区域类型的值
			*/
			public String getYangzhiquyuValue() {
				return yangzhiquyuValue;
			}
			/**
			* 设置： 养殖区域类型的值
			*/
			public void setYangzhiquyuValue(String yangzhiquyuValue) {
				this.yangzhiquyuValue = yangzhiquyuValue;
			}

		/**
		* 获取： 养殖区域介绍
		*/
		public String getYangzhiquyuContent() {
			return yangzhiquyuContent;
		}
		/**
		* 设置： 养殖区域介绍
		*/
		public void setYangzhiquyuContent(String yangzhiquyuContent) {
			this.yangzhiquyuContent = yangzhiquyuContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "YangzhiquyuLiuyanView{" +
			", yangzhiquyuName=" + yangzhiquyuName +
			", yangzhiquyuUuidNumber=" + yangzhiquyuUuidNumber +
			", yangzhiquyuPhoto=" + yangzhiquyuPhoto +
			", yangzhiquyuAddress=" + yangzhiquyuAddress +
			", yangzhiquyuContent=" + yangzhiquyuContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
