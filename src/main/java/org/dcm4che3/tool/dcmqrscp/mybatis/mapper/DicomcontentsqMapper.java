package org.dcm4che3.tool.dcmqrscp.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Dicomcontentsq;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.DicomcontentsqExample;

public interface DicomcontentsqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    long countByExample(DicomcontentsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int deleteByExample(DicomcontentsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int insert(Dicomcontentsq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int insertSelective(Dicomcontentsq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    List<Dicomcontentsq> selectByExample(DicomcontentsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    Dicomcontentsq selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dicomcontentsq record, @Param("example") DicomcontentsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dicomcontentsq record, @Param("example") DicomcontentsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dicomcontentsq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dicomcontentsq record);
}