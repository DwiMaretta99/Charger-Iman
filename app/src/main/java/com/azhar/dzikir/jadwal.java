package com.azhar.dzikir;

public class jadwal {
    public String mSholat;
    private String mDate;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public jadwal(String sholat, long timeInMilliseconds, String url) {
       mSholat = sholat;
       mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public String getSholat(){
        return mSholat;
    }
    /**
     * Kembalikan URL situs web untuk mencari informasi tentang gempa.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
