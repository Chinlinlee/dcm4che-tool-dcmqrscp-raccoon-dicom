package org.dcm4che3.tool.dcmqrscp;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.SqlSession;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.Patient;
import org.dcm4che3.tool.dcmqrscp.mybatis.entity.PatientExample;
import org.dcm4che3.tool.dcmqrscp.mybatis.mapper.PatientMapper;

public class SqlReader {
    Cursor<Patient> findPatientRecord() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlConnector.openSqlSession();
            PatientMapper patientMapper = sqlSession.getMapper(PatientMapper.class);

            PatientExample patientExample = new PatientExample();
            patientExample.createCriteria();

            return patientMapper.selectByExampleCursor(patientExample);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
