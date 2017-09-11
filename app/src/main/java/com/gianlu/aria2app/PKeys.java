package com.gianlu.aria2app;

import com.gianlu.commonutils.Prefs;

public enum PKeys implements Prefs.PrefKey {
    DD_DOWNLOAD_PATH("dd_downloadPath"),
    A2_PERSISTENT_NOTIFS("a2_enablePersistent"),
    A2_NOTIFS_AT_BOOT("a2_enableNotificationsAtBoot"),
    A2_FORCE_ACTION("a2_forceAction"),
    A2_MAIN_FILTERS("a2_mainFilters"),
    A2_ENABLE_NOTIFS("a2_enableNotifications"),
    A2_UPDATE_INTERVAL("a2_updateRate"),
    A2_HIDE_METADATA("a2_hideMetadata"),
    A2_GLOBAL_QUICK_OPTIONS("a2_globalQuickOptions"),
    A2_CHECK_VERSION("a2_runVersionCheckAtStartup"),
    A2_QUICK_OPTIONS("a2_quickOptions"),
    A2_MAIN_SORTING("a2_mainSorting"),
    A2_NOTIFS_SOUND("a2_enableSound"),
    A2_SELECTED_NOTIFS_TYPE("a2_selectedNotifications"),
    A2_TUTORIAL_DISCOVERIES("a2_tutorialDiscoveries"),
    A2_SEARCH_ENGINES("a2_searchEngines");

    private final String key;

    PKeys(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
