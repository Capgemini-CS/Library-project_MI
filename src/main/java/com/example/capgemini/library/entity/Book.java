package com.example.capgemini.library.entity;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book")
public class Book {

    @Column(name = "id_book")
    @Id
    private int idBook;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "author")
    private String author;

    @ManyToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

}
