package com.entity.view;

import com.entity.ZujiedingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租借订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
@TableName("zujiedingdan")
public class ZujiedingdanView  extends ZujiedingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZujiedingdanView(){
	}
 
 	public ZujiedingdanView(ZujiedingdanEntity zujiedingdanEntity){
 	try {
			BeanUtils.copyProperties(this, zujiedingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
