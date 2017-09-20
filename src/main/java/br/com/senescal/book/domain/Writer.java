package br.com.senescal.book.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "writer")
public class Writer {

    @Id
    @GeneratedValue
    int id;

    String name;

    @OneToMany(mappedBy = "writer")
    List<Book> books;
}
