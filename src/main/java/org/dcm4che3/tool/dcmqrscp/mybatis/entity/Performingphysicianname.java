package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.Date;

public class Performingphysicianname extends PerformingphysiciannameKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.PerformingPhysicianName.createdAt
     *
     * @mbg.generated
     */
    private Date createdat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.PerformingPhysicianName.updatedAt
     *
     * @mbg.generated
     */
    private Date updatedat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.PerformingPhysicianName.createdAt
     *
     * @return the value of public.PerformingPhysicianName.createdAt
     *
     * @mbg.generated
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.PerformingPhysicianName.createdAt
     *
     * @param createdat the value for public.PerformingPhysicianName.createdAt
     *
     * @mbg.generated
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.PerformingPhysicianName.updatedAt
     *
     * @return the value of public.PerformingPhysicianName.updatedAt
     *
     * @mbg.generated
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.PerformingPhysicianName.updatedAt
     *
     * @param updatedat the value for public.PerformingPhysicianName.updatedAt
     *
     * @mbg.generated
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}