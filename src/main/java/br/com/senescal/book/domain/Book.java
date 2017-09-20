package br.com.senescal.book.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    int id;


    String name;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    Writer writer;

}
