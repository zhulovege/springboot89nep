package com.dao;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NewsVO;
import com.entity.view.NewsView;


/**
 * 房屋租赁公告
 * 
 * @author 
 * @email 
 * @date 2021-05-05 14:32:36
 * 由于BaseMapper已经集成了基础的增删改查方法，这里对应的mapper.xml也是不用写的
 */
public interface NewsDao extends BaseMapper<NewsEntity> {
//	wrapper实体对象封装操作类（可以为 null）
	List<NewsVO> selectListVO(@Param("ew") Wrapper<NewsEntity> wrapper);
	
	NewsVO selectVO(@Param("ew") Wrapper<NewsEntity> wrapper);
	
	List<NewsView> selectListView(@Param("ew") Wrapper<NewsEntity> wrapper);

	List<NewsView> selectListView(Pagination page,@Param("ew") Wrapper<NewsEntity> wrapper);
	
	NewsView selectView(@Param("ew") Wrapper<NewsEntity> wrapper);
	
}
