package com.manji.elastic.api.commom.serchModel;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class BrandSerchModel {
	private String queryStr=""; //关键字
	private String cate_id;//分类ID
	private String firstZm;//首字母
	//排序方式
	private Integer sort_flag;//默认不传匹配排序>>>0综合排序，1，销量排序，2，按照价格降序排序，3，按照价格升序排序,4按照商家综合排序，5按照商家销量排序
	
	@ApiModelProperty(value = "关键字ID")
	public String getQueryStr() {
		return queryStr;
	}
	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}
	@ApiModelProperty(value = "分类ID")
	public String getCate_id() {
		return cate_id;
	}
	public void setCate_id(String cate_id) {
		this.cate_id = cate_id;
	}
	@ApiModelProperty(value = "首字母。不传查询所有")
	public String getFirstZm() {
		return firstZm;
	}
	public void setFirstZm(String firstZm) {
		this.firstZm = firstZm;
	}
	@ApiModelProperty(value = "排序方式默认不传匹配排序>>>0综合排序，1，销量排序，2，按照价格降序排序，3，按照价格升序排序,4按照商家综合排序，5按照商家销量排序")
	public Integer getSort_flag() {
		return sort_flag;
	}
	public void setSort_flag(Integer sort_flag) {
		this.sort_flag = sort_flag;
	}
}
