package com.invariant.devdispatcher.devicedispatcher.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO
 */
@ToString
public class DraftPrinter implements Device {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String configuration;

}
