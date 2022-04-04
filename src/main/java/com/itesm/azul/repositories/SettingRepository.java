package com.itesm.azul.repositories;

import com.itesm.azul.models.Settings;
import org.springframework.stereotype.Repository;

@Repository
public class SettingRepository {

    public Settings getLast(String client_id) {
        Settings s1 = new Settings();
        s1.setClient_id(client_id);
        s1.setMinimum_time(5.0f);
        s1.setMaximum_time(80.0f);
        s1.setVideo_quality("480p");
        s1.setMaximum_size(65);

        return s1;
    }

    public Settings update(String client_id, Settings updates) {
        Settings s1 = new Settings();
        s1.setClient_id(client_id);
        s1.setMinimum_time(5.0f);
        s1.setMaximum_time(80.0f);
        s1.setVideo_quality("480p");
        s1.setMaximum_size(65);
        if (updates.getMaximum_size() != null) {
            s1.setMaximum_size(updates.getMaximum_size());
        }
        if (updates.getMaximum_time() != null) {
            s1.setMaximum_time(updates.getMaximum_time());
        }
        if (updates.getMinimum_time() != null) {
            s1.setMinimum_time(updates.getMinimum_time());
        }
        if (updates.getVideo_quality() != null) {
            s1.setVideo_quality(updates.getVideo_quality());
        }
        return s1;
    }

    public Settings create(Settings newSetting){
        Settings s1 = new Settings();
        s1.setClient_id(newSetting.getClient_id());
        s1.setMinimum_time(newSetting.getMinimum_time());
        s1.setMaximum_time(newSetting.getMaximum_time());
        s1.setVideo_quality(newSetting.getVideo_quality());
        s1.setMaximum_size(newSetting.getMaximum_size());

        return s1;

    }
}
