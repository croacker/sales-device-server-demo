package com.invariant.devdispatcher.devicedispatcher.dto;

/**
 * Абстрактное устройство
 */
public interface Device {

    String getName();

    void setName(String value);

    String getConfiguration();

    void setConfiguration(String value);

}
