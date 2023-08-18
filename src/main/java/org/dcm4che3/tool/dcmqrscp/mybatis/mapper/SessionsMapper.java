package org.dcm4che3.tool.dcmqrscp.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Sessions;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.SessionsExample;

public interface SessionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    long countByExample(SessionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int deleteByExample(SessionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int insert(Sessions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int insertSelective(Sessions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    List<Sessions> selectByExample(SessionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    Sessions selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Sessions record, @Param("example") SessionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Sessions record, @Param("example") SessionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sessions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.Sessions
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sessions record);
}