package org.dcm4che3.tool.dcmqrscp.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Operatorsname;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.OperatorsnameExample;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.OperatorsnameKey;

public interface OperatorsnameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    long countByExample(OperatorsnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int deleteByExample(OperatorsnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(OperatorsnameKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int insert(Operatorsname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int insertSelective(Operatorsname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    List<Operatorsname> selectByExample(OperatorsnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    Operatorsname selectByPrimaryKey(OperatorsnameKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Operatorsname record, @Param("example") OperatorsnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Operatorsname record, @Param("example") OperatorsnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Operatorsname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.OperatorsName
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Operatorsname record);
}