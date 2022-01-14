package com.solvd.socialNetwork.utils.dateAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeZoneAdapter extends XmlAdapter<String, Date> {
        private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a, z");
    @Override
    public Date unmarshal(String v) throws Exception {
        return simpleDateFormat.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return simpleDateFormat.format(v);
    }
}
