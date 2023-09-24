package com.company.model;

import java.io.Serializable;

public record ChairRecord(int height, int width, String brand, String color) implements Serializable {
}
