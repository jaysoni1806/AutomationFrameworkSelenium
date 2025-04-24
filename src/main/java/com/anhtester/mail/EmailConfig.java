/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package com.anhtester.mail;

import static com.anhtester.constants.FrameworkConstants.REPORT_TITLE;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Remember to create an app password (App Password) for Gmail before sending
    // ->https://myaccount.google.com/apppasswords?pli=1&rapt=AEjHL4MaCXexWZKbcHlIlQIXgk_uigJU5OxXGH_w-6sr33yj1fni5fUJEisgweoIbCO0hpqY53dNfm5bMI6DUpqU0WKDl5gM9E7NFxvpwwtpGiX72fT_c4E
    //If you use Hosting's email, it's normal
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes


    public static final String SERVER = "smtp.gmail.com";
    public static final String PORT = "587";

    public static final String FROM = "openxcellautomation@gmail.com";
    public static final String PASSWORD = "jkoh odrz osxn aegl";

    public static final String[] TO = {"jay.soni@openxcell.com"};
    public static final String SUBJECT = REPORT_TITLE;
}