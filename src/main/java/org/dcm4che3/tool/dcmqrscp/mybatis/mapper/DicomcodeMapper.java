package org.dcm4che3.tool.dcmqrscp.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Dicomcode;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.DicomcodeExample;

public interface DicomcodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    long countByExample(DicomcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int deleteByExample(DicomcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int insert(Dicomcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int insertSelective(Dicomcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    List<Dicomcode> selectByExample(DicomcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    Dicomcode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dicomcode record, @Param("example") DicomcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dicomcode record, @Param("example") DicomcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dicomcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomCode
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dicomcode record);
}