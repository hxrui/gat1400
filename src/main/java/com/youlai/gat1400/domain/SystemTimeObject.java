package com.youlai.gat1400.domain;

import lombok.Data;

@Data
public class SystemTimeObject {

    private SystemTime SystemTime;

    @Data
    public class SystemTime{
        private String VIIDServerID;
        private String TimeMode;
        private String LocalTime;

        private String TimeZone;
    }

}
