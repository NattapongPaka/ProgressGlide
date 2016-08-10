package com.frank.progressglide.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Created by PONG on 1/19/16 AD.
 */
public class ConfigSingleton {
    private final String PARSE_CHANNEL = "AllUsers";
    private final String PARSE_APPLICATION_ID = "yUIZVrIv1yIUxrMdSBEwaTCe8wcuRk7N0BWfPHIf";
    private final String PARSE_CLIENT_KEY = "ChYnrZ99KpXGPXrd5N303bNPAjDegvteJvLomGkh";
    //public static String PROJECT_NUMBER = "364801668027";
    //public static String PROJECT_NUMBER = "514345073476";
    //public static String GAMETRIVE_API_ID = "8f5cd1da-8b28-11e4-bcee-bbdacb564a36";
    private final String company_id = "3";
    private final String url_server = "http://getconnectedapp.com/api/V1";
    private final String url_api = "http://getconnectedapp.com/api-connected/public";
    //public static final String url_server_login = "https://getconnectedapp.com/api/V1";
    private final String url_server_db = "http://ec2-122-248-208-87.ap-southeast-1.compute.amazonaws.com/background_process/notification_chats_realtime.php";
    private final String url_s3 = "http://static.getconnectedapp.com/upload_connected";
    private final String company_domain = "@dhas.com";
    //private final String company_color = "#D32F2F";
    private final String dialog_Color = "#222222";
    private final String dialog_btnColor = "#898686";
    private final String dialog_fontColor = "#FFFFFF";
    private final String group_main_company = "dhas";
    private final String image_folder = "DHAS";

    private Boolean editName = false;
    private Boolean editTitle = false;
    private Boolean showGroupAll = true;
    private Boolean InApp = false;
    private Boolean loginFirst = false;
    private int count_users;
    private String user_id;
    private Boolean bubleChat = false;
    //public static Boolean notification = false;
    private String openMessage = null;
    private HashMap<String, String> selectContacts = new HashMap<String, String>();
    private String textSearch = "";
    private String user_type;

    private static ConfigSingleton instantce;
    public static ConfigSingleton getInstantce(){
        if(instantce == null){
            instantce = new ConfigSingleton();
        }
        return instantce;
    }
    private ConfigSingleton(){}

    public String getUrl_api() {
        return url_api;
    }
    public String getPARSE_CHANNEL() {
        return PARSE_CHANNEL;
    }

    public String getPARSE_APPLICATION_ID() {
        return PARSE_APPLICATION_ID;
    }

    public String getPARSE_CLIENT_KEY() {
        return PARSE_CLIENT_KEY;
    }

    public String getCompany_id() {
        return company_id;
    }

    public String getUrl_server() {
        return url_server;
    }

    public String getUrl_server_db() {
        return url_server_db;
    }

    public String getUrl_s3() {
        return url_s3;
    }

    public String getCompany_domain() {
        return company_domain;
    }

    public String getDialog_Color() {
        return dialog_Color;
    }

    public String getDialog_btnColor() {
        return dialog_btnColor;
    }

    public String getDialog_fontColor() {
        return dialog_fontColor;
    }

    public String getGroup_main_company() {
        return group_main_company;
    }

    public String getImage_folder() {
        return image_folder;
    }

    public Boolean getEditName() {
        return editName;
    }

    public void setEditName(Boolean editName) {
        this.editName = editName;
    }

    public Boolean getEditTitle() {
        return editTitle;
    }

    public void setEditTitle(Boolean editTitle) {
        this.editTitle = editTitle;
    }

    public Boolean getShowGroupAll() {
        return showGroupAll;
    }

    public void setShowGroupAll(Boolean showGroupAll) {
        this.showGroupAll = showGroupAll;
    }

    public Boolean getInApp() {
        return InApp;
    }

    public void setInApp(Boolean inApp) {
        InApp = inApp;
    }

    public Boolean getLoginFirst() {
        return loginFirst;
    }

    public void setLoginFirst(Boolean loginFirst) {
        this.loginFirst = loginFirst;
    }

    public int getCount_users() {
        return count_users;
    }

    public void setCount_users(int count_users) {
        this.count_users = count_users;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Boolean getBubleChat() {
        return bubleChat;
    }

    public void setBubleChat(Boolean bubleChat) {
        this.bubleChat = bubleChat;
    }

    public String getOpenMessage() {
        return openMessage;
    }

    public void setOpenMessage(String openMessage) {
        this.openMessage = openMessage;
    }

    public HashMap<String, String> getSelectContacts() {
        return selectContacts;
    }
    public void setSelectContactsPut(String key, String value) {
        this.selectContacts.put(key,value);
    }
    public void setSelectContacts(HashMap<String, String> selectContacts) {
        this.selectContacts = selectContacts;
    }
    public void setSelectContactsClear() {
        this.selectContacts.clear();
    }
    public void setSelectContactsRemoveId(String id) {
        this.selectContacts.remove(id);
    }
    public String getTextSearch() {
        return textSearch;
    }

    public void setTextSearch(String textSearch) {
        this.textSearch = textSearch;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public HashMap<String, String> getFileTypeSupport() {
        HashMap<String, String> filetypeStyle = new HashMap<String, String>();
        filetypeStyle.put("PDF", "#FF0000");
        filetypeStyle.put("DOC", "#0066FF");
        filetypeStyle.put("XLS", "#009900");
        filetypeStyle.put("PPT", "#FF6600");
        filetypeStyle.put("JPG", "#30000000");
        filetypeStyle.put("PNG", "#30000000");
        filetypeStyle.put("OTH", "#6D6D6D");
        return filetypeStyle;
    }
    public String _getFullFormat(String data) {
        if (data.length() < 2) {
            data = '0' + data;
        }
        return data;
    }
    public int getCurrentTimezoneOffset() {
        GregorianCalendar cal = new GregorianCalendar();
        return -(cal.get(Calendar.ZONE_OFFSET) + cal.get(Calendar.DST_OFFSET)) / 60000;
    }
    public String getDataTimeNowZone(){
        int _offset = getCurrentTimezoneOffset();
        Calendar c = Calendar.getInstance();
        int YEAR = c.get(Calendar.YEAR);
        int MONTH = c.get(Calendar.MONTH);
        int DATE = c.get(Calendar.DATE);
        int HOUR_OF_DAY = c.get(Calendar.HOUR_OF_DAY);
        int MINUTE = c.get(Calendar.MINUTE);
        int SECOND = c.get(Calendar.SECOND);
        String value = YEAR + "-" + _getFullFormat(Integer.toString(MONTH + 1)) + "-" + _getFullFormat(Integer.toString(DATE)) + " " + _getFullFormat(Integer.toString(HOUR_OF_DAY)) + ":" + _getFullFormat(Integer.toString(MINUTE)) + ":" + _getFullFormat(Integer.toString(SECOND));
        return value;
    }
    public String returnTimeZone(String datetime) {
        if (datetime.equals("")) return null;
        int _offset = getCurrentTimezoneOffset();
        if (_offset == -420) return datetime;
        String[] d = datetime.split(" ");
        String[] date = d[0].split("-");
        String[] time = d[1].split(":");
        if (_offset >= 0) {
            int minutes = 420 + _offset;
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
            cal.set(Calendar.DATE, Integer.parseInt(date[2]));
            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
            cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
            cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
            cal.add(Calendar.MINUTE, -minutes);
            String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
            String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
            String _y = Integer.toString(cal.get(Calendar.YEAR));
            String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
            String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
            String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
            return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
        } else if (_offset > -420) {
            int minutes = 420 - (_offset * -1);
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
            cal.set(Calendar.DATE, Integer.parseInt(date[2]));
            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
            cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
            cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
            cal.add(Calendar.MINUTE, -minutes);
            String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
            String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
            String _y = Integer.toString(cal.get(Calendar.YEAR));
            String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
            String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
            String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
            return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;

        } else {
            int minutes = (_offset * -1) - 420;
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
            cal.set(Calendar.DATE, Integer.parseInt(date[2]));
            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
            cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
            cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
            cal.add(Calendar.MINUTE, minutes);
            String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
            String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
            String _y = Integer.toString(cal.get(Calendar.YEAR));
            String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
            String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
            String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
            return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
        }
    }
    public String genDateTimeShort(String date){
        if (date.equals("")) return null;
        String[] a = date.split(" ");
        String[] _d = a[0].split("-");
        String[] _h = a[1].split(":");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(_d[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(_d[1]) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(_d[2]));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(_h[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(_h[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(_h[2]));
        //String[] day ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String _day;
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        _day = dayFormat.format(cal.getTime());
        String _date = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
        SimpleDateFormat dayFormat2 = new SimpleDateFormat("MMMM");
        String _month = dayFormat2.format(cal.getTime());
        int _year = cal.get(Calendar.YEAR);
        //return _day + ", " + _month + " " + _date + ", " + " " + _year;
        return _month + " " + _date + ", " + " " + _year; //September 10, 2015
    }
    public String genTimePageChatShort(String d) {
        if (d.equals("")) return null;
        String[] _a = d.split(" ");
        if (_a[0].equals("") || _a[1].equals("")) return null;
        String[] _date = _a[0].split("-");
        String[] _time = _a[1].split(":");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(_date[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(_date[1]) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(_date[2]));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(_time[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(_time[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(_time[2]));
        Calendar calnow = Calendar.getInstance();
        long t1 = cal.getTimeInMillis();
        long t2 = calnow.getTimeInMillis();
        long hours = (t2 - t1) / (1000 * 3600);
        long days = ((t2 - t1) / (24 * 3600 * 1000));
        if (days == 0) {
            if (cal.get(Calendar.DATE) != calnow.get(Calendar.DATE))
                return "Yesterday";
            else
                return _time[0] + ":" + _time[1];
        } else if (days == 1 && hours < 24) {
            return "Yesterday";
        } else if (days < 7) {
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEE");
            return dayFormat.format(cal.getTime());
        } else {
            SimpleDateFormat dayFormat = new SimpleDateFormat("LLL");
            return dayFormat.format(cal.getTime()) + " " + _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
        }
    }
    public String getObjectDateShow(String date) {
        if (date.equals("")) return null;
        String[] a = date.split(" ");
        String[] _d = a[0].split("-");
        String[] _h = a[1].split(":");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(_d[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(_d[1]) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(_d[2]));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(_h[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(_h[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(_h[2]));
        //String[] day ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String _day;
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        _day = dayFormat.format(cal.getTime());
        String _date = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
        SimpleDateFormat dayFormat2 = new SimpleDateFormat("MMM");
        String _month = dayFormat2.format(cal.getTime());
        int _year = cal.get(Calendar.YEAR);
        return _day + ", " + _month + " " + _date + ", " + " " + _year;
    }
    public String getDateTimeNow() {
        int _offset = getCurrentTimezoneOffset();
        Calendar c = Calendar.getInstance();
        int YEAR = c.get(Calendar.YEAR);
        int MONTH = c.get(Calendar.MONTH);
        int DATE = c.get(Calendar.DATE);
        int HOUR_OF_DAY = c.get(Calendar.HOUR_OF_DAY);
        int MINUTE = c.get(Calendar.MINUTE);
        int SECOND = c.get(Calendar.SECOND);
        String value = YEAR + "-" + _getFullFormat(Integer.toString(MONTH + 1)) + "-" + _getFullFormat(Integer.toString(DATE)) + " " + _getFullFormat(Integer.toString(HOUR_OF_DAY)) + ":" + _getFullFormat(Integer.toString(MINUTE)) + ":" + _getFullFormat(Integer.toString(SECOND));
        if (_offset == -420) {
            return value;
        } else {
            return genTimeZoneThai(value);
        }
    }
    public String genTimeZoneThai(String datetime) {
        int _offset = getCurrentTimezoneOffset();
        if (_offset == -420)
            return datetime;
        String[] d = datetime.split(" ");
        String[] date = d[0].split("-");
        String[] time = d[1].split(":");
        if (_offset >= 0) {
            int minutes = 420 + _offset;
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
            cal.set(Calendar.DATE, Integer.parseInt(date[2]));
            cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
            cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
            cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
            cal.add(Calendar.MINUTE, minutes);
            String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
            String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
            String _y = Integer.toString(cal.get(Calendar.YEAR));
            String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
            String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
            String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
            return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
        } else if (_offset < 0) {
            if (_offset > -420) {
                int minutes = 420 - (_offset * -1);
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
                cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
                cal.set(Calendar.DATE, Integer.parseInt(date[2]));
                cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
                cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
                cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
                cal.add(Calendar.MINUTE, minutes);
                String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
                String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
                String _y = Integer.toString(cal.get(Calendar.YEAR));
                String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
                String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
                String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
                return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
            } else {
                int minutes = (_offset * -1) - 420;
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, Integer.parseInt(date[0]));
                cal.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
                cal.set(Calendar.DATE, Integer.parseInt(date[2]));
                cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
                cal.set(Calendar.MINUTE, Integer.parseInt(time[1]));
                cal.set(Calendar.SECOND, Integer.parseInt(time[2]));
                cal.add(Calendar.MINUTE, -minutes);
                String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
                String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
                String _y = Integer.toString(cal.get(Calendar.YEAR));
                String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
                String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
                String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
                return _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
            }
        }
        return datetime;
    }
    public String[] getDateTimeZoneMessage(String date){
        String[] _date = new String[2];
        int _offset = getCurrentTimezoneOffset();
        if (_offset == -420){
            _date[0] = date+" 00:00:00";
            _date[1] = date+" 23:59:59";
        }else if (_offset >= 0) {
            int minutes = 420 + _offset;
            String[] _d1 = date.split("-");
            Calendar cal = getCalendar(_d1[0], _d1[1], _d1[2], "00", "00", "00", minutes);
            _date[0] = getCalendarDate(cal);
            Calendar cal2 = getCalendar(_d1[0], _d1[1], _d1[2], "23", "59", "59", minutes);
            _date[1] = getCalendarDate(cal2);

        } else if (_offset > -420) {
            int minutes = 420 - (_offset * -1);
            String[] _d1 = date.split("-");
            Calendar cal = getCalendar(_d1[0], _d1[1], _d1[2], "00", "00", "00", minutes);
            _date[0] = getCalendarDate(cal);
            Calendar cal2 = getCalendar(_d1[0], _d1[1], _d1[2], "23", "59", "59", minutes);
            _date[1] = getCalendarDate(cal2);
        } else {
            int minutes = (_offset * -1) - 420;
            String[] _d1 = date.split("-");
            Calendar cal = getCalendar(_d1[0], _d1[1], _d1[2], "00", "00", "00", -minutes);
            _date[0] = getCalendarDate(cal);
            Calendar cal2 = getCalendar(_d1[0], _d1[1], _d1[2], "23", "59", "59", -minutes);
            _date[1] = getCalendarDate(cal2);
        }

        return _date;
    }
    public String getCalendarDate(Calendar cal){
        String _d = _getFullFormat(Integer.toString(cal.get(Calendar.DATE)));
        String _m = _getFullFormat(Integer.toString((cal.get(Calendar.MONTH) + 1)));
        String _y = Integer.toString(cal.get(Calendar.YEAR));
        String _h = _getFullFormat(Integer.toString(cal.get(Calendar.HOUR_OF_DAY)));
        String _m2 = _getFullFormat(Integer.toString(cal.get(Calendar.MINUTE)));
        String _s = _getFullFormat(Integer.toString(cal.get(Calendar.SECOND)));
        return  _y + "-" + _m + "-" + _d + " " + _h + ":" + _m2 + ":" + _s;
    }
    public Calendar getCalendar(String year,String month,String date,String hour,String minute,String second,int minutes){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(date));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour));
        cal.set(Calendar.MINUTE, Integer.parseInt(minute));
        cal.set(Calendar.SECOND, Integer.parseInt(second));
        cal.add(Calendar.MINUTE, minutes);
        return cal;
    }
}
