package com.codecool.hogwartshouses.model;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Room {
    private Long id;
    private Integer capacity;
}
