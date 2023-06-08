package app.revanced.integrations.patches.ads;

import static app.revanced.integrations.utils.ReVancedUtils.containsAny;

import app.revanced.integrations.settings.SettingsEnum;
import app.revanced.integrations.shared.PlayerType;

final class QuickActionButtonsFilter extends Filter {
    private final StringFilterGroup quickActionsRule;

    private final String[] exceptions;

    public QuickActionButtonsFilter() {
        quickActionsRule = new StringFilterGroup(
                null,
                "quick_actions"
        );

        exceptions = new String[]{
                "comment",
                "horizontal_video_shelf",
                "library_recent_shelf",
                "playlist_add",
                "video_with_context"
        };

        pathFilterGroups.addAll(
                new StringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_LIKE_BUTTON,
                        "|like_button"
                ),
                new StringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_DISLIKE_BUTTON,
                        "dislike_button"
                ),
                new StringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_RELATED_VIDEO,
                        "fullscreen_related_videos"
                )
        );

        protobufBufferFilterGroups.addAll(
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_LIKE_BUTTON,
                        "yt_outline_thumb_up"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_DISLIKE_BUTTON,
                        "yt_outline_thumb_down"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_COMMENT_BUTTON,
                        "yt_outline_message_bubble_right"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_LIVE_CHAT_BUTTON,
                        "yt_outline_message_bubble_overlap"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_PLAYLIST_BUTTON,
                        "yt_outline_library_add"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_SHARE_BUTTON,
                        "yt_outline_share"
                ),
                new ByteArrayAsStringFilterGroup(
                        SettingsEnum.HIDE_QUICK_ACTIONS_MORE_BUTTON,
                        "yt_outline_overflow_horizontal"
                )
        );
    }

    private boolean isEveryFilterGroupEnabled() {
        for (StringFilterGroup rule : pathFilterGroups)
            if (!rule.isEnabled()) return false;

        for (ByteArrayFilterGroup rule : protobufBufferFilterGroups)
            if (!rule.isEnabled()) return false;

        return true;
    }

    @Override
    public boolean isFiltered(final String path, final String identifier, final String object, final byte[] _protobufBufferArray) {
        if (containsAny(path, exceptions)
                || containsAny(object, exceptions)
                || !containsAny(object, "quick_actions")
                || PlayerType.getCurrent() != PlayerType.WATCH_WHILE_FULLSCREEN) return false;

        if (isEveryFilterGroupEnabled())
            if (quickActionsRule.check(identifier).isFiltered()) return true;

        return super.isFiltered(path, identifier, object, _protobufBufferArray);
    }
}
