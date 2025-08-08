package WiproMockito1;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StudentServiceTest {

    @Test
    public void testGetStudentById() {
   
        StudentRepository mockRepo = mock(StudentRepository.class);

   
        when(mockRepo.findById(1)).thenReturn(new Student(1, "Ana"));

   
        StudentService service = new StudentService(mockRepo);

      
        assertEquals("Ana", service.getStudentById(1));

     
        verify(mockRepo).findById(1);
    }
}
