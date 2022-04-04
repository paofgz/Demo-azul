package com.itesm.azul.controllers;

import com.itesm.azul.models.Settings;
import com.itesm.azul.services.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/setting")
public class SettingController {
    @Autowired
    SettingService settingService;

    @GetMapping("/get/{client_id}")
    public Settings getOne(@PathVariable String client_id){
        return settingService.getSettings(client_id);
    }

    @PutMapping("/edit/{client_id}")
    public Settings editSetting(@PathVariable String client_id, @RequestBody Settings updates) throws Exception {
        return settingService.editSetting(client_id, updates);
    }

    @PostMapping("/add")
    public Settings addNewEmployee(@RequestBody Settings addedSetting) throws Exception {
        return settingService.addNewSetting(addedSetting);
    }
}
