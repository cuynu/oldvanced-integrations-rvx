package app.revanced.integrations.settings;

import static app.revanced.integrations.utils.SharedPrefHelper.SharedPrefNames.SPONSOR_BLOCK;

import androidx.annotation.NonNull;

import app.revanced.integrations.utils.LogHelper;
import app.revanced.integrations.utils.SharedPrefHelper;

public enum SettingsEnum {

    // Ads
    HIDE_VIDEO_ADS("revanced_video_ads_removal", true, ReturnType.BOOLEAN, true),
    AD_REMOVER_GENERAL_ADS("revanced_ad_remover_general_ads", true, ReturnType.BOOLEAN),
    AD_REMOVER_PAID_CONTENT("revanced_ad_remover_paid_content", true, ReturnType.BOOLEAN),
    AD_REMOVER_SELF_SPONSOR("revanced_ad_remover_self_sponsor", true, ReturnType.BOOLEAN),
    AD_REMOVER_GET_PREMIUM("revanced_ad_remover_get_premium", true, ReturnType.BOOLEAN, true),
    AD_REMOVER_USER_FILTER("revanced_ad_remover_user_filter", false, ReturnType.BOOLEAN),
    AD_REMOVER_CUSTOM_FILTER("revanced_ad_remover_custom_strings", "", ReturnType.STRING, true),


    // Swipe controls
    ENABLE_SWIPE_AUTO_BRIGHTNESS("revanced_enable_swipe_auto_brightness", false, ReturnType.BOOLEAN),
    ENABLE_SWIPE_BRIGHTNESS("revanced_enable_swipe_brightness", true, ReturnType.BOOLEAN, true),
    ENABLE_SWIPE_VOLUME("revanced_enable_swipe_volume", true, ReturnType.BOOLEAN, true),
    ENABLE_PRESS_TO_SWIPE("revanced_enable_press_to_swipe", false, ReturnType.BOOLEAN),
    ENABLE_SWIPE_HAPTIC_FEEDBACK("revanced_enable_swipe_haptic_feedback", true, ReturnType.BOOLEAN),
    SWIPE_OVERLAY_TIMEOUT("revanced_swipe_overlay_timeout", 500L, ReturnType.LONG),
    SWIPE_OVERLAY_TEXT_SIZE("revanced_swipe_overlay_text_size", 27f, ReturnType.FLOAT),
    SWIPE_OVERLAY_BACKGROUND_ALPHA("revanced_swipe_overlay_background_alpha", 127, ReturnType.INTEGER),
    SWIPE_MAGNITUDE_THRESHOLD("revanced_swipe_magnitude_threshold", 0f, ReturnType.FLOAT),

    //Experimental Flags
    ENABLE_SWIPE_BRIGHTNESS_HDR("revanced_enable_swipe_brightness_in_hdr", true, ReturnType.BOOLEAN, true),
    ENABLE_SAVE_BRIGHTNESS("revanced_enable_save_brightness", true, ReturnType.BOOLEAN, true),
    SWIPE_BRIGHTNESS_VALUE("revanced_swipe_brightness_value", 50f, ReturnType.FLOAT),


    // Shorts
    HIDE_SHORTS_SHELF("revanced_hide_shorts_shelf", true, ReturnType.BOOLEAN),
    DISABLE_STARTUP_SHORTS_PLAYER("revanced_disable_startup_shorts_player", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_COMMENTS_BUTTON("revanced_hide_shorts_player_comments_button", false, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_REMIX_BUTTON("revanced_hide_shorts_player_remix_button", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_THANKS_BUTTON("revanced_hide_shorts_player_thanks_button", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_SUBSCRIPTIONS_BUTTON("revanced_hide_shorts_player_subscriptions_button", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_JOIN_BUTTON("revanced_hide_shorts_player_join_button", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_INFO_PANEL("revanced_hide_shorts_player_info_panel", true, ReturnType.BOOLEAN),
    HIDE_SHORTS_PLAYER_PAID_CONTENT("revanced_hide_shorts_player_paid_content", true, ReturnType.BOOLEAN),


    // General
    HIDE_STORIES_SHELF("revanced_hide_stories_shelf", true, ReturnType.BOOLEAN, true),
    ENABLE_WIDE_SEARCHBAR("revanced_enable_wide_searchbar", false, ReturnType.BOOLEAN, true),
    ENABLE_TABLET_MINI_PLAYER("revanced_enable_tablet_mini_player", false, ReturnType.BOOLEAN, true),
    HIDE_AUTO_CAPTIONS("revanced_hide_auto_captions", false, ReturnType.BOOLEAN, true),
    HIDE_AUTO_PLAYER_POPUP_PANELS("revanced_hide_auto_player_popup_panels", true, ReturnType.BOOLEAN, true),
    HIDE_MIX_PLAYLISTS("revanced_hide_mix_playlists", false, ReturnType.BOOLEAN),
    HIDE_CROWDFUNDING_BOX("revanced_hide_crowdfunding_box", true, ReturnType.BOOLEAN, true),
    HIDE_EMAIL_ADDRESS("revanced_hide_email_address", true, ReturnType.BOOLEAN, true),
    HIDE_SNACK_BAR("revanced_hide_snack_bar", false, ReturnType.BOOLEAN),
    HIDE_SEARCH_TERMS("revanced_hide_search_terms", false, ReturnType.BOOLEAN, true),
    HIDE_FLOATING_MICROPHONE("revanced_hide_floating_microphone", true, ReturnType.BOOLEAN, true),
    HIDE_CATEGORY_BAR_IN_FEED("revanced_hide_category_bar_in_feed", false, ReturnType.BOOLEAN, true),
    HIDE_CATEGORY_BAR_IN_RELATED_VIDEO("revanced_hide_category_bar_in_related_video", false, ReturnType.BOOLEAN, true),
    HIDE_CATEGORY_BAR_IN_SEARCH_RESULTS("revanced_hide_category_bar_in_search_results", false, ReturnType.BOOLEAN, true),
    HIDE_CHANNEL_LIST_SUBMENU("revanced_hide_channel_list_submenu", false, ReturnType.BOOLEAN, true),
    HIDE_BREAKING_NEWS_SHELF("revanced_hide_breaking_news_shelf", false, ReturnType.BOOLEAN, true),
    HIDE_LOAD_MORE_BUTTON("revanced_hide_load_more_button", true, ReturnType.BOOLEAN, true),
    HIDE_ACCOUNT_MENU("revanced_hide_account_menu", false, ReturnType.BOOLEAN),
    ACCOUNT_MENU_CUSTOM_FILTER("revanced_account_menu_custom_filter", "YouTube Music,YouTube Kids", ReturnType.STRING, true),
    ENABLE_PREMIUM_HEADER("revanced_override_premium_header", false, ReturnType.BOOLEAN, true),

    HIDE_MERCHANDISE("revanced_hide_merchandise", true, ReturnType.BOOLEAN),
    HIDE_BROWSE_STORE_BUTTON("revanced_hide_browse_store_button", true, ReturnType.BOOLEAN),
    HIDE_COMMUNITY_POSTS_HOME("revanced_hide_community_posts_home", true, ReturnType.BOOLEAN),
    HIDE_COMMUNITY_POSTS_SUBSCRIPTIONS("revanced_hide_community_posts_subscriptions", false, ReturnType.BOOLEAN),
    HIDE_MOVIE_SHELF("revanced_hide_movie_shelf", false, ReturnType.BOOLEAN),
    HIDE_FEED_SURVEY("revanced_hide_feed_survey", true, ReturnType.BOOLEAN),
    HIDE_IMAGE_SHELF("revanced_hide_image_shelf", true, ReturnType.BOOLEAN),
    HIDE_TICKET_SHELF("revanced_hide_ticket_shelf", true, ReturnType.BOOLEAN),
    HIDE_INFO_PANEL("revanced_hide_info_panel", true, ReturnType.BOOLEAN),
    HIDE_MEDICAL_PANEL("revanced_hide_medical_panel", true, ReturnType.BOOLEAN),
    HIDE_SUGGESTIONS("revanced_hide_suggestions", true, ReturnType.BOOLEAN),
    HIDE_LATEST_POSTS("revanced_hide_latest_posts", true, ReturnType.BOOLEAN),
    HIDE_CHANNEL_MEMBER_SHELF("revanced_hide_channel_member_shelf", true, ReturnType.BOOLEAN),
    HIDE_CHANNEL_BAR_JOIN_BUTTON("revanced_hide_channelbar_join_button", true, ReturnType.BOOLEAN),
    HIDE_TEASER("revanced_hide_teaser", true, ReturnType.BOOLEAN),
    HIDE_GRAY_SEPARATOR("revanced_hide_separator", true, ReturnType.BOOLEAN),
    HIDE_OFFICIAL_HEADER("revanced_hide_official_header", false, ReturnType.BOOLEAN),
    HIDE_ALBUM_CARDS("revanced_hide_album_card", true, ReturnType.BOOLEAN),
    HIDE_WEB_SEARCH_PANEL("revanced_hide_web_search_panel", true, ReturnType.BOOLEAN),
    HIDE_TIMED_REACTIONS("revanced_hide_timed_reactions", false, ReturnType.BOOLEAN),


    // Player
    HIDE_COLLAPSE_BUTTON("revanced_hide_collapse_button", false, ReturnType.BOOLEAN),
    HIDE_YOUTUBE_MUSIC_BUTTON("revanced_hide_youtube_music_button", false, ReturnType.BOOLEAN),
    HIDE_AUTOPLAY_BUTTON("revanced_hide_autoplay_button", true, ReturnType.BOOLEAN, true),
    HIDE_CAST_BUTTON("revanced_hide_cast_button", true, ReturnType.BOOLEAN, true),
    HIDE_LIVE_CHATS_BUTTON("revanced_hide_live_chat_button", false, ReturnType.BOOLEAN),
    HIDE_CAPTIONS_BUTTON("revanced_hide_captions_button", false, ReturnType.BOOLEAN),
    HIDE_PREVIOUS_NEXT_BUTTON("revanced_hide_previous_next_button", false, ReturnType.BOOLEAN),
    HIDE_PREV_BUTTON("revanced_hide_prev_button", false, ReturnType.BOOLEAN),
    HIDE_PLAYER_BUTTON_BACKGROUND("revanced_hide_player_button_background", false, ReturnType.BOOLEAN, true),
    HIDE_END_SCREEN_CARDS("revanced_hide_end_screen_cards", true, ReturnType.BOOLEAN, true),
    HIDE_INFO_CARDS("revanced_hide_info_cards", true, ReturnType.BOOLEAN, true),
    HIDE_CHANNEL_WATERMARK("revanced_hide_channel_watermark", true, ReturnType.BOOLEAN),
    HIDE_SUGGESTED_ACTION("revanced_hide_suggested_actions", true, ReturnType.BOOLEAN, true),
    HIDE_VIEW_PRODUCTS("revanced_hide_view_products", true, ReturnType.BOOLEAN),
    HIDE_AUDIO_TRACK_BUTTON("revanced_hide_audio_track_button", true, ReturnType.BOOLEAN),
    HIDE_PLAYER_OVERLAY_FILTER("revanced_hide_player_overlay_filter", false, ReturnType.BOOLEAN, true),


    // Fullscreen
    HIDE_FULLSCREEN_PANELS("revanced_hide_fullscreen_panels", false, ReturnType.BOOLEAN, true),
    SHOW_FULLSCREEN_TITLE("revanced_show_fullscreen_title", true, ReturnType.BOOLEAN, true),
    HIDE_AUTOPLAY_PREVIEW("revanced_hide_autoplay_preview", false, ReturnType.BOOLEAN, true),
    HIDE_END_SCREEN_OVERLAY("revanced_hide_end_screen_overlay", false, ReturnType.BOOLEAN, true),
    HIDE_FILMSTRIP_OVERLAY("revanced_hide_filmstrip_overlay", false, ReturnType.BOOLEAN, true),
    HIDE_SEEK_MESSAGE("revanced_hide_seek_message", false, ReturnType.BOOLEAN, true),

    // Quick Actions
    HIDE_QUICK_ACTIONS("revanced_hide_quick_actions", false, ReturnType.BOOLEAN, true),
    HIDE_QUICK_ACTIONS_LIKE_BUTTON("revanced_hide_quick_actions_like", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_DISLIKE_BUTTON("revanced_hide_quick_actions_dislike", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_COMMENT_BUTTON("revanced_hide_quick_actions_comment", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_LIVE_CHAT_BUTTON("revanced_hide_quick_actions_live_chat", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_PLAYLIST_BUTTON("revanced_hide_quick_actions_playlist", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_SHARE_BUTTON("revanced_hide_quick_actions_share", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_MORE_BUTTON("revanced_hide_quick_actions_more", false, ReturnType.BOOLEAN),
    HIDE_QUICK_ACTIONS_RELATED_VIDEO("revanced_hide_quick_actions_related_videos", false, ReturnType.BOOLEAN),


    // Experimental Flags
    DISABLE_LANDSCAPE_MODE("revanced_disable_landscape_mode", false, ReturnType.BOOLEAN, true),

    DISABLE_HAPTIC_FEEDBACK_SEEK("revanced_disable_haptic_feedback_seek", false, ReturnType.BOOLEAN),
    DISABLE_HAPTIC_FEEDBACK_SCRUBBING("revanced_disable_haptic_feedback_scrubbing", false, ReturnType.BOOLEAN),
    DISABLE_HAPTIC_FEEDBACK_CHAPTERS("revanced_disable_haptic_feedback_chapters", false, ReturnType.BOOLEAN),
    DISABLE_HAPTIC_FEEDBACK_ZOOM("revanced_disable_haptic_feedback_zoom", false, ReturnType.BOOLEAN),


    // Bottom Player
    HIDE_LIKE_BUTTON("revanced_hide_button_like", false, ReturnType.BOOLEAN),
    HIDE_DISLIKE_BUTTON("revanced_hide_button_dislike", false, ReturnType.BOOLEAN),
    HIDE_ACTION_BUTTON("revanced_hide_action_buttons", false, ReturnType.BOOLEAN),
    HIDE_DOWNLOAD_BUTTON("revanced_hide_button_download", false, ReturnType.BOOLEAN),
    HIDE_PLAYLIST_BUTTON("revanced_hide_button_playlist", false, ReturnType.BOOLEAN),

    // Experimental Flags
    HIDE_LIVE_CHAT_BUTTON("revanced_hide_button_live_chat", false, ReturnType.BOOLEAN),
    HIDE_SHARE_BUTTON("revanced_hide_button_share", false, ReturnType.BOOLEAN),
    HIDE_SHOP_BUTTON("revanced_hide_button_shop", false, ReturnType.BOOLEAN),
    HIDE_REPORT_BUTTON("revanced_hide_button_report", false, ReturnType.BOOLEAN),
    HIDE_REMIX_BUTTON("revanced_hide_button_remix", false, ReturnType.BOOLEAN),
    HIDE_THANKS_BUTTON("revanced_hide_button_thanks", false, ReturnType.BOOLEAN),
    HIDE_CREATE_CLIP_BUTTON("revanced_hide_button_create_clip", false, ReturnType.BOOLEAN),

    HIDE_COMMENTS_SECTION("revanced_hide_comments_section", false, ReturnType.BOOLEAN),
    HIDE_PREVIEW_COMMENT("revanced_hide_preview_comment", false, ReturnType.BOOLEAN),
    HIDE_COMMENTS_THANKS_BUTTON("revanced_hide_comments_thanks_button", false, ReturnType.BOOLEAN),
    HIDE_EMOJI_PICKER("revanced_hide_emoji_picker", false, ReturnType.BOOLEAN),
    HIDE_CHANNEL_GUIDELINES("revanced_hide_channel_guidelines", true, ReturnType.BOOLEAN),


    // Flyout Panel
    ENABLE_OLD_QUALITY_LAYOUT("revanced_enable_old_quality_layout", true, ReturnType.BOOLEAN),
    HIDE_QUALITY_MENU("revanced_hide_menu_qualities", false, ReturnType.BOOLEAN),
    HIDE_CAPTIONS_MENU("revanced_hide_menu_captions", false, ReturnType.BOOLEAN),
    HIDE_LOOP_MENU("revanced_hide_menu_loop_video", false, ReturnType.BOOLEAN),
    HIDE_AMBIENT_MENU("revanced_hide_menu_ambient_mode", false, ReturnType.BOOLEAN),
    HIDE_REPORT_MENU("revanced_hide_menu_report", false, ReturnType.BOOLEAN),
    HIDE_HELP_MENU("revanced_hide_menu_help", false, ReturnType.BOOLEAN),
    HIDE_MORE_MENU("revanced_hide_menu_more_info", false, ReturnType.BOOLEAN),
    HIDE_SPEED_MENU("revanced_hide_menu_speed", false, ReturnType.BOOLEAN),
    HIDE_LISTENING_CONTROLS_MENU("revanced_hide_menu_listening_controls", false, ReturnType.BOOLEAN),
    HIDE_AUDIO_TRACK_MENU("revanced_hide_menu_audio_track", false, ReturnType.BOOLEAN),
    HIDE_WATCH_IN_VR_MENU("revanced_hide_menu_watch_in_vr", false, ReturnType.BOOLEAN),
    HIDE_NERDS_MENU("revanced_hide_menu_stats_for_nerds", false, ReturnType.BOOLEAN),
    HIDE_YT_MUSIC_MENU("revanced_hide_menu_listen_with_youtube_music", false, ReturnType.BOOLEAN),


    // Navigation
    CHANGE_HOMEPAGE_TO_SUBSCRIPTION("revanced_change_homepage", false, ReturnType.BOOLEAN, true),
    ENABLE_TABLET_NAVIGATION_BAR("revanced_enable_tablet_navigation_bar", false, ReturnType.BOOLEAN, true),
    OPEN_LIBRARY_STARTUP("revanced_open_library_startup", false, ReturnType.BOOLEAN, true),
    SWITCH_CREATE_NOTIFICATION("revanced_switching_create_notification", true, ReturnType.BOOLEAN, true),
    HIDE_CREATE_BUTTON("revanced_hide_create_button", true, ReturnType.BOOLEAN, true),
    HIDE_HOME_BUTTON("revanced_hide_home_button", false, ReturnType.BOOLEAN, true),
    HIDE_SHORTS_BUTTON("revanced_hide_shorts_button", false, ReturnType.BOOLEAN, true),
    HIDE_SUBSCRIPTIONS_BUTTON("revanced_hide_subscriptions_button", false, ReturnType.BOOLEAN, true),
    HIDE_LIBRARY_BUTTON("revanced_hide_library_button", false, ReturnType.BOOLEAN, true),
    HIDE_NAVIGATION_LABEL("revanced_hide_navigation_label", false, ReturnType.BOOLEAN, true),

    // Experimental Flags
    HIDE_SHORTS_NAVIGATION_BAR("revanced_hide_shorts_navigation_bar", false, ReturnType.BOOLEAN, true),


    // Seekbar
    ENABLE_CUSTOM_SEEKBAR_COLOR("revanced_enable_custom_seekbar_color", true, ReturnType.BOOLEAN, true),
    ENABLE_CUSTOM_SEEKBAR_COLOR_VALUE("revanced_custom_seekbar_color_value", "#ff0000", ReturnType.STRING, true),
    ENABLE_SEEKBAR_TAPPING("revanced_enable_seekbar_tapping", true, ReturnType.BOOLEAN),
    HIDE_SEEKBAR("revanced_hide_seekbar", false, ReturnType.BOOLEAN),
    HIDE_TIME_STAMP("revanced_hide_time_stamp", false, ReturnType.BOOLEAN, true),
    ENABLE_TIME_STAMP_SPEED("revanced_enable_time_stamp_speed", true, ReturnType.BOOLEAN),


    // Video
    DEFAULT_VIDEO_QUALITY_WIFI("revanced_default_video_quality_wifi", -2, ReturnType.INTEGER),
    DEFAULT_VIDEO_QUALITY_MOBILE("revanced_default_video_quality_mobile", -2, ReturnType.INTEGER),
    DEFAULT_VIDEO_SPEED("revanced_default_video_speed", -2.0f, ReturnType.FLOAT),
    ENABLE_SAVE_VIDEO_QUALITY("revanced_enable_save_video_quality", false, ReturnType.BOOLEAN),
    ENABLE_SAVE_VIDEO_SPEED("revanced_enable_save_video_speed", false, ReturnType.BOOLEAN),
    ENABLE_CUSTOM_VIDEO_SPEED("revanced_enable_custom_video_speed", false, ReturnType.BOOLEAN, true),
    DISABLE_DEFAULT_VIDEO_SPEED_LIVE("revanced_disable_default_video_speed_live", true, ReturnType.BOOLEAN),
    DISABLE_HDR_VIDEO("revanced_disable_hdr_video", false, ReturnType.BOOLEAN, true),


    // Overlay Button
    OVERLAY_BUTTON_SPEED("revanced_overlay_button_speed", true, ReturnType.BOOLEAN),
    OVERLAY_BUTTON_COPY("revanced_overlay_button_copy_url", false, ReturnType.BOOLEAN),
    OVERLAY_BUTTON_COPY_WITH_TIMESTAMP("revanced_overlay_button_copy_url_with_timestamp", false, ReturnType.BOOLEAN),
    OVERLAY_BUTTON_AUTO_REPEAT("revanced_overlay_button_auto_repeat", false, ReturnType.BOOLEAN),
    ENABLE_ALWAYS_AUTO_REPEAT("revanced_enable_always_auto_repeat", false, ReturnType.BOOLEAN),

    // Default Downloader
    OVERLAY_BUTTON_DOWNLOADS("revanced_overlay_button_downloads", true, ReturnType.BOOLEAN),
    DOWNLOADER_PACKAGE_NAME("revanced_downloader_package_name", null, ReturnType.STRING, true),


    // Misc
    ENABLE_EXTERNAL_BROWSER("revanced_enable_external_browser", true, ReturnType.BOOLEAN, true),
    ENABLE_OPEN_LINKS_DIRECTLY("revanced_enable_open_links_directly", true, ReturnType.BOOLEAN),
    BYPASS_AMBIENT_MODE_RESTRICTIONS("revanced_bypass_ambient_mode_restrictions", false, ReturnType.BOOLEAN),
    DOUBLE_BACK_TIMEOUT("revanced_double_back_timeout", 2, ReturnType.INTEGER, true),

    //Experimental Flags
    SPOOF_APP_VERSION("revanced_spoof_app_version", false, ReturnType.BOOLEAN, true),
    SPOOF_APP_VERSION_TARGET("revanced_spoof_app_version_target", "17.30.34", ReturnType.STRING, true),
    ENABLE_TABLET_LAYOUT("revanced_enable_tablet_layout", false, ReturnType.BOOLEAN, true, "revanced_reboot_warning_tablet"),
    ENABLE_PHONE_LAYOUT("revanced_enable_phone_layout", false, ReturnType.BOOLEAN, true, "revanced_reboot_warning_phone"),
    ENABLE_VP9_CODEC("revanced_enable_vp9_codec", false, ReturnType.BOOLEAN, true, "revanced_reboot_warning_vp9"),
    DISABLE_QUIC_PROTOCOL("revanced_disable_quic_protocol", false, ReturnType.BOOLEAN, true, "revanced_reboot_warning_quic"),
    ENABLE_PROTOBUF_SPOOF("revanced_enable_protobuf_spoof", true, ReturnType.BOOLEAN, true),


    // Return YouTube Dislike
    RYD_USER_ID("ryd_userId", null, SharedPrefHelper.SharedPrefNames.RYD, ReturnType.STRING),
    RYD_ENABLED("ryd_enabled", true, SharedPrefHelper.SharedPrefNames.RYD, ReturnType.BOOLEAN),
    RYD_SHOW_DISLIKE_PERCENTAGE("ryd_show_dislike_percentage", false, SharedPrefHelper.SharedPrefNames.RYD, ReturnType.BOOLEAN),
    RYD_USE_COMPACT_LAYOUT("ryd_use_compact_layout", false, SharedPrefHelper.SharedPrefNames.RYD, ReturnType.BOOLEAN),


    // SponsorBlock
    SB_ENABLED("sb-enabled", true, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_VOTING_ENABLED("sb-voting-enabled", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),

    SB_CREATE_NEW_SEGMENT_ENABLED("sb-new-segment-enabled", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_USE_COMPACT_SKIP_BUTTON("sb-use-compact-skip-button", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_AUTO_HIDE_SKIP_BUTTON("sb-auto-hide-skip-segment-button", true, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_SHOW_TOAST_ON_SKIP("show-toast", true, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_TRACK_SKIP_COUNT("count-skips", true, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_UUID("uuid", "", SPONSOR_BLOCK, ReturnType.STRING),
    SB_ADJUST_NEW_SEGMENT_STEP("new-segment-step-accuracy", 150, SPONSOR_BLOCK, ReturnType.INTEGER),
    SB_MIN_DURATION("sb-min-duration", 0F, SPONSOR_BLOCK, ReturnType.FLOAT),
    SB_SEEN_GUIDELINES("sb-seen-gl", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_SKIPPED_SEGMENTS_NUMBER_SKIPPED("sb-skipped-segments", 0, SPONSOR_BLOCK, ReturnType.INTEGER),
    SB_SKIPPED_SEGMENTS_TIME_SAVED("sb-skipped-segments-time", 0L, SPONSOR_BLOCK, ReturnType.LONG),
    SB_SHOW_TIME_WITHOUT_SEGMENTS("sb-length-without-segments", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_IS_VIP("sb-is-vip", false, SPONSOR_BLOCK, ReturnType.BOOLEAN),
    SB_LAST_VIP_CHECK("sb-last-vip-check", 0L, SPONSOR_BLOCK, ReturnType.LONG),
    SB_API_URL("sb-api-host-url", "https://sponsor.ajay.app", SPONSOR_BLOCK, ReturnType.STRING),
    SB_FIRST_RUN("sb-first-run", false, SharedPrefHelper.SharedPrefNames.SPONSOR_BLOCK, ReturnType.BOOLEAN);



    private final String path;
    private final Object defaultValue;
    private final SharedPrefHelper.SharedPrefNames sharedPref;
    private final ReturnType returnType;
    private final boolean rebootApp;
    private final String rebootApp_Warning;

    private volatile Object value;

    SettingsEnum(String path, Object defaultValue, ReturnType returnType) {
        this.path = path;
        this.defaultValue = defaultValue;
        this.sharedPref = SharedPrefHelper.SharedPrefNames.REVANCED;
        this.returnType = returnType;
        this.rebootApp = false;
        this.rebootApp_Warning = "";
    }

    SettingsEnum(String path, Object defaultValue, SharedPrefHelper.SharedPrefNames prefName, ReturnType returnType) {
        this.path = path;
        this.defaultValue = defaultValue;
        this.sharedPref = prefName;
        this.returnType = returnType;
        this.rebootApp = false;
        this.rebootApp_Warning = "";
    }

    SettingsEnum(String path, Object defaultValue, ReturnType returnType, boolean rebootApp) {
        this.path = path;
        this.defaultValue = defaultValue;
        this.sharedPref = SharedPrefHelper.SharedPrefNames.REVANCED;
        this.returnType = returnType;
        this.rebootApp = rebootApp;
        this.rebootApp_Warning = "";
    }

    SettingsEnum(String path, Object defaultValue, ReturnType returnType, boolean rebootApp, String rebootApp_Warning) {
        this.path = path;
        this.defaultValue = defaultValue;
        this.sharedPref = SharedPrefHelper.SharedPrefNames.REVANCED;
        this.returnType = returnType;
        this.rebootApp = rebootApp;
        this.rebootApp_Warning = rebootApp_Warning;
    }


    static {
        load();
    }

    private static void load() {
        try {
            for (SettingsEnum setting : values()) {
                Object value = setting.getDefaultValue();

                switch (setting.getReturnType()) {
                    case FLOAT ->
                            value = SharedPrefHelper.getFloat(setting.sharedPref, setting.getPath(), (float) setting.getDefaultValue());
                    case LONG ->
                            value = SharedPrefHelper.getLong(setting.sharedPref, setting.getPath(), (long) setting.getDefaultValue());
                    case BOOLEAN ->
                            value = SharedPrefHelper.getBoolean(setting.sharedPref, setting.getPath(), (boolean) setting.getDefaultValue());
                    case INTEGER ->
                            value = SharedPrefHelper.getInt(setting.sharedPref, setting.getPath(), (int) setting.getDefaultValue());
                    case STRING ->
                            value = SharedPrefHelper.getString(setting.sharedPref, setting.getPath(), (String) setting.getDefaultValue());
                    default ->
                            LogHelper.printException(SettingsEnum.class, "Setting does not have a valid Type. Name is: " + setting.name());
                }
                setting.setValue(value);
            }
        } catch (Throwable th) {
            LogHelper.printException(SettingsEnum.class, "Error during load()!", th);
        }
    }

    public void setValue(Object newValue) {
        this.value = newValue;
    }

    public void saveValue(Object newValue) {
        try {
            if (returnType == ReturnType.BOOLEAN) {
                SharedPrefHelper.saveBoolean(sharedPref, path, (boolean) newValue);
            } else {
                SharedPrefHelper.saveString(sharedPref, path, String.valueOf(newValue));
            }
            this.value = newValue;
        } catch (Throwable th) {
            LogHelper.printException(SettingsEnum.class, "Context on SaveValue is null!");
        }
    }

    public boolean getBoolean() {
        if (value == null) return (boolean) defaultValue;
        else return (boolean) value;
    }

    public int getInt() {
        return (Integer) value;
    }

    public long getLong() {
        return (Long) value;
    }

    public float getFloat() {
        return (Float) value;
    }

    @NonNull
    public String getString() {
        return (String) value;
    }

    @NonNull
    public Object getObjectValue() {
        return value;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getPath() {
        return path;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public boolean shouldRebootOnChange() {
        return rebootApp;
    }

    public String shouldWarningOnChange() {
        return rebootApp_Warning;
    }

}
