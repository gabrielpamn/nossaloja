package com.nossaloja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/api/info")
    public Map<String, String> info() throws Exception {

        InetAddress localHost = InetAddress.getLocalHost();

        return Map.of(
                "hostname", localHost.getHostName(),
                "address", localHost.getHostAddress()
        );
    }
}