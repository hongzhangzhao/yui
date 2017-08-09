package Generics;

/**
 * 15.15.2
 *
 *
*/

import java.util.*;

interface TimeStamped{
    long getStamp();
}
class TimeStampedImp implements TimeStamped {

    public long getStamp(){
        return new Date().getTime();

    }
}

interface SerialNumbered {
    long getSerialNumber();
}
class SerialNumberedImp implements SerialNumbered {

   public long getSerialNumber(){
        return 100L;
    }
}

interface Basic {
    void set (String val);
    String get();

}

class BasicImp implements Basic {
    private String value;
    public void set(String val){
        value = val;
    }
    public String get(){
        return value;
    }
}

class Mixin extends BasicImp implements SerialNumbered,TimeStamped {
    TimeStamped time = new TimeStampedImp();
    SerialNumbered serial = new SerialNumberedImp();

    public long getStamp(){ return time.getStamp(); }
    public long getSerialNumber(){ return serial.getSerialNumber(); }


}