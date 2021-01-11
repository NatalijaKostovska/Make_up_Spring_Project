package makeup.example.demo.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idproduct", nullable=false, updatable=false)
    private Long idproduct;
    private String nameproduct;
    @ManyToOne
    private Category category;

}
