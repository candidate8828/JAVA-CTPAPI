/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcMarketDataUpdateTimeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataUpdateTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataUpdateTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcMarketDataUpdateTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return thosttradeapiJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataUpdateTimeField() {
    this(thosttradeapiJNI.new_CThostFtdcMarketDataUpdateTimeField(), true);
  }

}
