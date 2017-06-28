package com.invariant.devdispatcher.devicedispatcher.service;

import com.invariant.devdispatcher.devicedispatcher.dto.Device;
import com.invariant.devdispatcher.devicedispatcher.dto.DraftPrinter;
import com.invariant.devdispatcher.devicedispatcher.dto.PointOfSale;
import com.invariant.devdispatcher.devicedispatcher.dto.WeighingMachine;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис работы с оборудованием
 */
@Component
public class DeviceService {

    private List<Device> devices = new ArrayList<>();

    @PostConstruct
    private void init(){
        Device draftPrinter = new DraftPrinter();
        draftPrinter.setName("Aura-6800 - Posiflex");
        draftPrinter.setConfiguration("serial://rs.232.true.1880");
        devices.add(draftPrinter);

        Device poinrOfSale = new PointOfSale();
        poinrOfSale.setName("ATOL Frontol");
        poinrOfSale.setConfiguration("http://192.168.0.55:443");
        devices.add(poinrOfSale);

        Device weighingMachine = new WeighingMachine();
        weighingMachine.setName("CASS 3500");
        weighingMachine.setConfiguration("udp://192.168.0.117:20");
        devices.add(weighingMachine);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }
}
