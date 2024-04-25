package com.dao;

import com.entity.FangwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuxinxiVO;
import com.entity.view.FangwuxinxiView;


/**
 * 房屋信息
 * 
 * @author 
 * @email 
 * @date 2021-05-05 14:32:36
 * 没有用@Mapper注解，已在启动类使用@MapperScan注解扫描一次性注入。可用.XML配置代替@Mapper
 * dao接口里是抽象方法
 *
 */
public interface FangwuxinxiDao extends BaseMapper<FangwuxinxiEntity> {
//	接口绑定解决多参数的传递，一般使用@Param， @Param的作用就是给参数命名
//	抽象方法设计。实体类名加XML的ID
	List<FangwuxinxiVO> selectListVO(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
	
	FangwuxinxiVO selectVO(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
	
	List<FangwuxinxiView> selectListView(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

	List<FangwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
	
	FangwuxinxiView selectView(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
	
}
