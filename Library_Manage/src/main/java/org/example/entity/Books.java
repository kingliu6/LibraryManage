package org.example.entity;

import lombok.Data;

@Data
public class Books  {
    int bid;
    final String title;
    final String desc;
    final double price;
}
