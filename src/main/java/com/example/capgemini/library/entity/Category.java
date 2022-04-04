package com.example.capgemini.library.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "category")
public class Category {

    @Column(name = "id_category")
    @Id
    private Integer idCategory;

    @Column(name = "name")
    private String name;

    @Column(name = "books")
    @OneToMany(mappedBy = "category",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Book> books;
}
