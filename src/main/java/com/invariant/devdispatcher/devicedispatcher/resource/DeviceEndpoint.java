package com.invariant.devdispatcher.devicedispatcher.resource;

import com.invariant.devdispatcher.devicedispatcher.dto.Device;
import com.invariant.devdispatcher.devicedispatcher.dto.DraftPrinter;
import com.invariant.devdispatcher.devicedispatcher.service.DeviceService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * REST-точка входа для <host:port></app/
 */
@Component
@Path("/devices")
public class DeviceEndpoint {

    private final DeviceService deviceService;

    public DeviceEndpoint(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Device> message() {
        return deviceService.getDevices();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(DraftPrinter device) {
        deviceService.addDevice(device);
        String result = "Device collect : " + device;
        return Response.status(201).entity(result).build();

    }
}
