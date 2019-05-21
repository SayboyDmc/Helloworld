package cn.bdqn.hotevnt.mapper;

import cn.bdqn.hotevnt.model.Hotevents;
import cn.bdqn.hotevnt.model.HoteventsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoteventsMapper {
    long countByExample(HoteventsExample example);

    int deleteByExample(HoteventsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hotevents record);

    int insertSelective(Hotevents record);

    List<Hotevents> selectByExample(HoteventsExample example);

    Hotevents selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hotevents record, @Param("example") HoteventsExample example);

    int updateByExample(@Param("record") Hotevents record, @Param("example") HoteventsExample example);

    int updateByPrimaryKeySelective(Hotevents record);

    int updateByPrimaryKey(Hotevents record);
}