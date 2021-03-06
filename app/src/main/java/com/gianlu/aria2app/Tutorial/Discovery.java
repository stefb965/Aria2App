package com.gianlu.aria2app.Tutorial;

import com.gianlu.commonutils.Tutorial.BaseTutorial;
import com.gianlu.commonutils.Tutorial.TutorialManager;

import androidx.annotation.NonNull;

public enum Discovery implements TutorialManager.Discovery {
    DOWNLOADS_TOOLBAR(DownloadsToolbarTutorial.class),
    DOWNLOADS_CARDS(DownloadCardsTutorial.class),
    FOLDERS(FoldersTutorial.class),
    FILES(FilesTutorial.class),
    PEERS_SERVERS(PeersServersTutorial.class);

    private final Class<? extends BaseTutorial> tutorialClass;

    Discovery(@NonNull Class<? extends BaseTutorial> tutorialClass) {
        this.tutorialClass = tutorialClass;
    }

    @NonNull
    @Override
    public Class<? extends BaseTutorial> tutorialClass() {
        return tutorialClass;
    }
}
