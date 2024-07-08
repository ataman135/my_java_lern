package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Human {
    private String name, genger;
    private int age;
    private double weight, height;
}
