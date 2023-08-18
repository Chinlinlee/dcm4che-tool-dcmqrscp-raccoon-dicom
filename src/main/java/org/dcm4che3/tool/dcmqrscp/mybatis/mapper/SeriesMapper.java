package org.dcm4che3.tool.dcmqrscp.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Series;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.SeriesExample;

public interface SeriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    long countByExample(SeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int deleteByExample(SeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String x0020000e);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int insert(Series record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int insertSelective(Series record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    List<Series> selectByExample(SeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    Series selectByPrimaryKey(String x0020000e);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Series record, @Param("example") SeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Series record, @Param("example") SeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Series record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Series
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Series record);
}