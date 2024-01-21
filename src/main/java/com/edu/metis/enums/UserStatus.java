package com.edu.metis.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Emre Dinç
 */
@Getter
@RequiredArgsConstructor
public enum UserStatus {
    ACTIVE("aktif_kullanıcı"), INACTIVE("inaktif_kullanıcı");

    private final String displayUserStatus;
}
