package com.codingbz.Library.Management.System.Entity;

import com.codingbz.Library.Management.System.Enum.CardStatus;
import com.codingbz.Library.Management.System.Enum.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_info")    // create a table by table name 'student'

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id       // @Id annotation set Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")   // set column name
    private int id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    private String email;

    private int mobNo;


   // @Getter  -->   Create getter method internally by lombok
   // @Setter  -->   Create setter method internally by lombok.

    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    LibraryCard card;


}
