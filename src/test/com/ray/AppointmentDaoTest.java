package com.ray;

        import com.ray.dao.AppointmentDao;
        import com.ray.entity.Appointment;
        import org.junit.Test;
        import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ray
 * @date 2018/5/2 0002
 */
public class AppointmentDaoTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment(){
        long bookId = 1000;
        long studentId = 1234567890L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert= " + insert);
    }

    @Test
    public void testQueryByKeyWithBook(){
        long bookId = 1000;
        long studentId = 1234567890L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}
