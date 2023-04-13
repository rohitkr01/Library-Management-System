package com.codingbz.Library.Management.System.Service;

import com.codingbz.Library.Management.System.Entity.LibraryCard;
import com.codingbz.Library.Management.System.Entity.Student;
import com.codingbz.Library.Management.System.Enum.CardStatus;
import com.codingbz.Library.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/02/2023");
        card.setStudent(student);
        student.setCard(card);   // set the card attribute in student

        studentRepository.save(student);
    }


}
