package com.edu.metis.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Emre Dinç
 */
@Getter
@RequiredArgsConstructor
public enum GraduateDegree {
    BACHELOR("Lisans"), ASSOCIATE("Önlisans"), MASTER("Yüksek Lisans"), HIGHSCHOOL("Lise Mezunu");

    private final String displayGraduateDegree;
}
