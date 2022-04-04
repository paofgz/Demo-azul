package com.itesm.azul.services;

import com.itesm.azul.models.Settings;
import com.itesm.azul.repositories.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService {
    @Autowired
    SettingRepository settingRepo;

    public Settings getSettings(String client_id){
        return settingRepo.getLast(client_id);
    }

    public Settings editSetting(String client_id, Settings updates) throws Exception {
        if (updates.getMinimum_time() == null && updates.getMaximum_time() == null && updates.getMaximum_size() == null && updates.getVideo_quality() == null) {
            throw new Exception("Nothing to edit");
        } else if(updates.getMaximum_time() != null && updates.getMaximum_time().equals(0)) {
            throw new Exception("The maximum time must be greater than zero");
        } else if(updates.getVideo_quality() != null && updates.getVideo_quality().equals("0p")) {
            throw new Exception("The video quality must be greater than zero");
        } else if(updates.getMaximum_size() != null && updates.getMaximum_size().equals(0)) {
            throw new Exception("The maximum size must be greater than zero");
        } else if(updates.getVideo_quality() != null && updates.getVideo_quality().equals(0)) {
            throw new Exception(("The video quality must be greater than 0"));
        }

        return settingRepo.update(client_id, updates);
    }

    public Settings addNewSetting(Settings newSetting) throws Exception {
        if(newSetting.getClient_id() == null) {
            throw new Exception("All settings must be assigned to a company");
        } else if(newSetting.getMinimum_time() == null) {
            throw new Exception("All settings must have a minimum time");
        } else if(newSetting.getMaximum_time() == null) {
            throw new Exception("All settings must have a maximum time");
        } else if(newSetting.getVideo_quality() == null) {
            throw new Exception("All settings must have quality");
        } else if(newSetting.getMaximum_size() == null) {
            throw new Exception("All settings must have a maximum size");
        }
        return settingRepo.create(newSetting);
    }
}
